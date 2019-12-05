package typingsSlinky.vscodeDashLanguageclient

import typingsSlinky.vscode.vscodeMod.DiagnosticSeverity
import typingsSlinky.vscode.vscodeMod.DocumentHighlightKind
import typingsSlinky.vscode.vscodeMod.FoldingRangeKind
import typingsSlinky.vscode.vscodeMod.Location
import typingsSlinky.vscode.vscodeMod.LocationLink
import typingsSlinky.vscode.vscodeMod.Uri
import typingsSlinky.vscodeDashLanguageclient.libProtocolCompletionItemMod.default
import typingsSlinky.vscodeDashLanguageclient.libProtocolConverterMod.Converter
import typingsSlinky.vscodeDashLanguageclient.libProtocolConverterMod.URIConverter
import typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.DocumentLink
import typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.DocumentSymbol
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeAction
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionKind
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Color
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorInformation
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Declaration
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DeclarationLink
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Definition
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DefinitionLink
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentHighlight
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FoldingRange
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Hover
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ParameterInformation
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureHelp
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureInformation
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SymbolInformation
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/protocolConverter", JSImport.Namespace)
@js.native
object libProtocolConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asCodeAction(): js.UndefOr[scala.Nothing] = js.native
    def asCodeAction(item: CodeAction): js.UndefOr[typingsSlinky.vscode.vscodeMod.CodeAction] = js.native
    def asCodeActionKind(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKind(item: CodeActionKind): typingsSlinky.vscode.vscodeMod.CodeActionKind = js.native
    @JSName("asCodeActionKind")
    def asCodeActionKind_Union(item: CodeActionKind): js.UndefOr[typingsSlinky.vscode.vscodeMod.CodeActionKind] = js.native
    def asCodeActionKinds(): js.UndefOr[scala.Nothing] = js.native
    def asCodeActionKinds(items: js.Array[CodeActionKind]): js.Array[typingsSlinky.vscode.vscodeMod.CodeActionKind] = js.native
    @JSName("asCodeActionKinds")
    def asCodeActionKinds_Union(item: js.Array[CodeActionKind]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.CodeActionKind]] = js.native
    @JSName("asCodeAction")
    def asCodeAction_CodeAction(item: CodeAction): typingsSlinky.vscode.vscodeMod.CodeAction = js.native
    def asCodeLens(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLens(item: CodeLens): js.UndefOr[typingsSlinky.vscode.vscodeMod.CodeLens] = js.native
    @JSName("asCodeLens")
    def asCodeLens_CodeLens(item: CodeLens): typingsSlinky.vscode.vscodeMod.CodeLens = js.native
    def asCodeLenses(): js.UndefOr[scala.Nothing] = js.native
    def asCodeLenses(items: js.Array[CodeLens]): js.Array[typingsSlinky.vscode.vscodeMod.CodeLens] = js.native
    @JSName("asCodeLenses")
    def asCodeLenses_Union(items: js.Array[CodeLens]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.CodeLens]] = js.native
    def asColor(color: Color): typingsSlinky.vscode.vscodeMod.Color = js.native
    def asColorInformation(ci: ColorInformation): typingsSlinky.vscode.vscodeMod.ColorInformation = js.native
    def asColorInformations(): js.Array[typingsSlinky.vscode.vscodeMod.ColorInformation] = js.native
    def asColorInformations(colorPresentations: js.Array[ColorInformation]): js.Array[typingsSlinky.vscode.vscodeMod.ColorInformation] = js.native
    @JSName("asColorInformations")
    def asColorInformations_Union(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentation(cp: ColorPresentation): typingsSlinky.vscode.vscodeMod.ColorPresentation = js.native
    def asColorPresentations(): js.UndefOr[scala.Nothing] = js.native
    def asColorPresentations(colorPresentations: js.Array[ColorPresentation]): js.Array[typingsSlinky.vscode.vscodeMod.ColorPresentation] = js.native
    @JSName("asColorPresentations")
    def asColorPresentations_Union(colorPresentations: js.Array[ColorPresentation]): js.UndefOr[scala.Nothing] = js.native
    def asCommand(item: Command): typingsSlinky.vscode.vscodeMod.Command = js.native
    def asCommands(): js.UndefOr[scala.Nothing] = js.native
    def asCommands(items: js.Array[Command]): js.Array[typingsSlinky.vscode.vscodeMod.Command] = js.native
    @JSName("asCommands")
    def asCommands_Union(items: js.Array[Command]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.Command]] = js.native
    def asCompletionItem(item: CompletionItem): default = js.native
    def asCompletionResult(): js.UndefOr[scala.Nothing] = js.native
    def asCompletionResult(result: js.Array[CompletionItem]): js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] = js.native
    def asCompletionResult(result: CompletionList): js.UndefOr[
        js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] | typingsSlinky.vscode.vscodeMod.CompletionList
      ] = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_CompletionList(result: CompletionList): typingsSlinky.vscode.vscodeMod.CompletionList = js.native
    @JSName("asCompletionResult")
    def asCompletionResult_Union(result: js.Array[CompletionItem]): js.UndefOr[
        js.Array[typingsSlinky.vscode.vscodeMod.CompletionItem] | typingsSlinky.vscode.vscodeMod.CompletionList
      ] = js.native
    def asDeclarationResult(): js.UndefOr[scala.Nothing] = js.native
    def asDeclarationResult(item: js.Array[DeclarationLink]): js.Array[LocationLink] = js.native
    def asDeclarationResult(item: Declaration): Location | js.Array[Location] = js.native
    @JSName("asDeclarationResult")
    def asDeclarationResult_Union(item: js.Array[DeclarationLink]): js.UndefOr[typingsSlinky.vscode.vscodeMod.Declaration] = js.native
    def asDefinitionResult(): js.UndefOr[scala.Nothing] = js.native
    def asDefinitionResult(item: js.Array[DefinitionLink]): js.Array[typingsSlinky.vscode.vscodeMod.DefinitionLink] = js.native
    def asDefinitionResult(item: Definition): js.UndefOr[
        typingsSlinky.vscode.vscodeMod.Definition | js.Array[typingsSlinky.vscode.vscodeMod.DefinitionLink]
      ] = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Definition(item: Definition): typingsSlinky.vscode.vscodeMod.Definition = js.native
    @JSName("asDefinitionResult")
    def asDefinitionResult_Union(item: js.Array[DefinitionLink]): js.UndefOr[
        typingsSlinky.vscode.vscodeMod.Definition | js.Array[typingsSlinky.vscode.vscodeMod.DefinitionLink]
      ] = js.native
    def asDiagnostic(diagnostic: Diagnostic): typingsSlinky.vscode.vscodeMod.Diagnostic = js.native
    def asDiagnosticSeverity(): DiagnosticSeverity = js.native
    def asDiagnosticSeverity(value: Double): DiagnosticSeverity = js.native
    def asDiagnostics(diagnostics: js.Array[Diagnostic]): js.Array[typingsSlinky.vscode.vscodeMod.Diagnostic] = js.native
    def asDocumentHighlight(item: DocumentHighlight): typingsSlinky.vscode.vscodeMod.DocumentHighlight = js.native
    def asDocumentHighlightKind(item: Double): DocumentHighlightKind = js.native
    def asDocumentHighlights(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentHighlights(values: js.Array[DocumentHighlight]): js.Array[typingsSlinky.vscode.vscodeMod.DocumentHighlight] = js.native
    @JSName("asDocumentHighlights")
    def asDocumentHighlights_Union(values: js.Array[DocumentHighlight]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.DocumentHighlight]] = js.native
    def asDocumentLink(item: DocumentLink): typingsSlinky.vscode.vscodeMod.DocumentLink = js.native
    def asDocumentLinks(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentLinks(items: js.Array[DocumentLink]): js.Array[typingsSlinky.vscode.vscodeMod.DocumentLink] = js.native
    @JSName("asDocumentLinks")
    def asDocumentLinks_Union(items: js.Array[DocumentLink]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.DocumentLink]] = js.native
    def asDocumentSymbol(value: DocumentSymbol): typingsSlinky.vscode.vscodeMod.DocumentSymbol = js.native
    def asDocumentSymbols(): js.UndefOr[scala.Nothing] = js.native
    def asDocumentSymbols(value: js.Array[DocumentSymbol]): js.Array[typingsSlinky.vscode.vscodeMod.DocumentSymbol] = js.native
    @JSName("asDocumentSymbols")
    def asDocumentSymbols_Union(value: js.Array[DocumentSymbol]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.DocumentSymbol]] = js.native
    def asFoldingRange(r: FoldingRange): typingsSlinky.vscode.vscodeMod.FoldingRange = js.native
    def asFoldingRangeKind(): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRangeKind(kind: String): js.UndefOr[FoldingRangeKind] = js.native
    def asFoldingRanges(): js.UndefOr[scala.Nothing] = js.native
    def asFoldingRanges(foldingRanges: js.Array[FoldingRange]): js.Array[typingsSlinky.vscode.vscodeMod.FoldingRange] = js.native
    @JSName("asFoldingRanges")
    def asFoldingRanges_Union(foldingRanges: js.Array[FoldingRange]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.FoldingRange]] = js.native
    def asHover(): js.UndefOr[scala.Nothing] = js.native
    def asHover(hover: Hover): js.UndefOr[typingsSlinky.vscode.vscodeMod.Hover] = js.native
    @JSName("asHover")
    def asHover_Hover(hover: Hover): typingsSlinky.vscode.vscodeMod.Hover = js.native
    def asLocation(): js.UndefOr[scala.Nothing] = js.native
    def asLocation(
      item: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
    ): js.UndefOr[Location] = js.native
    @JSName("asLocation")
    def asLocation_Location(
      item: typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
    ): Location = js.native
    def asParameterInformation(item: ParameterInformation): typingsSlinky.vscode.vscodeMod.ParameterInformation = js.native
    def asParameterInformations(item: js.Array[ParameterInformation]): js.Array[typingsSlinky.vscode.vscodeMod.ParameterInformation] = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[typingsSlinky.vscode.vscodeMod.Position] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsSlinky.vscode.vscodeMod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[typingsSlinky.vscode.vscodeMod.Range] = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typingsSlinky.vscode.vscodeMod.Range = js.native
    def asReferences(): js.UndefOr[js.Array[Location]] = js.native
    def asReferences(
      values: js.Array[
          typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
        ]
    ): js.Array[Location] = js.native
    @JSName("asReferences")
    def asReferences_Union(
      values: js.Array[
          typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
        ]
    ): js.UndefOr[js.Array[Location]] = js.native
    def asSignatureHelp(): js.UndefOr[scala.Nothing] = js.native
    def asSignatureHelp(item: SignatureHelp): js.UndefOr[typingsSlinky.vscode.vscodeMod.SignatureHelp] = js.native
    @JSName("asSignatureHelp")
    def asSignatureHelp_SignatureHelp(item: SignatureHelp): typingsSlinky.vscode.vscodeMod.SignatureHelp = js.native
    def asSignatureInformation(item: SignatureInformation): typingsSlinky.vscode.vscodeMod.SignatureInformation = js.native
    def asSignatureInformations(items: js.Array[SignatureInformation]): js.Array[typingsSlinky.vscode.vscodeMod.SignatureInformation] = js.native
    def asSymbolInformation(item: SymbolInformation): typingsSlinky.vscode.vscodeMod.SymbolInformation = js.native
    def asSymbolInformation(item: SymbolInformation, uri: Uri): typingsSlinky.vscode.vscodeMod.SymbolInformation = js.native
    def asSymbolInformations(): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.UndefOr[scala.Nothing], uri: Uri): js.UndefOr[scala.Nothing] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation]): js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation] = js.native
    def asSymbolInformations(values: js.Array[SymbolInformation], uri: Uri): js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation] = js.native
    def asSymbolInformations(values: Null, uri: Uri): js.UndefOr[scala.Nothing] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Union(values: js.Array[SymbolInformation]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation]] = js.native
    @JSName("asSymbolInformations")
    def asSymbolInformations_Union(values: js.Array[SymbolInformation], uri: Uri): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.SymbolInformation]] = js.native
    def asTextEdit(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdit(edit: TextEdit): js.UndefOr[typingsSlinky.vscode.vscodeMod.TextEdit] = js.native
    @JSName("asTextEdit")
    def asTextEdit_TextEdit(edit: TextEdit): typingsSlinky.vscode.vscodeMod.TextEdit = js.native
    def asTextEdits(): js.UndefOr[scala.Nothing] = js.native
    def asTextEdits(items: js.Array[TextEdit]): js.Array[typingsSlinky.vscode.vscodeMod.TextEdit] = js.native
    @JSName("asTextEdits")
    def asTextEdits_Union(items: js.Array[TextEdit]): js.UndefOr[js.Array[typingsSlinky.vscode.vscodeMod.TextEdit]] = js.native
    def asUri(value: String): Uri = js.native
    def asWorkspaceEdit(): js.UndefOr[scala.Nothing] = js.native
    def asWorkspaceEdit(item: WorkspaceEdit): typingsSlinky.vscode.vscodeMod.WorkspaceEdit = js.native
    @JSName("asWorkspaceEdit")
    def asWorkspaceEdit_Union(item: WorkspaceEdit): js.UndefOr[typingsSlinky.vscode.vscodeMod.WorkspaceEdit] = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ String, Uri]
}

