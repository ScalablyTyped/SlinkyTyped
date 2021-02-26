package typingsSlinky.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[PO, RO /* <: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions with PO */, PR] protected () extends DynamicFeature[RO] {
  def this(_client: BaseLanguageClient, _message: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType) = this()
  
  var _client: BaseLanguageClient = js.native
  
  var _message: js.Any = js.native
  
  var _registrations: js.Any = js.native
  
  def getProvider(textDocument: typingsSlinky.vscode.mod.TextDocument): PR = js.native
  
  /* protected */ def getRegistration(): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(
    documentSelector: js.UndefOr[scala.Nothing],
    capability: (RO with typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions) | PO
  ): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(documentSelector: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  /* protected */ def getRegistration(
    documentSelector: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: (RO with typingsSlinky.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions) | PO
  ): js.Tuple2[
    js.UndefOr[String], 
    js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector]
  ] = js.native
  
  /* protected */ def getRegistrationOptions(): js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: js.UndefOr[scala.Nothing], capability: PO): js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSelector): js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(
    documentSelector: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentSelector,
    capability: PO
  ): js.UndefOr[RO with typingsSlinky.vscodeLanguageclient.anon.DocumentSelector] = js.native
  
  @JSName("messages")
  def messages_MTextDocumentFeature: typingsSlinky.vscodeJsonrpc.messagesMod.MessageType = js.native
  
  /* protected */ def registerLanguageProvider(options: RO): js.Tuple2[typingsSlinky.vscode.mod.Disposable, PR] = js.native
}
