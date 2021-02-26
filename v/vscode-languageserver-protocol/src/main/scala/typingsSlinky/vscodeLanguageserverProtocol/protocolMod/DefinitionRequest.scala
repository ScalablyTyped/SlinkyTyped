package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdefinition
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinitionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DefinitionRequest.method")
  @js.native
  val method: textDocumentSlashdefinition = js.native
  
  /** @deprecated Use DefinitionRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DefinitionRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DefinitionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DefinitionRegistrationOptions
  ] = js.native
}
