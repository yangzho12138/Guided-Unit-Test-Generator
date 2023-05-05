<h2>Guided Unit Test Generation</h2>

<h3>Overview</h3>
<p>This is a guided unit test generation tool for Java programs based on JavaParser</p>

<h3>Structure</h3>
<p>You can find the value pool initialization process in src/main/java/edu/illinois/cs/test/generator/PoolInit.java file</p>
<p>You can find the test generation process in src/main/java/edu/illinois/cs/test/generator/TestGenerator.java file</p>

<h3>How to run the tool</h3>
<p>Please find the Application.java file in src/main/java/edu/illinois/cs/test</p>
<p>Run the Application.java file</p>
<p>Attention: remember to change the address of the target folder you want to generate its tests</p>

<p>If you want to see the code coverage report by Clover, please check the Clover branch. To check the coverage report, use the following command: </p>

```
$ mvn clean clover:setup test clover:aggregate clover:clover
```
<p>The report is the <b>index.html</b> under the target/site/clover directory. </p>


```java
PoolInit pool = new PoolInit("target class address (e.g. src/main/java/edu/illinois/cs/test/)");
TestGenerator tg = new TestGenerator("target class address (e.g. src/main/java/edu/illinois/cs/test/)");
```
<p>Attention: You can also modify this function to target a specific class</p>

```java
public void MethodTraverse(String target) {
        Path sourcePath = Paths.get(target);
        SourceRoot sourceRoot = new SourceRoot(sourcePath);

        try {
            Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            CompilationUnit cu = parse(path.toFile());
                            visit(cu, null);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```
<p>For instance, if you want to generate tests for Entities class, you can change ".java" to the filename of the class</p>

<p>The tool mainly focuses on Jsoup project, so it may have some other undesired bugs when you try to run it on other projects</p>
<p>For more information, please see the report</p>
