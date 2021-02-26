package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsignatureHelp
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.SignatureHelpParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.SignatureHelpRegistrationOptions
import typingsSlinky.vscodeLanguageserverTypes.mod.SignatureHelp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureHelpRequest {
  
  @JSImport("vscode-languageclient", "SignatureHelpRequest.method")
  @js.native
  val method: textDocumentSlashsignatureHelp = js.native
  
  @JSImport("vscode-languageclient", "SignatureHelpRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    SignatureHelpParams, 
    SignatureHelp | Null, 
    scala.Nothing, 
    Unit, 
    SignatureHelpRegistrationOptions
  ] = js.native
}
