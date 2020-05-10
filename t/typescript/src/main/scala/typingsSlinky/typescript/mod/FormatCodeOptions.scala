package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatCodeOptions extends EditorOptions {
  var InsertSpaceAfterCommaDelimiter: Boolean = js.native
  var InsertSpaceAfterConstructor: js.UndefOr[Boolean] = js.native
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean = js.native
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Boolean = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Boolean = js.native
  var InsertSpaceAfterSemicolonInForStatements: Boolean = js.native
  var InsertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.native
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean = js.native
  var InsertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.native
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean = js.native
  var PlaceOpenBraceOnNewLineForFunctions: Boolean = js.native
  var insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.native
}

object FormatCodeOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    InsertSpaceAfterCommaDelimiter: Boolean,
    InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean,
    InsertSpaceAfterKeywordsInControlFlowStatements: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Boolean,
    InsertSpaceAfterSemicolonInForStatements: Boolean,
    InsertSpaceBeforeAndAfterBinaryOperators: Boolean,
    NewLineCharacter: java.lang.String,
    PlaceOpenBraceOnNewLineForControlBlocks: Boolean,
    PlaceOpenBraceOnNewLineForFunctions: Boolean,
    TabSize: Double
  ): FormatCodeOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter.asInstanceOf[js.Any], InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions.asInstanceOf[js.Any], InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets = InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces = InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces.asInstanceOf[js.Any], InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements.asInstanceOf[js.Any], InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCodeOptions]
  }
  @scala.inline
  implicit class FormatCodeOptionsOps[Self <: FormatCodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsertSpaceAfterCommaDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterCommaDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterFunctionKeywordForAnonymousFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterKeywordsInControlFlowStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterSemicolonInForStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceBeforeAndAfterBinaryOperators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaceOpenBraceOnNewLineForControlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaceOpenBraceOnNewLineForFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertSpaceAfterConstructor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterTypeAssertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterTypeAssertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterTypeAssertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterTypeAssertion")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceBeforeFunctionParenthesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceBeforeFunctionParenthesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceBeforeFunctionParenthesis")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceBeforeTypeAnnotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeTypeAnnotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceBeforeTypeAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeTypeAnnotation")(js.undefined)
        ret
    }
  }
  
}

