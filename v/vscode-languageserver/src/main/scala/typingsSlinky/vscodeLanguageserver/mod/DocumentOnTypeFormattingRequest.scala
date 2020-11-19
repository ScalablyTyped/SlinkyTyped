package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashonTypeFormatting
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  
  val method: textDocumentSlashonTypeFormatting = js.native
  
  val `type`: ProtocolRequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}
