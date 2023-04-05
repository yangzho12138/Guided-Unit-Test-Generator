<h1>UIUC CS527</h1>
<h2>Guided Unit Test Generation</h2>

<h3>Overview</h3>
<p>This is a guided unit test generation tool for Java programs based on Java Parse</p>

<h3>How to run the tool</h3>
<p>Please find the Application.java file in src/main/java/edu/illinois/cs/test</p>
<p>Run the Application.java file</p>
<p>Attention: remember to change the address of the target class you want to generate its tests</p>

```java
PoolInit pool = new PoolInit("target class address (e.g. src/main/java/edu/illinois/cs/test/)");
TestGenerator tg = new TestGenerator("target class address (e.g. src/main/java/edu/illinois/cs/test/)");
```

<p>We still have some bugs in this tool, so some tests in your generated file may cannot being executed, we will spare no effort to fix them</p>
<p>The tool mainly focuses on Jsoup project, so it may have some other undesired bugs when you try to run it on other projects</p>
<p>We may build a command in the terminal command line to run the tool in the final version</p>
<p>For more information, please see the report</p>