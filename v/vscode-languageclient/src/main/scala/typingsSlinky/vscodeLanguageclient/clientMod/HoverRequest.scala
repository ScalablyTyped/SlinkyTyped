package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashhover
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.HoverRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverRequest {
  
  @JSImport("vscode-languageclient/lib/client", "HoverRequest.method")
  @js.native
  val method: textDocumentSlashhover = js.native
  
  @JSImport("vscode-languageclient/lib/client", "HoverRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    HoverParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Hover | Null, 
    scala.Nothing, 
    Unit, 
    HoverRegistrationOptions
  ] = js.native
}
