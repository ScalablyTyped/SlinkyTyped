package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageServiceShim extends IShim {
  var languageService: ILanguageService = js.native
  def cleanupSemanticCache(): Unit = js.native
  def getBraceMatchingAtPosition(fileName: String, position: Double): String = js.native
  def getBreakpointStatementAtPosition(fileName: String, position: Double): String = js.native
  def getCompilerOptionsDiagnostics(): String = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): String = js.native
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): String = js.native
  def getDefinitionAtPosition(fileName: String, position: Double): String = js.native
  def getEmitOutput(fileName: String): String = js.native
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: String): String = js.native
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: String): String = js.native
  def getImplementorsAtPosition(fileName: String, position: Double): String = js.native
  def getIndentationAtPosition(fileName: String, position: Double, options: String): String = js.native
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): String = js.native
  def getNavigateToItems(searchValue: String): String = js.native
  def getOccurrencesAtPosition(fileName: String, position: Double): String = js.native
  def getOutliningRegions(fileName: String): String = js.native
  def getReferencesAtPosition(fileName: String, position: Double): String = js.native
  def getScriptLexicalStructure(fileName: String): String = js.native
  def getSemanticDiagnostics(fileName: String): String = js.native
  def getSignatureAtPosition(fileName: String, position: Double): String = js.native
  def getSyntacticDiagnostics(fileName: String): String = js.native
  def getTypeAtPosition(fileName: String, position: Double): String = js.native
  def refresh(throwOnError: Boolean): Unit = js.native
}

object ILanguageServiceShim {
  @scala.inline
  def apply(
    cleanupSemanticCache: () => Unit,
    dispose: js.Any => Unit,
    getBraceMatchingAtPosition: (String, Double) => String,
    getBreakpointStatementAtPosition: (String, Double) => String,
    getCompilerOptionsDiagnostics: () => String,
    getCompletionEntryDetails: (String, Double, String) => String,
    getCompletionsAtPosition: (String, Double, Boolean) => String,
    getDefinitionAtPosition: (String, Double) => String,
    getEmitOutput: String => String,
    getFormattingEditsAfterKeystroke: (String, Double, String, String) => String,
    getFormattingEditsForDocument: (String, Double, Double, String) => String,
    getFormattingEditsForRange: (String, Double, Double, String) => String,
    getFormattingEditsOnPaste: (String, Double, Double, String) => String,
    getImplementorsAtPosition: (String, Double) => String,
    getIndentationAtPosition: (String, Double, String) => String,
    getNameOrDottedNameSpan: (String, Double, Double) => String,
    getNavigateToItems: String => String,
    getOccurrencesAtPosition: (String, Double) => String,
    getOutliningRegions: String => String,
    getReferencesAtPosition: (String, Double) => String,
    getScriptLexicalStructure: String => String,
    getSemanticDiagnostics: String => String,
    getSignatureAtPosition: (String, Double) => String,
    getSyntacticDiagnostics: String => String,
    getTypeAtPosition: (String, Double) => String,
    languageService: ILanguageService,
    refresh: Boolean => Unit
  ): ILanguageServiceShim = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), dispose = js.Any.fromFunction1(dispose), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), languageService = languageService.asInstanceOf[js.Any], refresh = js.Any.fromFunction1(refresh))
    __obj.asInstanceOf[ILanguageServiceShim]
  }
  @scala.inline
  implicit class ILanguageServiceShimOps[Self <: ILanguageServiceShim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanupSemanticCache(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanupSemanticCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBraceMatchingAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBraceMatchingAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBreakpointStatementAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBreakpointStatementAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCompilerOptionsDiagnostics(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilerOptionsDiagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCompletionEntryDetails(value: (String, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletionEntryDetails")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCompletionsAtPosition(value: (String, Double, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletionsAtPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetDefinitionAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefinitionAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetEmitOutput(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmitOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsAfterKeystroke(value: (String, Double, String, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsAfterKeystroke")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsForDocument(value: (String, Double, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsForDocument")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsForRange(value: (String, Double, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsForRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsOnPaste(value: (String, Double, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsOnPaste")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetImplementorsAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplementorsAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIndentationAtPosition(value: (String, Double, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndentationAtPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNameOrDottedNameSpan(value: (String, Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNameOrDottedNameSpan")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNavigateToItems(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigateToItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOccurrencesAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOccurrencesAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetOutliningRegions(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutliningRegions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetReferencesAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferencesAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetScriptLexicalStructure(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptLexicalStructure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSemanticDiagnostics(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSemanticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSignatureAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignatureAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSyntacticDiagnostics(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyntacticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTypeAtPosition(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLanguageService(value: ILanguageService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

