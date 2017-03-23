package com.intellij.flex;

import com.intellij.flex.completion.ActionScriptCompletionInTextFieldTest;
import com.intellij.flex.completion.ActionScriptCompletionTest;
import com.intellij.flex.completion.FlexCompletionInUmlTextFieldsTest;
import com.intellij.flex.flexunit.codeInsight.FlexUnitCompletionTest;
import com.intellij.flex.flexunit.codeInsight.FlexUnitConfigurationTest;
import com.intellij.flex.flexunit.codeInsight.FlexUnitHighlightingTest;
import com.intellij.lang.javascript.*;
import com.intellij.flex.generate.ActionScriptGenerateTest;
import com.intellij.flex.imports.FlexAutoImportsTest;
import com.intellij.flex.imports.FlexOptimizeImportsTest;
import com.intellij.flex.refactoring.extractMethod.FlexExtractFunctionTest;
import com.intellij.flex.refactoring.inlineFunction.FlexInlineFunctionTest;
import com.intellij.flex.refactoring.inlineVariable.FlexInlineVariableTest;
import com.intellij.flex.refactoring.introduceConstant.FlexIntroduceConstantTest;
import com.intellij.flex.refactoring.introduceField.FlexIntroduceFieldTest;
import com.intellij.flex.refactoring.introduceVariable.ActionScriptInPlaceIntroduceVariableTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@SuppressWarnings({"JUnitTestClassNamingConvention", "JUnitTestCaseWithNoTests"})
public class FlexTestSuite extends TestCase {

  public static Test suite() {
    final TestSuite testSuite = new TestSuite(FlexTestSuite.class.getSimpleName());
    testSuite.addTestSuite(ActionScriptParsingTest.class);

    testSuite.addTestSuite(ActionScriptCompletionTest.class);
    testSuite.addTestSuite(ActionScriptHighlightingTest.class);
    testSuite.addTestSuite(ActionScriptResolveTest.class);
    testSuite.addTestSuite(FlexHighlightingTest.class);
    testSuite.addTestSuite(FlexCompletionTest.class);
    testSuite.addTestSuite(ActionScriptCompletionInTextFieldTest.class);
    testSuite.addTestSuite(ActionScriptHighlightingInTextFieldTest.class);
    testSuite.addTestSuite(SwfHighlightingTest.class);
    testSuite.addTestSuite(ActionScriptFormatterTest.class);

    testSuite.addTestSuite(FlexCssCompletionTest.class);
    testSuite.addTestSuite(FlexCssNavigationTest.class);

    testSuite.addTestSuite(FlexImporterTest.class);
    testSuite.addTestSuite(FlexProjectConfigTest.class);
    testSuite.addTestSuite(FlexScopeTest.class);
    testSuite.addTestSuite(FlexConversionTest.class);

    testSuite.addTestSuite(FlexHighlightingPerformanceTest.class);
    testSuite.addTestSuite(FlexAutoImportsTest.class);
    testSuite.addTestSuite(FlexOptimizeImportsTest.class);

    testSuite.addTestSuite(FlexUnitConfigurationTest.class);
    testSuite.addTestSuite(FlexUnitHighlightingTest.class);
    testSuite.addTestSuite(FlexUnitCompletionTest.class);

    testSuite.addTestSuite(GlobalFlexHighlightingTest.class);
    testSuite.addTestSuite(FlexColorAnnotatorTest.class);
    testSuite.addTestSuite(FlexProjectViewTest.class);
    testSuite.addTestSuite(FlexCompilerConfigTest.class);

    testSuite.addTestSuite(ActionScriptRearrangerTest.class);
    testSuite.addTestSuite(FlashBuilderImportTest.class);
    testSuite.addTestSuite(FlexStructureViewTest.class);
    testSuite.addTestSuite(FlexDocumentationTest.class);
    testSuite.addTestSuite(FlexLiveTemplatesTest.class);
    testSuite.addTestSuite(FlexFindUsagesTest.class);
    testSuite.addTestSuite(FlexChangeSignatureTest.class);

    testSuite.addTestSuite(FlexIntroduceConstantTest.class);
    testSuite.addTestSuite(FlexIntroduceFieldTest.class);
    testSuite.addTestSuite(FlexMoveInnerClassTest.class);
    testSuite.addTestSuite(FlexMoveMembersTest.class);
    testSuite.addTestSuite(FlexPullUpTest.class);
    testSuite.addTestSuite(FlexPushDownTest.class);
    testSuite.addTestSuite(FlexExtractSuperTest.class);
    testSuite.addTestSuite(FlexHierarchyTest.class);
    testSuite.addTestSuite(CreateASFunctionIntentionTest.class);
    testSuite.addTestSuite(CreateASVariableIntentionTest.class);
    testSuite.addTestSuite(FlexExtractFunctionTest.class);
    testSuite.addTestSuite(FlexEditorTest.class);
    testSuite.addTestSuite(FlexExtendSelectionTest.class);
    testSuite.addTestSuite(FlexRenameTest.class);
    testSuite.addTestSuite(FlexNavigationTest.class);
    testSuite.addTestSuite(FlexMoveTest.class);
    testSuite.addTestSuite(FlexConvertToLocalTest.class);
    testSuite.addTestSuite(FlexGotoImplementationsTest.class);
    testSuite.addTestSuite(FlexAutoPopupTest.class);
    testSuite.addTestSuite(FlexInlineFunctionTest.class);
    testSuite.addTestSuite(FlexInlineVariableTest.class);
    testSuite.addTestSuite(ActionScriptStubsTest.class);
    testSuite.addTestSuite(ActionScriptGenerateTest.class);
    testSuite.addTestSuite(FlashUmlTest.class);
    testSuite.addTestSuite(FlexCompletionInUmlTextFieldsTest.class);
    testSuite.addTestSuite(ActionScriptInPlaceIntroduceVariableTest.class);
    testSuite.addTestSuite(ActionScriptStatementMoverTest.class);

    return testSuite;
  }
}
