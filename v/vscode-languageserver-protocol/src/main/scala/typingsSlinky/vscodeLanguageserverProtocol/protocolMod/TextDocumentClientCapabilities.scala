package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.CodeActionLiteralSupport
import typingsSlinky.vscodeLanguageserverProtocol.anon.CompletionItem
import typingsSlinky.vscodeLanguageserverProtocol.anon.ContentFormat
import typingsSlinky.vscodeLanguageserverProtocol.anon.DidSave
import typingsSlinky.vscodeLanguageserverProtocol.anon.DynamicRegistration
import typingsSlinky.vscodeLanguageserverProtocol.anon.HierarchicalDocumentSymbolSupport
import typingsSlinky.vscodeLanguageserverProtocol.anon.LinkSupport
import typingsSlinky.vscodeLanguageserverProtocol.anon.PrepareSupport
import typingsSlinky.vscodeLanguageserverProtocol.anon.RelatedInformation
import typingsSlinky.vscodeLanguageserverProtocol.anon.SignatureInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[CodeActionLiteralSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[CompletionItem] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[LinkSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[HierarchicalDocumentSymbolSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[ContentFormat] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[RelatedInformation] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[DynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[PrepareSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[SignatureInformation] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[DidSave] = js.undefined
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(
    codeAction: CodeActionLiteralSupport = null,
    codeLens: DynamicRegistration = null,
    completion: CompletionItem = null,
    definition: LinkSupport = null,
    documentHighlight: DynamicRegistration = null,
    documentLink: DynamicRegistration = null,
    documentSymbol: HierarchicalDocumentSymbolSupport = null,
    formatting: DynamicRegistration = null,
    hover: ContentFormat = null,
    onTypeFormatting: DynamicRegistration = null,
    publishDiagnostics: RelatedInformation = null,
    rangeFormatting: DynamicRegistration = null,
    references: DynamicRegistration = null,
    rename: PrepareSupport = null,
    signatureHelp: SignatureInformation = null,
    synchronization: DidSave = null
  ): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeAction != null) __obj.updateDynamic("codeAction")(codeAction.asInstanceOf[js.Any])
    if (codeLens != null) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (completion != null) __obj.updateDynamic("completion")(completion.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (documentHighlight != null) __obj.updateDynamic("documentHighlight")(documentHighlight.asInstanceOf[js.Any])
    if (documentLink != null) __obj.updateDynamic("documentLink")(documentLink.asInstanceOf[js.Any])
    if (documentSymbol != null) __obj.updateDynamic("documentSymbol")(documentSymbol.asInstanceOf[js.Any])
    if (formatting != null) __obj.updateDynamic("formatting")(formatting.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (onTypeFormatting != null) __obj.updateDynamic("onTypeFormatting")(onTypeFormatting.asInstanceOf[js.Any])
    if (publishDiagnostics != null) __obj.updateDynamic("publishDiagnostics")(publishDiagnostics.asInstanceOf[js.Any])
    if (rangeFormatting != null) __obj.updateDynamic("rangeFormatting")(rangeFormatting.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (signatureHelp != null) __obj.updateDynamic("signatureHelp")(signatureHelp.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
}

