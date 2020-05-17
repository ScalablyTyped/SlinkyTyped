package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatCodeOptions extends EditorOptions {
  var InsertSpaceAfterCommaDelimiter: Boolean = js.native
  var InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean = js.native
  var InsertSpaceAfterKeywordsInControlFlowStatements: Boolean = js.native
  var InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean = js.native
  var InsertSpaceAfterSemicolonInForStatements: Boolean = js.native
  var InsertSpaceBeforeAndAfterBinaryOperators: Boolean = js.native
  var PlaceOpenBraceOnNewLineForControlBlocks: Boolean = js.native
  var PlaceOpenBraceOnNewLineForFunctions: Boolean = js.native
}

object FormatCodeOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    InsertSpaceAfterCommaDelimiter: Boolean,
    InsertSpaceAfterFunctionKeywordForAnonymousFunctions: Boolean,
    InsertSpaceAfterKeywordsInControlFlowStatements: Boolean,
    InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis: Boolean,
    InsertSpaceAfterSemicolonInForStatements: Boolean,
    InsertSpaceBeforeAndAfterBinaryOperators: Boolean,
    NewLineCharacter: String,
    PlaceOpenBraceOnNewLineForControlBlocks: Boolean,
    PlaceOpenBraceOnNewLineForFunctions: Boolean,
    TabSize: Double
  ): FormatCodeOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], InsertSpaceAfterCommaDelimiter = InsertSpaceAfterCommaDelimiter.asInstanceOf[js.Any], InsertSpaceAfterFunctionKeywordForAnonymousFunctions = InsertSpaceAfterFunctionKeywordForAnonymousFunctions.asInstanceOf[js.Any], InsertSpaceAfterKeywordsInControlFlowStatements = InsertSpaceAfterKeywordsInControlFlowStatements.asInstanceOf[js.Any], InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis = InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis.asInstanceOf[js.Any], InsertSpaceAfterSemicolonInForStatements = InsertSpaceAfterSemicolonInForStatements.asInstanceOf[js.Any], InsertSpaceBeforeAndAfterBinaryOperators = InsertSpaceBeforeAndAfterBinaryOperators.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForControlBlocks = PlaceOpenBraceOnNewLineForControlBlocks.asInstanceOf[js.Any], PlaceOpenBraceOnNewLineForFunctions = PlaceOpenBraceOnNewLineForFunctions.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
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
    def withInsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis")(value.asInstanceOf[js.Any])
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
  }
  
}

