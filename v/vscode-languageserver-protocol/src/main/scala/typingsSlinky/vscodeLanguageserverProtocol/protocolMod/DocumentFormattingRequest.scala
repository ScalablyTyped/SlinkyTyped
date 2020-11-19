package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashformatting
import typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentFormattingRequest")
@js.native
object DocumentFormattingRequest extends js.Object {
  
  val method: textDocumentSlashformatting = js.native
  
  val `type`: ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}
