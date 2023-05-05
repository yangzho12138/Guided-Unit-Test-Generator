var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":3784,"methods":[{"el":13,"sc":5,"sl":11},{"el":18,"sc":5,"sl":15},{"el":27,"sc":5,"sl":24},{"el":34,"sc":5,"sl":29},{"el":43,"sc":5,"sl":36}],"name":"CDataNode","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1226":{"methods":[{"sl":11},{"sl":15}],"name":"handleLargeCdata","pass":true,"statements":[{"sl":12},{"sl":17}]},"test_1340":{"methods":[{"sl":11}],"name":"handlesUnclosedCdataAtEOF","pass":true,"statements":[{"sl":12}]},"test_1348":{"methods":[{"sl":11},{"sl":15},{"sl":24}],"name":"test0417","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26}]},"test_1613":{"methods":[{"sl":11}],"name":"test0966","pass":true,"statements":[{"sl":12}]},"test_199":{"methods":[{"sl":11},{"sl":15},{"sl":24},{"sl":29},{"sl":36}],"name":"roundTripsCdata","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26},{"sl":31},{"sl":38},{"sl":39}]},"test_270":{"methods":[{"sl":11},{"sl":15},{"sl":29},{"sl":36}],"name":"handleCDataInText","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":31},{"sl":38},{"sl":39}]},"test_36":{"methods":[{"sl":11}],"name":"test0005","pass":true,"statements":[{"sl":12}]},"test_421":{"methods":[{"sl":11},{"sl":15},{"sl":24},{"sl":29},{"sl":36}],"name":"roundTripsCdata","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26},{"sl":31},{"sl":38},{"sl":39}]},"test_448":{"methods":[{"sl":11},{"sl":15},{"sl":24}],"name":"test0894","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26}]},"test_502":{"methods":[{"sl":11},{"sl":15}],"name":"handlesCdata","pass":true,"statements":[{"sl":12},{"sl":17}]},"test_636":{"methods":[{"sl":11}],"name":"test0512","pass":true,"statements":[{"sl":12}]},"test_65":{"methods":[{"sl":11},{"sl":15},{"sl":24}],"name":"handlesCdataAcrossBuffer","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26}]},"test_845":{"methods":[{"sl":11},{"sl":15},{"sl":29},{"sl":36}],"name":"cdataPreservesWhiteSpace","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":31},{"sl":38},{"sl":39}]},"test_892":{"methods":[{"sl":11},{"sl":15}],"name":"test0903","pass":true,"statements":[{"sl":12},{"sl":17}]},"test_925":{"methods":[{"sl":11},{"sl":15},{"sl":24}],"name":"cdataNodesAreTextNodes","pass":true,"statements":[{"sl":12},{"sl":17},{"sl":26}]},"test_981":{"methods":[{"sl":11}],"name":"test0737","pass":true,"statements":[{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [421, 448, 892, 845, 270, 1613, 199, 1348, 636, 36, 1226, 1340, 502, 981, 925, 65], [421, 448, 892, 845, 270, 1613, 199, 1348, 636, 36, 1226, 1340, 502, 981, 925, 65], [], [], [421, 448, 892, 845, 270, 199, 1348, 1226, 502, 925, 65], [], [421, 448, 892, 845, 270, 199, 1348, 1226, 502, 925, 65], [], [], [], [], [], [], [421, 448, 199, 1348, 925, 65], [], [421, 448, 199, 1348, 925, 65], [], [], [421, 845, 270, 199], [], [421, 845, 270, 199], [], [], [], [], [421, 845, 270, 199], [], [421, 845, 270, 199], [421, 845, 270, 199], [], [], [], [], []]
