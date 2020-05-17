package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules
  extends /* name */ StringDictionary[js.Any] {
  var ControlOpenBraceLeftTokenRange: TokenRange = js.native
  var FunctionOpenBraceLeftTokenRange: TokenRange = js.native
  var HighPriorityCommonRules: js.Array[Rule] = js.native
  var IgnoreAfterLineComment: Rule = js.native
  var IgnoreBeforeComment: Rule = js.native
  var LowPriorityCommonRules: js.Array[Rule] = js.native
  var NewLineAfterOpenBraceInBlockContext: Rule = js.native
  var NewLineBeforeCloseBraceInBlockContext: Rule = js.native
  var NewLineBeforeOpenBraceInControl: Rule = js.native
  var NewLineBeforeOpenBraceInFunction: Rule = js.native
  var NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: Rule = js.native
  var NoSpaceAfterAnonymousFunctionKeyword: Rule = js.native
  var NoSpaceAfterBinaryOperator: Rule = js.native
  var NoSpaceAfterCloseAngularBracket: Rule = js.native
  var NoSpaceAfterCloseBrace: Rule = js.native
  var NoSpaceAfterCloseBracket: Rule = js.native
  var NoSpaceAfterComma: Rule = js.native
  var NoSpaceAfterConstructor: Rule = js.native
  var NoSpaceAfterDot: Rule = js.native
  var NoSpaceAfterEllipsis: Rule = js.native
  var NoSpaceAfterKeywordInControl: Rule = js.native
  var NoSpaceAfterModuleImport: Rule = js.native
  var NoSpaceAfterOpenAngularBracket: Rule = js.native
  var NoSpaceAfterOpenBracket: Rule = js.native
  var NoSpaceAfterOpenParen: Rule = js.native
  var NoSpaceAfterOptionalParameters: Rule = js.native
  var NoSpaceAfterSemicolonInFor: Rule = js.native
  var NoSpaceAfterUnaryPredecrementOperator: Rule = js.native
  var NoSpaceAfterUnaryPrefixOperator: Rule = js.native
  var NoSpaceAfterUnaryPreincrementOperator: Rule = js.native
  var NoSpaceBeforeBinaryOperator: Rule = js.native
  var NoSpaceBeforeCloseAngularBracket: Rule = js.native
  var NoSpaceBeforeCloseBracket: Rule = js.native
  var NoSpaceBeforeCloseParen: Rule = js.native
  var NoSpaceBeforeColon: Rule = js.native
  var NoSpaceBeforeComma: Rule = js.native
  var NoSpaceBeforeDot: Rule = js.native
  var NoSpaceBeforeOpenAngularBracket: Rule = js.native
  var NoSpaceBeforeOpenBracket: Rule = js.native
  var NoSpaceBeforeOpenParenInFuncCall: Rule = js.native
  var NoSpaceBeforeOpenParenInFuncDecl: Rule = js.native
  var NoSpaceBeforeQMark: Rule = js.native
  var NoSpaceBeforeSemicolon: Rule = js.native
  var NoSpaceBeforeUnaryPostdecrementOperator: Rule = js.native
  var NoSpaceBeforeUnaryPostincrementOperator: Rule = js.native
  var NoSpaceBetweenCloseParenAndAngularBracket: Rule = js.native
  var NoSpaceBetweenEmptyBraceBrackets: Rule = js.native
  var NoSpaceBetweenEmptyInterfaceBraceBrackets: Rule = js.native
  var NoSpaceBetweenParens: Rule = js.native
  var NoSpaceBetweenReturnAndSemicolon: Rule = js.native
  var SpaceAfterAddWhenFollowedByPreincrement: Rule = js.native
  var SpaceAfterAddWhenFollowedByUnaryPlus: Rule = js.native
  var SpaceAfterAnonymousFunctionKeyword: Rule = js.native
  var SpaceAfterArrow: Rule = js.native
  var SpaceAfterBinaryKeywordOperator: Rule = js.native
  var SpaceAfterBinaryOperator: Rule = js.native
  var SpaceAfterCertainKeywords: Rule = js.native
  var SpaceAfterCertainTypeScriptKeywords: Rule = js.native
  var SpaceAfterCloseBrace: Rule = js.native
  var SpaceAfterColon: Rule = js.native
  var SpaceAfterComma: Rule = js.native
  var SpaceAfterFunctionInFuncDecl: Rule = js.native
  var SpaceAfterGetSetInMember: Rule = js.native
  var SpaceAfterKeywordInControl: Rule = js.native
  var SpaceAfterModuleName: Rule = js.native
  var SpaceAfterOpenBrace: Rule = js.native
  var SpaceAfterOpenParen: Rule = js.native
  var SpaceAfterPostdecrementWhenFollowedBySubtract: Rule = js.native
  var SpaceAfterPostincrementWhenFollowedByAdd: Rule = js.native
  var SpaceAfterQMark: Rule = js.native
  var SpaceAfterSemicolon: Rule = js.native
  var SpaceAfterSemicolonInFor: Rule = js.native
  var SpaceAfterSubtractWhenFollowedByPredecrement: Rule = js.native
  var SpaceAfterSubtractWhenFollowedByUnaryMinus: Rule = js.native
  var SpaceAfterTryFinally: Rule = js.native
  var SpaceAfterVoidOperator: Rule = js.native
  var SpaceBeforeBinaryKeywordOperator: Rule = js.native
  var SpaceBeforeBinaryOperator: Rule = js.native
  var SpaceBeforeCertainTypeScriptKeywords: Rule = js.native
  var SpaceBeforeCloseBrace: Rule = js.native
  var SpaceBeforeCloseParen: Rule = js.native
  var SpaceBeforeOpenBraceInControl: Rule = js.native
  var SpaceBeforeOpenBraceInFunction: Rule = js.native
  var SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: Rule = js.native
  var SpaceBetweenCloseBraceAndElse: Rule = js.native
  var SpaceBetweenCloseBraceAndWhile: Rule = js.native
  var SpaceBetweenStatements: Rule = js.native
  var TypeScriptOpenBraceLeftTokenRange: TokenRange = js.native
  def getRuleName(rule: Rule): js.Any = js.native
}

object Rules {
  @scala.inline
  def apply(
    ControlOpenBraceLeftTokenRange: TokenRange,
    FunctionOpenBraceLeftTokenRange: TokenRange,
    HighPriorityCommonRules: js.Array[Rule],
    IgnoreAfterLineComment: Rule,
    IgnoreBeforeComment: Rule,
    LowPriorityCommonRules: js.Array[Rule],
    NewLineAfterOpenBraceInBlockContext: Rule,
    NewLineBeforeCloseBraceInBlockContext: Rule,
    NewLineBeforeOpenBraceInControl: Rule,
    NewLineBeforeOpenBraceInFunction: Rule,
    NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: Rule,
    NoSpaceAfterAnonymousFunctionKeyword: Rule,
    NoSpaceAfterBinaryOperator: Rule,
    NoSpaceAfterCloseAngularBracket: Rule,
    NoSpaceAfterCloseBrace: Rule,
    NoSpaceAfterCloseBracket: Rule,
    NoSpaceAfterComma: Rule,
    NoSpaceAfterConstructor: Rule,
    NoSpaceAfterDot: Rule,
    NoSpaceAfterEllipsis: Rule,
    NoSpaceAfterKeywordInControl: Rule,
    NoSpaceAfterModuleImport: Rule,
    NoSpaceAfterOpenAngularBracket: Rule,
    NoSpaceAfterOpenBracket: Rule,
    NoSpaceAfterOpenParen: Rule,
    NoSpaceAfterOptionalParameters: Rule,
    NoSpaceAfterSemicolonInFor: Rule,
    NoSpaceAfterUnaryPredecrementOperator: Rule,
    NoSpaceAfterUnaryPrefixOperator: Rule,
    NoSpaceAfterUnaryPreincrementOperator: Rule,
    NoSpaceBeforeBinaryOperator: Rule,
    NoSpaceBeforeCloseAngularBracket: Rule,
    NoSpaceBeforeCloseBracket: Rule,
    NoSpaceBeforeCloseParen: Rule,
    NoSpaceBeforeColon: Rule,
    NoSpaceBeforeComma: Rule,
    NoSpaceBeforeDot: Rule,
    NoSpaceBeforeOpenAngularBracket: Rule,
    NoSpaceBeforeOpenBracket: Rule,
    NoSpaceBeforeOpenParenInFuncCall: Rule,
    NoSpaceBeforeOpenParenInFuncDecl: Rule,
    NoSpaceBeforeQMark: Rule,
    NoSpaceBeforeSemicolon: Rule,
    NoSpaceBeforeUnaryPostdecrementOperator: Rule,
    NoSpaceBeforeUnaryPostincrementOperator: Rule,
    NoSpaceBetweenCloseParenAndAngularBracket: Rule,
    NoSpaceBetweenEmptyBraceBrackets: Rule,
    NoSpaceBetweenEmptyInterfaceBraceBrackets: Rule,
    NoSpaceBetweenParens: Rule,
    NoSpaceBetweenReturnAndSemicolon: Rule,
    SpaceAfterAddWhenFollowedByPreincrement: Rule,
    SpaceAfterAddWhenFollowedByUnaryPlus: Rule,
    SpaceAfterAnonymousFunctionKeyword: Rule,
    SpaceAfterArrow: Rule,
    SpaceAfterBinaryKeywordOperator: Rule,
    SpaceAfterBinaryOperator: Rule,
    SpaceAfterCertainKeywords: Rule,
    SpaceAfterCertainTypeScriptKeywords: Rule,
    SpaceAfterCloseBrace: Rule,
    SpaceAfterColon: Rule,
    SpaceAfterComma: Rule,
    SpaceAfterFunctionInFuncDecl: Rule,
    SpaceAfterGetSetInMember: Rule,
    SpaceAfterKeywordInControl: Rule,
    SpaceAfterModuleName: Rule,
    SpaceAfterOpenBrace: Rule,
    SpaceAfterOpenParen: Rule,
    SpaceAfterPostdecrementWhenFollowedBySubtract: Rule,
    SpaceAfterPostincrementWhenFollowedByAdd: Rule,
    SpaceAfterQMark: Rule,
    SpaceAfterSemicolon: Rule,
    SpaceAfterSemicolonInFor: Rule,
    SpaceAfterSubtractWhenFollowedByPredecrement: Rule,
    SpaceAfterSubtractWhenFollowedByUnaryMinus: Rule,
    SpaceAfterTryFinally: Rule,
    SpaceAfterVoidOperator: Rule,
    SpaceBeforeBinaryKeywordOperator: Rule,
    SpaceBeforeBinaryOperator: Rule,
    SpaceBeforeCertainTypeScriptKeywords: Rule,
    SpaceBeforeCloseBrace: Rule,
    SpaceBeforeCloseParen: Rule,
    SpaceBeforeOpenBraceInControl: Rule,
    SpaceBeforeOpenBraceInFunction: Rule,
    SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: Rule,
    SpaceBetweenCloseBraceAndElse: Rule,
    SpaceBetweenCloseBraceAndWhile: Rule,
    SpaceBetweenStatements: Rule,
    TypeScriptOpenBraceLeftTokenRange: TokenRange,
    getRuleName: Rule => js.Any
  ): Rules = {
    val __obj = js.Dynamic.literal(ControlOpenBraceLeftTokenRange = ControlOpenBraceLeftTokenRange.asInstanceOf[js.Any], FunctionOpenBraceLeftTokenRange = FunctionOpenBraceLeftTokenRange.asInstanceOf[js.Any], HighPriorityCommonRules = HighPriorityCommonRules.asInstanceOf[js.Any], IgnoreAfterLineComment = IgnoreAfterLineComment.asInstanceOf[js.Any], IgnoreBeforeComment = IgnoreBeforeComment.asInstanceOf[js.Any], LowPriorityCommonRules = LowPriorityCommonRules.asInstanceOf[js.Any], NewLineAfterOpenBraceInBlockContext = NewLineAfterOpenBraceInBlockContext.asInstanceOf[js.Any], NewLineBeforeCloseBraceInBlockContext = NewLineBeforeCloseBraceInBlockContext.asInstanceOf[js.Any], NewLineBeforeOpenBraceInControl = NewLineBeforeOpenBraceInControl.asInstanceOf[js.Any], NewLineBeforeOpenBraceInFunction = NewLineBeforeOpenBraceInFunction.asInstanceOf[js.Any], NewLineBeforeOpenBraceInTypeScriptDeclWithBlock = NewLineBeforeOpenBraceInTypeScriptDeclWithBlock.asInstanceOf[js.Any], NoSpaceAfterAnonymousFunctionKeyword = NoSpaceAfterAnonymousFunctionKeyword.asInstanceOf[js.Any], NoSpaceAfterBinaryOperator = NoSpaceAfterBinaryOperator.asInstanceOf[js.Any], NoSpaceAfterCloseAngularBracket = NoSpaceAfterCloseAngularBracket.asInstanceOf[js.Any], NoSpaceAfterCloseBrace = NoSpaceAfterCloseBrace.asInstanceOf[js.Any], NoSpaceAfterCloseBracket = NoSpaceAfterCloseBracket.asInstanceOf[js.Any], NoSpaceAfterComma = NoSpaceAfterComma.asInstanceOf[js.Any], NoSpaceAfterConstructor = NoSpaceAfterConstructor.asInstanceOf[js.Any], NoSpaceAfterDot = NoSpaceAfterDot.asInstanceOf[js.Any], NoSpaceAfterEllipsis = NoSpaceAfterEllipsis.asInstanceOf[js.Any], NoSpaceAfterKeywordInControl = NoSpaceAfterKeywordInControl.asInstanceOf[js.Any], NoSpaceAfterModuleImport = NoSpaceAfterModuleImport.asInstanceOf[js.Any], NoSpaceAfterOpenAngularBracket = NoSpaceAfterOpenAngularBracket.asInstanceOf[js.Any], NoSpaceAfterOpenBracket = NoSpaceAfterOpenBracket.asInstanceOf[js.Any], NoSpaceAfterOpenParen = NoSpaceAfterOpenParen.asInstanceOf[js.Any], NoSpaceAfterOptionalParameters = NoSpaceAfterOptionalParameters.asInstanceOf[js.Any], NoSpaceAfterSemicolonInFor = NoSpaceAfterSemicolonInFor.asInstanceOf[js.Any], NoSpaceAfterUnaryPredecrementOperator = NoSpaceAfterUnaryPredecrementOperator.asInstanceOf[js.Any], NoSpaceAfterUnaryPrefixOperator = NoSpaceAfterUnaryPrefixOperator.asInstanceOf[js.Any], NoSpaceAfterUnaryPreincrementOperator = NoSpaceAfterUnaryPreincrementOperator.asInstanceOf[js.Any], NoSpaceBeforeBinaryOperator = NoSpaceBeforeBinaryOperator.asInstanceOf[js.Any], NoSpaceBeforeCloseAngularBracket = NoSpaceBeforeCloseAngularBracket.asInstanceOf[js.Any], NoSpaceBeforeCloseBracket = NoSpaceBeforeCloseBracket.asInstanceOf[js.Any], NoSpaceBeforeCloseParen = NoSpaceBeforeCloseParen.asInstanceOf[js.Any], NoSpaceBeforeColon = NoSpaceBeforeColon.asInstanceOf[js.Any], NoSpaceBeforeComma = NoSpaceBeforeComma.asInstanceOf[js.Any], NoSpaceBeforeDot = NoSpaceBeforeDot.asInstanceOf[js.Any], NoSpaceBeforeOpenAngularBracket = NoSpaceBeforeOpenAngularBracket.asInstanceOf[js.Any], NoSpaceBeforeOpenBracket = NoSpaceBeforeOpenBracket.asInstanceOf[js.Any], NoSpaceBeforeOpenParenInFuncCall = NoSpaceBeforeOpenParenInFuncCall.asInstanceOf[js.Any], NoSpaceBeforeOpenParenInFuncDecl = NoSpaceBeforeOpenParenInFuncDecl.asInstanceOf[js.Any], NoSpaceBeforeQMark = NoSpaceBeforeQMark.asInstanceOf[js.Any], NoSpaceBeforeSemicolon = NoSpaceBeforeSemicolon.asInstanceOf[js.Any], NoSpaceBeforeUnaryPostdecrementOperator = NoSpaceBeforeUnaryPostdecrementOperator.asInstanceOf[js.Any], NoSpaceBeforeUnaryPostincrementOperator = NoSpaceBeforeUnaryPostincrementOperator.asInstanceOf[js.Any], NoSpaceBetweenCloseParenAndAngularBracket = NoSpaceBetweenCloseParenAndAngularBracket.asInstanceOf[js.Any], NoSpaceBetweenEmptyBraceBrackets = NoSpaceBetweenEmptyBraceBrackets.asInstanceOf[js.Any], NoSpaceBetweenEmptyInterfaceBraceBrackets = NoSpaceBetweenEmptyInterfaceBraceBrackets.asInstanceOf[js.Any], NoSpaceBetweenParens = NoSpaceBetweenParens.asInstanceOf[js.Any], NoSpaceBetweenReturnAndSemicolon = NoSpaceBetweenReturnAndSemicolon.asInstanceOf[js.Any], SpaceAfterAddWhenFollowedByPreincrement = SpaceAfterAddWhenFollowedByPreincrement.asInstanceOf[js.Any], SpaceAfterAddWhenFollowedByUnaryPlus = SpaceAfterAddWhenFollowedByUnaryPlus.asInstanceOf[js.Any], SpaceAfterAnonymousFunctionKeyword = SpaceAfterAnonymousFunctionKeyword.asInstanceOf[js.Any], SpaceAfterArrow = SpaceAfterArrow.asInstanceOf[js.Any], SpaceAfterBinaryKeywordOperator = SpaceAfterBinaryKeywordOperator.asInstanceOf[js.Any], SpaceAfterBinaryOperator = SpaceAfterBinaryOperator.asInstanceOf[js.Any], SpaceAfterCertainKeywords = SpaceAfterCertainKeywords.asInstanceOf[js.Any], SpaceAfterCertainTypeScriptKeywords = SpaceAfterCertainTypeScriptKeywords.asInstanceOf[js.Any], SpaceAfterCloseBrace = SpaceAfterCloseBrace.asInstanceOf[js.Any], SpaceAfterColon = SpaceAfterColon.asInstanceOf[js.Any], SpaceAfterComma = SpaceAfterComma.asInstanceOf[js.Any], SpaceAfterFunctionInFuncDecl = SpaceAfterFunctionInFuncDecl.asInstanceOf[js.Any], SpaceAfterGetSetInMember = SpaceAfterGetSetInMember.asInstanceOf[js.Any], SpaceAfterKeywordInControl = SpaceAfterKeywordInControl.asInstanceOf[js.Any], SpaceAfterModuleName = SpaceAfterModuleName.asInstanceOf[js.Any], SpaceAfterOpenBrace = SpaceAfterOpenBrace.asInstanceOf[js.Any], SpaceAfterOpenParen = SpaceAfterOpenParen.asInstanceOf[js.Any], SpaceAfterPostdecrementWhenFollowedBySubtract = SpaceAfterPostdecrementWhenFollowedBySubtract.asInstanceOf[js.Any], SpaceAfterPostincrementWhenFollowedByAdd = SpaceAfterPostincrementWhenFollowedByAdd.asInstanceOf[js.Any], SpaceAfterQMark = SpaceAfterQMark.asInstanceOf[js.Any], SpaceAfterSemicolon = SpaceAfterSemicolon.asInstanceOf[js.Any], SpaceAfterSemicolonInFor = SpaceAfterSemicolonInFor.asInstanceOf[js.Any], SpaceAfterSubtractWhenFollowedByPredecrement = SpaceAfterSubtractWhenFollowedByPredecrement.asInstanceOf[js.Any], SpaceAfterSubtractWhenFollowedByUnaryMinus = SpaceAfterSubtractWhenFollowedByUnaryMinus.asInstanceOf[js.Any], SpaceAfterTryFinally = SpaceAfterTryFinally.asInstanceOf[js.Any], SpaceAfterVoidOperator = SpaceAfterVoidOperator.asInstanceOf[js.Any], SpaceBeforeBinaryKeywordOperator = SpaceBeforeBinaryKeywordOperator.asInstanceOf[js.Any], SpaceBeforeBinaryOperator = SpaceBeforeBinaryOperator.asInstanceOf[js.Any], SpaceBeforeCertainTypeScriptKeywords = SpaceBeforeCertainTypeScriptKeywords.asInstanceOf[js.Any], SpaceBeforeCloseBrace = SpaceBeforeCloseBrace.asInstanceOf[js.Any], SpaceBeforeCloseParen = SpaceBeforeCloseParen.asInstanceOf[js.Any], SpaceBeforeOpenBraceInControl = SpaceBeforeOpenBraceInControl.asInstanceOf[js.Any], SpaceBeforeOpenBraceInFunction = SpaceBeforeOpenBraceInFunction.asInstanceOf[js.Any], SpaceBeforeOpenBraceInTypeScriptDeclWithBlock = SpaceBeforeOpenBraceInTypeScriptDeclWithBlock.asInstanceOf[js.Any], SpaceBetweenCloseBraceAndElse = SpaceBetweenCloseBraceAndElse.asInstanceOf[js.Any], SpaceBetweenCloseBraceAndWhile = SpaceBetweenCloseBraceAndWhile.asInstanceOf[js.Any], SpaceBetweenStatements = SpaceBetweenStatements.asInstanceOf[js.Any], TypeScriptOpenBraceLeftTokenRange = TypeScriptOpenBraceLeftTokenRange.asInstanceOf[js.Any], getRuleName = js.Any.fromFunction1(getRuleName))
    __obj.asInstanceOf[Rules]
  }
  @scala.inline
  implicit class RulesOps[Self <: Rules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlOpenBraceLeftTokenRange(value: TokenRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlOpenBraceLeftTokenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionOpenBraceLeftTokenRange(value: TokenRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionOpenBraceLeftTokenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighPriorityCommonRules(value: js.Array[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighPriorityCommonRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreAfterLineComment(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreAfterLineComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreBeforeComment(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreBeforeComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowPriorityCommonRules(value: js.Array[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowPriorityCommonRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineAfterOpenBraceInBlockContext(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineAfterOpenBraceInBlockContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineBeforeCloseBraceInBlockContext(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineBeforeCloseBraceInBlockContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineBeforeOpenBraceInControl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineBeforeOpenBraceInControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineBeforeOpenBraceInFunction(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineBeforeOpenBraceInFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLineBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewLineBeforeOpenBraceInTypeScriptDeclWithBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterAnonymousFunctionKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterBinaryOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterBinaryOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterCloseAngularBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterCloseAngularBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterCloseBrace(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterCloseBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterCloseBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterCloseBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterComma(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterConstructor(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterDot(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterEllipsis(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterEllipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterKeywordInControl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterKeywordInControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterModuleImport(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterModuleImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterOpenAngularBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterOpenAngularBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterOpenBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterOpenBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterOpenParen(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterOpenParen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterOptionalParameters(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterOptionalParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterSemicolonInFor(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterSemicolonInFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterUnaryPredecrementOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterUnaryPredecrementOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterUnaryPrefixOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterUnaryPrefixOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceAfterUnaryPreincrementOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceAfterUnaryPreincrementOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeBinaryOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeBinaryOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeCloseAngularBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeCloseAngularBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeCloseBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeCloseBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeCloseParen(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeCloseParen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeColon(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeColon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeComma(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeDot(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeOpenAngularBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeOpenAngularBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeOpenBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeOpenBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeOpenParenInFuncCall(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeOpenParenInFuncCall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeOpenParenInFuncDecl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeOpenParenInFuncDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeQMark(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeQMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeSemicolon(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeSemicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeUnaryPostdecrementOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeUnaryPostdecrementOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBeforeUnaryPostincrementOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBeforeUnaryPostincrementOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBetweenCloseParenAndAngularBracket(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBetweenCloseParenAndAngularBracket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBetweenEmptyBraceBrackets(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBetweenEmptyBraceBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBetweenEmptyInterfaceBraceBrackets(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBetweenEmptyInterfaceBraceBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBetweenParens(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBetweenParens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoSpaceBetweenReturnAndSemicolon(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSpaceBetweenReturnAndSemicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterAddWhenFollowedByPreincrement(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterAddWhenFollowedByPreincrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterAddWhenFollowedByUnaryPlus(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterAddWhenFollowedByUnaryPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterAnonymousFunctionKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterArrow(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterBinaryKeywordOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterBinaryKeywordOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterBinaryOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterBinaryOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterCertainKeywords(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterCertainKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterCertainTypeScriptKeywords(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterCertainTypeScriptKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterCloseBrace(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterCloseBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterColon(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterColon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterComma(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterFunctionInFuncDecl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterFunctionInFuncDecl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterGetSetInMember(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterGetSetInMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterKeywordInControl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterKeywordInControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterModuleName(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterModuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterOpenBrace(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterOpenBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterOpenParen(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterOpenParen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterPostdecrementWhenFollowedBySubtract(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterPostdecrementWhenFollowedBySubtract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterPostincrementWhenFollowedByAdd(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterPostincrementWhenFollowedByAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterQMark(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterQMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterSemicolon(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterSemicolon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterSemicolonInFor(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterSemicolonInFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterSubtractWhenFollowedByPredecrement(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterSubtractWhenFollowedByPredecrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterSubtractWhenFollowedByUnaryMinus(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterSubtractWhenFollowedByUnaryMinus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterTryFinally(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterTryFinally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceAfterVoidOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceAfterVoidOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeBinaryKeywordOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeBinaryKeywordOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeBinaryOperator(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeBinaryOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeCertainTypeScriptKeywords(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeCertainTypeScriptKeywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeCloseBrace(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeCloseBrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeCloseParen(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeCloseParen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeOpenBraceInControl(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeOpenBraceInControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeOpenBraceInFunction(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeOpenBraceInFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBeforeOpenBraceInTypeScriptDeclWithBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBetweenCloseBraceAndElse(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBetweenCloseBraceAndElse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBetweenCloseBraceAndWhile(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBetweenCloseBraceAndWhile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceBetweenStatements(value: Rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceBetweenStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeScriptOpenBraceLeftTokenRange(value: TokenRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TypeScriptOpenBraceLeftTokenRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetRuleName(value: Rule => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRuleName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

