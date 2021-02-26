package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashonTypeFormatting
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentOnTypeFormattingRequest {
  
  @JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest.method")
  @js.native
  val method: textDocumentSlashonTypeFormatting = js.native
  
  @JSImport("vscode-languageserver", "DocumentOnTypeFormattingRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}
