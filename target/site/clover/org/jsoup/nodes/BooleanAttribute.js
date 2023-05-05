var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3780,"methods":[{"el":14,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16}],"name":"BooleanAttribute","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_433":{"methods":[{"sl":12}],"name":"testByAttributeStarting","pass":true,"statements":[{"sl":13}]},"test_495":{"methods":[{"sl":12}],"name":"parsesBooleanAttributes","pass":true,"statements":[{"sl":13}]},"test_727":{"methods":[{"sl":12}],"name":"testAddBooleanAttribute","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [495, 433, 727], [495, 433, 727], [], [], [], [], [], [], []]
