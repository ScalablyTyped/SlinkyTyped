package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.CompletionList
import typingsSlinky.vscode.mod.Declaration
import typingsSlinky.vscode.mod.Definition
import typingsSlinky.vscode.mod.DiagnosticSeverity
import typingsSlinky.vscode.mod.DocumentHighlightKind
import typingsSlinky.vscode.mod.FoldingRangeKind
import typingsSlinky.vscode.mod.Location
import typingsSlinky.vscode.mod.LocationLink
import typingsSlinky.vscode.mod.Uri
import typingsSlinky.vscodeLanguageclient.protocolCompletionItemMod.default
import typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
import typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind
import typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens
import typingsSlinky.vscodeLanguageserverTypes.mod.Color
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorInformation
import typingsSlinky.vscodeLanguageserverTypes.mod.ColorPresentation
import typingsSlinky.vscodeLanguageserverTypes.mod.Command
import typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem
import typingsSlinky.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsSlinky.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic
import typingsSlinky.vscodeLanguageserverTypes.mod.DiagnosticTag
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentHighlight
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink
import typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol
import typingsSlinky.vscodeLanguageserverTypes.mod.FoldingRange
import typingsSlinky.vscodeLanguageserverTypes.mod.Hover
import typingsSlinky.vscodeLanguageserverTypes.mod.ParameterInformation
import typingsSlinky.vscodeLanguageserverTypes.mod.Position
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.SelectionRange
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureHelp
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureInformation
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind
import typingsSlinky.vscodeLanguageserverTypes.mod.SymbolTag
import typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit
import typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
@js.native
object protocolConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
    def asCodeAction(item: CodeAction): js.UndefOr[typingsSlinky.vscode.mod.CodeAction] = js.native
    def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKind(item: CodeActionKind): typingsSlinky.vscode.mod.CodeActionKind = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_Union(item: CodeActionKind): js.UndefOr[typingsSlinky.vscode.mod.CodeActionKind] = js.native
    def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKinds(item: js.Array[CodeActionKind]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.CodeActionKind]] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Array(items: js.Array[CodeActionKind]): js.Array[typingsSlinky.vscode.mod.CodeActionKind] = js.native
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: CodeAction): typingsSlinky.vscode.mod.CodeAction = js.native
    def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLens(item: CodeLens): js.UndefOr[typingsSlinky.vscode.mod.CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_CodeLens(item: CodeLens): typingsSlinky.vscode.mod.CodeLens = js.native
    def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLenses(items: js.Array[CodeLens]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.CodeLens]] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Array(items: js.Array[CodeLens]): js.Array[typingsSlinky.vscode.mod.CodeLens] = js.native
    def asColor(color: Color): typingsSlinky.vscode.mod.Color = js.native
    def asColorInformation(ci: ColorInformation): typingsSlinky.vscode.mod.ColorInformation = js.native
    def asColorInformations(): js.UndefOr[scala.Nothing] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typingsSlinky.vscode.mod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Array(): js.Array[typingsSlinky.vscode.mod.ColorInformation] = js.native
    def asColorPresentation(cp: ColorPresentation): typingsSlinky.vscode.mod.ColorPresentation = js.native
    def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.UndefOr[scala.Nothing] = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Array(colorPresentations: js.Array[ColorPresentation]): js.Array[typingsSlinky.vscode.mod.ColorPresentation] = js.native
    def asCommand(item: Command): typingsSlinky.vscode.mod.Command = js.native
    def asCommands(): js.UndefOr[scala.Nothing] = js.native
    def asCommands(items: js.Array[Command]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.Command]] = js.native
    @JSName("asCommands")
    def asCommands_Array(items: js.Array[Command]): js.Array[typingsSlinky.vscode.mod.Command] = js.native
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.UndefOr[
        js.Array[typingsSlinky.vscode.mod.CompletionItem] | CompletionList[typingsSlinky.vscode.mod.CompletionItem]
      ] = js.native
    def asCompletionResult(result: typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList): js.UndefOr[
        js.Array[typingsSlinky.vscode.mod.CompletionItem] | CompletionList[typingsSlinky.vscode.mod.CompletionItem]
      ] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Array(result: js.Array[CompletionItem]): js.Array[typingsSlinky.vscode.mod.CompletionItem] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_CompletionList(result: typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList): CompletionList[typingsSlinky.vscode.mod.CompletionItem] = js.native
    def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.UndefOr[Declaration] = js.native
    def asDeclarationResult(item: typingsSlinky.vscodeLanguageserverTypes.mod.Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Array(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.UndefOr[Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]] = js.native
    def asDefinitionResult(item: typingsSlinky.vscodeLanguageserverTypes.mod.Definition): Definition = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Array(item: js.Array[DefinitionLink]): js.Array[typingsSlinky.vscode.mod.DefinitionLink] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Union(item: typingsSlinky.vscodeLanguageserverTypes.mod.Definition): js.UndefOr[Definition | js.Array[typingsSlinky.vscode.mod.DefinitionLink]] = js.native
    def asDiagnostic(diagnostic: Diagnostic): typingsSlinky.vscode.mod.Diagnostic = js.native
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    def asDiagnosticTag(tag: DiagnosticTag): js.UndefOr[typingsSlinky.vscode.mod.DiagnosticTag] = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typingsSlinky.vscode.mod.Diagnostic] = js.native
    def asDocumentHighlight(item: DocumentHighlight): typingsSlinky.vscode.mod.DocumentHighlight = js.native
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.DocumentHighlight]] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Array(values: js.Array[DocumentHighlight]): js.Array[typingsSlinky.vscode.mod.DocumentHighlight] = js.native
    def asDocumentLink(item: DocumentLink): typingsSlinky.vscode.mod.DocumentLink = js.native
    def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.DocumentLink]] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Array(items: js.Array[DocumentLink]): js.Array[typingsSlinky.vscode.mod.DocumentLink] = js.native
    def asDocumentSymbol(value: DocumentSymbol): typingsSlinky.vscode.mod.DocumentSymbol = js.native
    def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.DocumentSymbol]] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Array(value: js.Array[DocumentSymbol]): js.Array[typingsSlinky.vscode.mod.DocumentSymbol] = js.native
    def asFoldingRange(r: FoldingRange): typingsSlinky.vscode.mod.FoldingRange = js.native
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.FoldingRange]] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Array(foldingRanges: js.Array[FoldingRange]): js.Array[typingsSlinky.vscode.mod.FoldingRange] = js.native
    def asHover(): js.UndefOr[scala.Nothing] = js.native
    def asHover(hover: Hover): js.UndefOr[typingsSlinky.vscode.mod.Hover] = js.native
    @JSName("asHover")
    def asHover_Hover(hover: Hover): typingsSlinky.vscode.mod.Hover = js.native
    def asLocation(): js.UndefOr[scala.Nothing] = js.native
    def asLocation(item: typingsSlinky.vscodeLanguageserverTypes.mod.Location): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Location(item: typingsSlinky.vscodeLanguageserverTypes.mod.Location): Location = js.native
    def asParameterInformation(item: ParameterInformation): typingsSlinky.vscode.mod.ParameterInformation = js.native
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typingsSlinky.vscode.mod.ParameterInformation] = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): typingsSlinky.vscode.mod.Position = js.native
    @JSName("asPosition")
    def asPosition_Union(value: Position): js.UndefOr[typingsSlinky.vscode.mod.Position] = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): typingsSlinky.vscode.mod.Range = js.native
    @JSName("asRange")
    def asRange_Union(value: Range): js.UndefOr[typingsSlinky.vscode.mod.Range] = js.native
    def asRanges(values: js.Array[Range]): js.Array[typingsSlinky.vscode.mod.Range] = js.native
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(values: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location]): js.UndefOr[js.Array[Location]] = js.native
    @JSName("asReferences")
    def asReferences_Array(values: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Location]): js.Array[Location] = js.native
    def asSelectionRange(selectionRange: SelectionRange): typingsSlinky.vscode.mod.SelectionRange = js.native
    def asSelectionRanges(): js.UndefOr[scala.Nothing] = js.native
    def asSelectionRanges(selectionRanges: js.Array[SelectionRange]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.SelectionRange]] = js.native
    @JSName("asSelectionRanges")
    def asSelectionRanges_Array(selectionRanges: js.Array[SelectionRange]): js.Array[typingsSlinky.vscode.mod.SelectionRange] = js.native
    def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
    def asSignatureHelp(item: SignatureHelp): js.UndefOr[typingsSlinky.vscode.mod.SignatureHelp] = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_SignatureHelp(item: SignatureHelp): typingsSlinky.vscode.mod.SignatureHelp = js.native
    def asSignatureInformation(item: SignatureInformation): typingsSlinky.vscode.mod.SignatureInformation = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typingsSlinky.vscode.mod.SignatureInformation] = js.native
    def asSymbolInformation(item: SymbolInformation): typingsSlinky.vscode.mod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typingsSlinky.vscode.mod.SymbolInformation = js.native
    def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.UndefOr[scala.Nothing], uri: Uri): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typingsSlinky.vscode.mod.SymbolInformation]] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[scala.Nothing] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation]): js.Array[typingsSlinky.vscode.mod.SymbolInformation] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Array(values: js.Array[SymbolInformation], uri: Uri): js.Array[typingsSlinky.vscode.mod.SymbolInformation] = js.native
    def asSymbolKind(item: SymbolKind): typingsSlinky.vscode.mod.SymbolKind = js.native
    def asSymbolTag(item: SymbolTag): typingsSlinky.vscode.mod.SymbolTag = js.native
    def asSymbolTags(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.SymbolTag]] = js.native
    @JSName("asSymbolTags")
    def asSymbolTags_Array(items: js.Array[SymbolTag]): js.Array[typingsSlinky.vscode.mod.SymbolTag] = js.native
    def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdit(edit: TextEdit): js.UndefOr[typingsSlinky.vscode.mod.TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_TextEdit(edit: TextEdit): typingsSlinky.vscode.mod.TextEdit = js.native
    def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdits(items: js.Array[TextEdit]): js.UndefOr[js.Array[typingsSlinky.vscode.mod.TextEdit]] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Array(items: js.Array[TextEdit]): js.Array[typingsSlinky.vscode.mod.TextEdit] = js.native
    def asUri(value: String): Uri = js.native
    def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): js.UndefOr[typingsSlinky.vscode.mod.WorkspaceEdit] = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_WorkspaceEdit(item: WorkspaceEdit): typingsSlinky.vscode.mod.WorkspaceEdit = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ String, Uri]
}

