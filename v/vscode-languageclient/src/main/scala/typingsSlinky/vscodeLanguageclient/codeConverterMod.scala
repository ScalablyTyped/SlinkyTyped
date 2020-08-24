package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscode.mod.CodeActionContext
import typingsSlinky.vscode.mod.CodeLens
import typingsSlinky.vscode.mod.Command
import typingsSlinky.vscode.mod.CompletionContext
import typingsSlinky.vscode.mod.CompletionItem
import typingsSlinky.vscode.mod.Diagnostic
import typingsSlinky.vscode.mod.DiagnosticSeverity
import typingsSlinky.vscode.mod.DiagnosticTag
import typingsSlinky.vscode.mod.DocumentLink
import typingsSlinky.vscode.mod.FormattingOptions
import typingsSlinky.vscode.mod.Position
import typingsSlinky.vscode.mod.SignatureHelpContext
import typingsSlinky.vscode.mod.SymbolKind
import typingsSlinky.vscode.mod.SymbolTag
import typingsSlinky.vscode.mod.TextDocument
import typingsSlinky.vscode.mod.TextDocumentChangeEvent
import typingsSlinky.vscode.mod.TextDocumentWillSaveEvent
import typingsSlinky.vscode.mod.TextEdit
import typingsSlinky.vscode.mod.Uri
import typingsSlinky.vscodeLanguageclient.anon.IncludeDeclaration
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidChangeTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidCloseTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidOpenTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DidSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentLinkParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSymbolParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import typingsSlinky.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typingsSlinky.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/codeConverter", JSImport.Namespace)
@js.native
object codeConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    def asCodeActionContext(context: CodeActionContext): typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
    def asCodeLens(item: CodeLens): typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens = js.native
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    def asCommand(item: Command): typingsSlinky.vscodeLanguageserverTypes.mod.Command = js.native
    def asCompletionItem(item: CompletionItem): typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem = js.native
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    def asDiagnostic(item: Diagnostic): typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic = js.native
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    def asDiagnosticTag(value: DiagnosticTag): js.UndefOr[Double] = js.native
    def asDiagnostics(items: js.Array[Diagnostic]): js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic] = js.native
    def asDocumentLink(item: DocumentLink): typingsSlinky.vscodeLanguageserverTypes.mod.DocumentLink = js.native
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    def asDocumentSymbolParams(textDocument: TextDocument): DocumentSymbolParams = js.native
    def asFormattingOptions(item: FormattingOptions): typingsSlinky.vscodeLanguageserverTypes.mod.FormattingOptions = js.native
    def asLocation(): js.UndefOr[Location | Null] = js.native
    def asLocation(value: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    def asLocation(value: Null): Null = js.native
    def asLocation(value: typingsSlinky.vscode.mod.Location): Location = js.native
    @JSName("asLocation")
    def asLocation_Union(value: typingsSlinky.vscode.mod.Location): js.UndefOr[Location | Null] = js.native
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    def asPosition(): js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    def asPosition(value: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Null): Null = js.native
    def asPosition(value: Position): js.UndefOr[typingsSlinky.vscodeLanguageserverTypes.mod.Position | Null] = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsSlinky.vscodeLanguageserverTypes.mod.Position = js.native
    def asPositions(value: js.Array[Position]): js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Position] = js.native
    def asRange(): js.UndefOr[Range | Null] = js.native
    def asRange(value: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Null): Null = js.native
    def asRange(value: typingsSlinky.vscode.mod.Range): js.UndefOr[Range | Null] = js.native
    @JSName("asRange")
    def asRange_Range(value: typingsSlinky.vscode.mod.Range): Range = js.native
    def asReferenceParams(textDocument: TextDocument, position: Position, options: IncludeDeclaration): ReferenceParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    def asSignatureHelpParams(textDocument: TextDocument, position: Position, context: SignatureHelpContext): SignatureHelpParams = js.native
    def asSymbolKind(item: SymbolKind): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolKind = js.native
    def asSymbolTag(item: SymbolTag): typingsSlinky.vscodeLanguageserverTypes.mod.SymbolTag = js.native
    def asSymbolTags(items: js.Array[SymbolTag]): js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.SymbolTag] = js.native
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    def asTextEdit(edit: TextEdit): typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit = js.native
    def asUri(uri: Uri): String = js.native
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    def asWorkerPosition(position: Position): typingsSlinky.vscodeLanguageserverTypes.mod.Position = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ Uri, String]
}

