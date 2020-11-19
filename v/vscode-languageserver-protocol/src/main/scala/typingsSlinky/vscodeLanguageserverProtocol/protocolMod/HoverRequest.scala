package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import typingsSlinky.vscodeLanguageserverTypes.mod.Hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  
  val method: textDocumentSlashhover = js.native
  
  val `type`: ProtocolRequestType[HoverParams, Hover | Null, scala.Nothing, Unit, HoverRegistrationOptions] = js.native
}
