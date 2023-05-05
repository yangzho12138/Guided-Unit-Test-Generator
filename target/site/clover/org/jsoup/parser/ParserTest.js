var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":40704,"methods":[{"el":13,"sc":5,"sl":9},{"el":24,"sc":5,"sl":15}],"name":"ParserTest","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1416":{"methods":[{"sl":15}],"name":"unescapeEntitiesHandlesLargeInput","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":22},{"sl":23}]},"test_1578":{"methods":[{"sl":9}],"name":"unescapeEntities","pass":true,"statements":[{"sl":11},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1578], [], [1578], [1578], [], [], [1416], [], [1416], [1416], [1416], [1416], [], [1416], [1416], [], []]
