package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  
  val method: textDocumentSlashhover = js.native
  
  val `type`: ProtocolRequestType[
    HoverParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Hover | Null, 
    scala.Nothing, 
    Unit, 
    HoverRegistrationOptions
  ] = js.native
}
