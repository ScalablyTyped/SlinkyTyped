package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashformatting
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentFormattingRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentFormattingRequest {
  
  @JSImport("vscode-languageserver", "DocumentFormattingRequest.method")
  @js.native
  val method: textDocumentSlashformatting = js.native
  
  @JSImport("vscode-languageserver", "DocumentFormattingRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    DocumentFormattingRegistrationOptions
  ] = js.native
}
