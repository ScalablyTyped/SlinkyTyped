package typingsSlinky.vscodeDashLanguageclient

import typingsSlinky.vscode.vscodeMod.CodeActionContext
import typingsSlinky.vscode.vscodeMod.CodeLens
import typingsSlinky.vscode.vscodeMod.Command
import typingsSlinky.vscode.vscodeMod.CompletionContext
import typingsSlinky.vscode.vscodeMod.CompletionItem
import typingsSlinky.vscode.vscodeMod.Diagnostic
import typingsSlinky.vscode.vscodeMod.DiagnosticSeverity
import typingsSlinky.vscode.vscodeMod.DocumentLink
import typingsSlinky.vscode.vscodeMod.FormattingOptions
import typingsSlinky.vscode.vscodeMod.Position
import typingsSlinky.vscode.vscodeMod.Range
import typingsSlinky.vscode.vscodeMod.TextDocument
import typingsSlinky.vscode.vscodeMod.TextDocumentChangeEvent
import typingsSlinky.vscode.vscodeMod.TextDocumentWillSaveEvent
import typingsSlinky.vscode.vscodeMod.TextEdit
import typingsSlinky.vscode.vscodeMod.Uri
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidChangeTextDocumentParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidCloseTextDocumentParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidOpenTextDocumentParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DidSaveTextDocumentParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.DocumentLinkParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.ReferenceParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.WillSaveTextDocumentParams
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.DocumentSymbolParams
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/codeConverter", JSImport.Namespace)
@js.native
object libCodeConverterMod extends js.Object {
  @js.native
  trait Converter extends js.Object {
    def asChangeTextDocumentParams(event: TextDocumentChangeEvent): DidChangeTextDocumentParams = js.native
    def asChangeTextDocumentParams(textDocument: TextDocument): DidChangeTextDocumentParams = js.native
    def asCloseTextDocumentParams(textDocument: TextDocument): DidCloseTextDocumentParams = js.native
    def asCodeActionContext(context: CodeActionContext): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeActionContext = js.native
    def asCodeLens(item: CodeLens): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens = js.native
    def asCodeLensParams(textDocument: TextDocument): CodeLensParams = js.native
    def asCommand(item: Command): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Command = js.native
    def asCompletionItem(item: CompletionItem): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem = js.native
    def asCompletionParams(textDocument: TextDocument, position: Position, context: CompletionContext): CompletionParams = js.native
    def asDiagnostic(item: Diagnostic): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic = js.native
    def asDiagnosticSeverity(value: DiagnosticSeverity): Double = js.native
    def asDiagnostics(items: js.Array[Diagnostic]): js.Array[
        typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
      ] = js.native
    def asDocumentLink(item: DocumentLink): typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod.DocumentLink = js.native
    def asDocumentLinkParams(textDocument: TextDocument): DocumentLinkParams = js.native
    def asDocumentSymbolParams(textDocument: TextDocument): DocumentSymbolParams = js.native
    def asFormattingOptions(item: FormattingOptions): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.FormattingOptions = js.native
    def asOpenTextDocumentParams(textDocument: TextDocument): DidOpenTextDocumentParams = js.native
    def asPosition(): js.UndefOr[scala.Nothing] = js.native
    def asPosition(value: Position): js.UndefOr[
        typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position | Null
      ] = js.native
    @JSName("asPosition")
    def asPosition_Null(): Null = js.native
    @JSName("asPosition")
    def asPosition_Position(value: Position): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position = js.native
    def asRange(): js.UndefOr[scala.Nothing] = js.native
    def asRange(value: Range): js.UndefOr[
        typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range | Null
      ] = js.native
    @JSName("asRange")
    def asRange_Null(): Null = js.native
    @JSName("asRange")
    def asRange_Range(value: Range): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range = js.native
    def asReferenceParams(textDocument: TextDocument, position: Position, options: Anon_IncludeDeclaration): ReferenceParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument): DidSaveTextDocumentParams = js.native
    def asSaveTextDocumentParams(textDocument: TextDocument, includeContent: Boolean): DidSaveTextDocumentParams = js.native
    def asTextDocumentIdentifier(textDocument: TextDocument): TextDocumentIdentifier = js.native
    def asTextDocumentPositionParams(textDocument: TextDocument, position: Position): TextDocumentPositionParams = js.native
    def asTextEdit(edit: TextEdit): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit = js.native
    def asUri(uri: Uri): String = js.native
    def asVersionedTextDocumentIdentifier(textDocument: TextDocument): VersionedTextDocumentIdentifier = js.native
    def asWillSaveTextDocumentParams(event: TextDocumentWillSaveEvent): WillSaveTextDocumentParams = js.native
    def asWorkerPosition(position: Position): typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position = js.native
  }
  
  def createConverter(): Converter = js.native
  def createConverter(uriConverter: URIConverter): Converter = js.native
  type URIConverter = js.Function1[/* value */ Uri, String]
}

