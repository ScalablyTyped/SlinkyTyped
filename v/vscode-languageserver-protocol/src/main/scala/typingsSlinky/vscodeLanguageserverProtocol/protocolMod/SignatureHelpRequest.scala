package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsignatureHelp
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureHelpRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpRequest.method")
  @js.native
  val method: textDocumentSlashsignatureHelp = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SignatureHelpParams, 
    SignatureHelp | Null, 
    scala.Nothing, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}
