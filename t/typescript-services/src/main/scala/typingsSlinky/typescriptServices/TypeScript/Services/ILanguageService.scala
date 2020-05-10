package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.Diagnostic
import typingsSlinky.typescriptServices.TypeScript.EmitOutput
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageService extends js.Object {
  def cleanupSemanticCache(): Unit = js.native
  def getBraceMatchingAtPosition(fileName: String, position: Double): js.Array[TextSpan] = js.native
  def getBreakpointStatementAtPosition(fileName: String, position: Double): SpanInfo = js.native
  def getCompilerOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  def getCompletionEntryDetails(fileName: String, position: Double, entryName: String): CompletionEntryDetails = js.native
  def getCompletionsAtPosition(fileName: String, position: Double, isMemberCompletion: Boolean): CompletionInfo = js.native
  def getDefinitionAtPosition(fileName: String, position: Double): js.Array[DefinitionInfo] = js.native
  def getEmitOutput(fileName: String): EmitOutput = js.native
  def getFormattingEditsAfterKeystroke(fileName: String, position: Double, key: String, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  def getFormattingEditsForDocument(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  def getFormattingEditsForRange(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  def getFormattingEditsOnPaste(fileName: String, minChar: Double, limChar: Double, options: FormatCodeOptions): js.Array[TextEdit] = js.native
  def getImplementorsAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  def getIndentationAtPosition(fileName: String, position: Double, options: EditorOptions): Double = js.native
  def getNameOrDottedNameSpan(fileName: String, startPos: Double, endPos: Double): SpanInfo = js.native
  def getNavigateToItems(searchValue: String): js.Array[NavigateToItem] = js.native
  def getOccurrencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  def getOutliningRegions(fileName: String): js.Array[TextSpan] = js.native
  def getReferencesAtPosition(fileName: String, position: Double): js.Array[ReferenceEntry] = js.native
  def getScriptLexicalStructure(fileName: String): js.Array[NavigateToItem] = js.native
  def getSemanticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getSignatureAtPosition(fileName: String, position: Double): SignatureInfo = js.native
  def getSyntacticDiagnostics(fileName: String): js.Array[Diagnostic] = js.native
  def getSyntaxTree(fileName: String): SyntaxTree = js.native
  def getTypeAtPosition(fileName: String, position: Double): TypeInfo = js.native
  def refresh(): Unit = js.native
}

object ILanguageService {
  @scala.inline
  def apply(
    cleanupSemanticCache: () => Unit,
    getBraceMatchingAtPosition: (String, Double) => js.Array[TextSpan],
    getBreakpointStatementAtPosition: (String, Double) => SpanInfo,
    getCompilerOptionsDiagnostics: () => js.Array[Diagnostic],
    getCompletionEntryDetails: (String, Double, String) => CompletionEntryDetails,
    getCompletionsAtPosition: (String, Double, Boolean) => CompletionInfo,
    getDefinitionAtPosition: (String, Double) => js.Array[DefinitionInfo],
    getEmitOutput: String => EmitOutput,
    getFormattingEditsAfterKeystroke: (String, Double, String, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForDocument: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsForRange: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getFormattingEditsOnPaste: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit],
    getImplementorsAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getIndentationAtPosition: (String, Double, EditorOptions) => Double,
    getNameOrDottedNameSpan: (String, Double, Double) => SpanInfo,
    getNavigateToItems: String => js.Array[NavigateToItem],
    getOccurrencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getOutliningRegions: String => js.Array[TextSpan],
    getReferencesAtPosition: (String, Double) => js.Array[ReferenceEntry],
    getScriptLexicalStructure: String => js.Array[NavigateToItem],
    getSemanticDiagnostics: String => js.Array[Diagnostic],
    getSignatureAtPosition: (String, Double) => SignatureInfo,
    getSyntacticDiagnostics: String => js.Array[Diagnostic],
    getSyntaxTree: String => SyntaxTree,
    getTypeAtPosition: (String, Double) => TypeInfo,
    refresh: () => Unit
  ): ILanguageService = {
    val __obj = js.Dynamic.literal(cleanupSemanticCache = js.Any.fromFunction0(cleanupSemanticCache), getBraceMatchingAtPosition = js.Any.fromFunction2(getBraceMatchingAtPosition), getBreakpointStatementAtPosition = js.Any.fromFunction2(getBreakpointStatementAtPosition), getCompilerOptionsDiagnostics = js.Any.fromFunction0(getCompilerOptionsDiagnostics), getCompletionEntryDetails = js.Any.fromFunction3(getCompletionEntryDetails), getCompletionsAtPosition = js.Any.fromFunction3(getCompletionsAtPosition), getDefinitionAtPosition = js.Any.fromFunction2(getDefinitionAtPosition), getEmitOutput = js.Any.fromFunction1(getEmitOutput), getFormattingEditsAfterKeystroke = js.Any.fromFunction4(getFormattingEditsAfterKeystroke), getFormattingEditsForDocument = js.Any.fromFunction4(getFormattingEditsForDocument), getFormattingEditsForRange = js.Any.fromFunction4(getFormattingEditsForRange), getFormattingEditsOnPaste = js.Any.fromFunction4(getFormattingEditsOnPaste), getImplementorsAtPosition = js.Any.fromFunction2(getImplementorsAtPosition), getIndentationAtPosition = js.Any.fromFunction3(getIndentationAtPosition), getNameOrDottedNameSpan = js.Any.fromFunction3(getNameOrDottedNameSpan), getNavigateToItems = js.Any.fromFunction1(getNavigateToItems), getOccurrencesAtPosition = js.Any.fromFunction2(getOccurrencesAtPosition), getOutliningRegions = js.Any.fromFunction1(getOutliningRegions), getReferencesAtPosition = js.Any.fromFunction2(getReferencesAtPosition), getScriptLexicalStructure = js.Any.fromFunction1(getScriptLexicalStructure), getSemanticDiagnostics = js.Any.fromFunction1(getSemanticDiagnostics), getSignatureAtPosition = js.Any.fromFunction2(getSignatureAtPosition), getSyntacticDiagnostics = js.Any.fromFunction1(getSyntacticDiagnostics), getSyntaxTree = js.Any.fromFunction1(getSyntaxTree), getTypeAtPosition = js.Any.fromFunction2(getTypeAtPosition), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[ILanguageService]
  }
  @scala.inline
  implicit class ILanguageServiceOps[Self <: ILanguageService] (val x: Self) extends AnyVal {
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
    def withGetBraceMatchingAtPosition(value: (String, Double) => js.Array[TextSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBraceMatchingAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBreakpointStatementAtPosition(value: (String, Double) => SpanInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBreakpointStatementAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetCompilerOptionsDiagnostics(value: () => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompilerOptionsDiagnostics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCompletionEntryDetails(value: (String, Double, String) => CompletionEntryDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletionEntryDetails")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetCompletionsAtPosition(value: (String, Double, Boolean) => CompletionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCompletionsAtPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetDefinitionAtPosition(value: (String, Double) => js.Array[DefinitionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefinitionAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetEmitOutput(value: String => EmitOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmitOutput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsAfterKeystroke(value: (String, Double, String, FormatCodeOptions) => js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsAfterKeystroke")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsForDocument(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsForDocument")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsForRange(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsForRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetFormattingEditsOnPaste(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattingEditsOnPaste")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGetImplementorsAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImplementorsAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetIndentationAtPosition(value: (String, Double, EditorOptions) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndentationAtPosition")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNameOrDottedNameSpan(value: (String, Double, Double) => SpanInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNameOrDottedNameSpan")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNavigateToItems(value: String => js.Array[NavigateToItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNavigateToItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOccurrencesAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOccurrencesAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetOutliningRegions(value: String => js.Array[TextSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutliningRegions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetReferencesAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferencesAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetScriptLexicalStructure(value: String => js.Array[NavigateToItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScriptLexicalStructure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSemanticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSignatureAtPosition(value: (String, Double) => SignatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignatureAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyntacticDiagnostics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSyntaxTree(value: String => SyntaxTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSyntaxTree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTypeAtPosition(value: (String, Double) => TypeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeAtPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

