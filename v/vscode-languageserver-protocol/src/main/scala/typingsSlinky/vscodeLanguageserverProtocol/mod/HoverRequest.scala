package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashhover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageserver-protocol", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageserver-protocol", "HoverRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    HoverParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Hover | Null, 
    scala.Nothing, 
    Unit, 
    HoverRegistrationOptions
  ] = js.native
}
