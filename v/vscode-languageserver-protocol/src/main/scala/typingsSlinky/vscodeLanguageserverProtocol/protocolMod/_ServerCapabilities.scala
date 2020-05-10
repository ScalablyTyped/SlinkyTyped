package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonFirstTriggerCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ServerCapabilities extends js.Object {
  /**
    * The server provides code actions. CodeActionOptions may only be
    * specified if the client states that it supports
    * `codeActionLiteralSupport` in its initial `initialize` request.
    */
  var codeActionProvider: js.UndefOr[Boolean | CodeActionOptions] = js.native
  /**
    * The server provides code lens.
    */
  var codeLensProvider: js.UndefOr[CodeLensOptions] = js.native
  /**
    * The server provides completion support.
    */
  var completionProvider: js.UndefOr[CompletionOptions] = js.native
  /**
    * The server provides goto definition support.
    */
  var definitionProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides document formatting.
    */
  var documentFormattingProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides document highlight support.
    */
  var documentHighlightProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides document link support.
    */
  var documentLinkProvider: js.UndefOr[DocumentLinkOptions] = js.native
  /**
    * The server provides document formatting on typing.
    */
  var documentOnTypeFormattingProvider: js.UndefOr[AnonFirstTriggerCharacter] = js.native
  /**
    * The server provides document range formatting.
    */
  var documentRangeFormattingProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides document symbol support.
    */
  var documentSymbolProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides execute command support.
    */
  var executeCommandProvider: js.UndefOr[ExecuteCommandOptions] = js.native
  /**
    * Experimental server capabilities.
    */
  var experimental: js.UndefOr[js.Any] = js.native
  /**
    * The server provides hover support.
    */
  var hoverProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides find references support.
    */
  var referencesProvider: js.UndefOr[Boolean] = js.native
  /**
    * The server provides rename support. RenameOptions may only be
    * specified if the client states that it supports
    * `prepareSupport` in its initial `initialize` request.
    */
  var renameProvider: js.UndefOr[Boolean | RenameOptions] = js.native
  /**
    * The server provides signature help support.
    */
  var signatureHelpProvider: js.UndefOr[SignatureHelpOptions] = js.native
  /**
    * Defines how text documents are synced. Is either a detailed structure defining each notification or
    * for backwards compatibility the TextDocumentSyncKind number.
    */
  var textDocumentSync: js.UndefOr[TextDocumentSyncOptions | TextDocumentSyncKind] = js.native
  /**
    * The server provides workspace symbol support.
    */
  var workspaceSymbolProvider: js.UndefOr[Boolean] = js.native
}

object _ServerCapabilities {
  @scala.inline
  def apply(): _ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_ServerCapabilities]
  }
  @scala.inline
  implicit class _ServerCapabilitiesOps[Self <: _ServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeActionProvider(value: Boolean | CodeActionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeActionProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeActionProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeLensProvider(value: CodeLensOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLensProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeLensProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLensProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionProvider(value: CompletionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitionProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentFormattingProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentFormattingProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentFormattingProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentFormattingProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentHighlightProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHighlightProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHighlightProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHighlightProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLinkProvider(value: DocumentLinkOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLinkProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentLinkProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLinkProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentOnTypeFormattingProvider(value: AnonFirstTriggerCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentOnTypeFormattingProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentOnTypeFormattingProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentOnTypeFormattingProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentRangeFormattingProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRangeFormattingProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRangeFormattingProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRangeFormattingProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentSymbolProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbolProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSymbolProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbolProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteCommandProvider(value: ExecuteCommandOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommandProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteCommandProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommandProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencesProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencesProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameProvider(value: Boolean | RenameOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureHelpProvider(value: SignatureHelpOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureHelpProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelpProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDocumentSync(value: TextDocumentSyncOptions | TextDocumentSyncKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocumentSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDocumentSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDocumentSync")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceSymbolProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceSymbolProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceSymbolProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceSymbolProvider")(js.undefined)
        ret
    }
  }
  
}

