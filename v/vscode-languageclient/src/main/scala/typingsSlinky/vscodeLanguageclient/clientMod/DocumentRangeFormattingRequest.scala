package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashrangeFormatting
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentRangeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "DocumentRangeFormattingRequest")
@js.native
object DocumentRangeFormattingRequest extends js.Object {
  
  val method: textDocumentSlashrangeFormatting = js.native
  
  val `type`: ProtocolRequestType[
    DocumentRangeFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentRangeFormattingRegistrationOptions
  ] = js.native
}
