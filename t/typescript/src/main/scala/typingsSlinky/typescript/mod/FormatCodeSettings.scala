package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatCodeSettings extends EditorSettings {
  val indentMultiLineObjectLiteralBeginningOnBlankLine: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterCommaDelimiter: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterConstructor: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterFunctionKeywordForAnonymousFunctions: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterKeywordsInControlFlowStatements: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterSemicolonInForStatements: js.UndefOr[Boolean] = js.native
  val insertSpaceAfterTypeAssertion: js.UndefOr[Boolean] = js.native
  val insertSpaceBeforeAndAfterBinaryOperators: js.UndefOr[Boolean] = js.native
  val insertSpaceBeforeFunctionParenthesis: js.UndefOr[Boolean] = js.native
  val insertSpaceBeforeTypeAnnotation: js.UndefOr[Boolean] = js.native
  val placeOpenBraceOnNewLineForControlBlocks: js.UndefOr[Boolean] = js.native
  val placeOpenBraceOnNewLineForFunctions: js.UndefOr[Boolean] = js.native
  val semicolons: js.UndefOr[SemicolonPreference] = js.native
}

object FormatCodeSettings {
  @scala.inline
  def apply(): FormatCodeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatCodeSettings]
  }
  @scala.inline
  implicit class FormatCodeSettingsOps[Self <: FormatCodeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndentMultiLineObjectLiteralBeginningOnBlankLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentMultiLineObjectLiteralBeginningOnBlankLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentMultiLineObjectLiteralBeginningOnBlankLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentMultiLineObjectLiteralBeginningOnBlankLine")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterCommaDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterCommaDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterCommaDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterCommaDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterConstructor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterConstructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterConstructor")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterFunctionKeywordForAnonymousFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterFunctionKeywordForAnonymousFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterFunctionKeywordForAnonymousFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterFunctionKeywordForAnonymousFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterKeywordsInControlFlowStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterKeywordsInControlFlowStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterKeywordsInControlFlowStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterKeywordsInControlFlowStatements")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterSemicolonInForStatements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterSemicolonInForStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterSemicolonInForStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterSemicolonInForStatements")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceAfterTypeAssertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterTypeAssertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceAfterTypeAssertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceAfterTypeAssertion")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceBeforeAndAfterBinaryOperators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeAndAfterBinaryOperators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceBeforeAndAfterBinaryOperators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeAndAfterBinaryOperators")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertSpaceBeforeFunctionParenthesis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeFunctionParenthesis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertSpaceBeforeFunctionParenthesis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertSpaceBeforeFunctionParenthesis")(js.undefined)
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
    @scala.inline
    def withPlaceOpenBraceOnNewLineForControlBlocks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeOpenBraceOnNewLineForControlBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceOpenBraceOnNewLineForControlBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeOpenBraceOnNewLineForControlBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceOpenBraceOnNewLineForFunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeOpenBraceOnNewLineForFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceOpenBraceOnNewLineForFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeOpenBraceOnNewLineForFunctions")(js.undefined)
        ret
    }
    @scala.inline
    def withSemicolons(value: SemicolonPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemicolons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semicolons")(js.undefined)
        ret
    }
  }
  
}

