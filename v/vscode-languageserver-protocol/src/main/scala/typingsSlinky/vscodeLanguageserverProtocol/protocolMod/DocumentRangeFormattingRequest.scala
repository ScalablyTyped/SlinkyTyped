package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrangeFormatting
import typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentRangeFormattingRequest")
@js.native
object DocumentRangeFormattingRequest extends js.Object {
  
  val method: textDocumentSlashrangeFormatting = js.native
  
  val `type`: ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}
