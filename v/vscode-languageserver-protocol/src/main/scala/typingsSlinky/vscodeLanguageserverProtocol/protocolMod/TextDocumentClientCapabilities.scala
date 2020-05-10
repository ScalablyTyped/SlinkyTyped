package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonCodeActionLiteralSupport
import typingsSlinky.vscodeLanguageserverProtocol.AnonCompletionItem
import typingsSlinky.vscodeLanguageserverProtocol.AnonContentFormat
import typingsSlinky.vscodeLanguageserverProtocol.AnonDidSave
import typingsSlinky.vscodeLanguageserverProtocol.AnonDynamicRegistration
import typingsSlinky.vscodeLanguageserverProtocol.AnonHierarchicalDocumentSymbolSupport
import typingsSlinky.vscodeLanguageserverProtocol.AnonLinkSupport
import typingsSlinky.vscodeLanguageserverProtocol.AnonPrepareSupport
import typingsSlinky.vscodeLanguageserverProtocol.AnonRelatedInformation
import typingsSlinky.vscodeLanguageserverProtocol.AnonSignatureInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[AnonCodeActionLiteralSupport] = js.native
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[AnonCompletionItem] = js.native
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[AnonLinkSupport] = js.native
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[AnonHierarchicalDocumentSymbolSupport] = js.native
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[AnonContentFormat] = js.native
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[AnonRelatedInformation] = js.native
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[AnonDynamicRegistration] = js.native
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[AnonPrepareSupport] = js.native
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[AnonSignatureInformation] = js.native
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[AnonDidSave] = js.native
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
  @scala.inline
  implicit class TextDocumentClientCapabilitiesOps[Self <: TextDocumentClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeAction(value: AnonCodeActionLiteralSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeAction")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeLens(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeLens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletion(value: AnonCompletionItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinition(value: AnonLinkSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentHighlight(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentLink(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentSymbol(value: AnonHierarchicalDocumentSymbolSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatting(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatting")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: AnonContentFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTypeFormatting(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypeFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTypeFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypeFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishDiagnostics(value: AnonRelatedInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDiagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDiagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeFormatting(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withReferences(value: AnonDynamicRegistration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: AnonPrepareSupport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureHelp(value: AnonSignatureInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronization(value: AnonDidSave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronization")(js.undefined)
        ret
    }
  }
  
}

