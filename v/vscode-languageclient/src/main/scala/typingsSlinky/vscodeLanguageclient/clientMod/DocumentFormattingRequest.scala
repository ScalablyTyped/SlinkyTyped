package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashformatting
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  
  val method: textDocumentSlashformatting = js.native
  
  val `type`: ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}
