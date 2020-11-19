package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashformatting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "DocumentFormattingRequest")
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
