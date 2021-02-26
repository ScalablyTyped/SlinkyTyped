package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import typingsSlinky.vscodeLanguageserverTypes.mod.Hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "HoverRequest.type")
  @js.native
  val `type`: ProtocolRequestType[HoverParams, Hover | Null, scala.Nothing, Unit, HoverRegistrationOptions] = js.native
}
