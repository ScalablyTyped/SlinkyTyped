package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.Diagnostic
import typingsSlinky.typescriptServices.TypeScript.EmitOutput
import typingsSlinky.typescriptServices.TypeScript.SyntaxTree
import typingsSlinky.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageService extends StObject {
  
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
  implicit class ILanguageServiceMutableBuilder[Self <: ILanguageService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupSemanticCache(value: () => Unit): Self = StObject.set(x, "cleanupSemanticCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBraceMatchingAtPosition(value: (String, Double) => js.Array[TextSpan]): Self = StObject.set(x, "getBraceMatchingAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBreakpointStatementAtPosition(value: (String, Double) => SpanInfo): Self = StObject.set(x, "getBreakpointStatementAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCompilerOptionsDiagnostics(value: () => js.Array[Diagnostic]): Self = StObject.set(x, "getCompilerOptionsDiagnostics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCompletionEntryDetails(value: (String, Double, String) => CompletionEntryDetails): Self = StObject.set(x, "getCompletionEntryDetails", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetCompletionsAtPosition(value: (String, Double, Boolean) => CompletionInfo): Self = StObject.set(x, "getCompletionsAtPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetDefinitionAtPosition(value: (String, Double) => js.Array[DefinitionInfo]): Self = StObject.set(x, "getDefinitionAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEmitOutput(value: String => EmitOutput): Self = StObject.set(x, "getEmitOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFormattingEditsAfterKeystroke(value: (String, Double, String, FormatCodeOptions) => js.Array[TextEdit]): Self = StObject.set(x, "getFormattingEditsAfterKeystroke", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsForDocument(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = StObject.set(x, "getFormattingEditsForDocument", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsForRange(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = StObject.set(x, "getFormattingEditsForRange", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetFormattingEditsOnPaste(value: (String, Double, Double, FormatCodeOptions) => js.Array[TextEdit]): Self = StObject.set(x, "getFormattingEditsOnPaste", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetImplementorsAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = StObject.set(x, "getImplementorsAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetIndentationAtPosition(value: (String, Double, EditorOptions) => Double): Self = StObject.set(x, "getIndentationAtPosition", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNameOrDottedNameSpan(value: (String, Double, Double) => SpanInfo): Self = StObject.set(x, "getNameOrDottedNameSpan", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNavigateToItems(value: String => js.Array[NavigateToItem]): Self = StObject.set(x, "getNavigateToItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOccurrencesAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = StObject.set(x, "getOccurrencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOutliningRegions(value: String => js.Array[TextSpan]): Self = StObject.set(x, "getOutliningRegions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetReferencesAtPosition(value: (String, Double) => js.Array[ReferenceEntry]): Self = StObject.set(x, "getReferencesAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScriptLexicalStructure(value: String => js.Array[NavigateToItem]): Self = StObject.set(x, "getScriptLexicalStructure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSemanticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSemanticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSignatureAtPosition(value: (String, Double) => SignatureInfo): Self = StObject.set(x, "getSignatureAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSyntacticDiagnostics(value: String => js.Array[Diagnostic]): Self = StObject.set(x, "getSyntacticDiagnostics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSyntaxTree(value: String => SyntaxTree): Self = StObject.set(x, "getSyntaxTree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeAtPosition(value: (String, Double) => TypeInfo): Self = StObject.set(x, "getTypeAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
  }
}
