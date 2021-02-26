package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DeclarationRequest.method")
  @js.native
  val method: textDocumentSlashdeclaration = js.native
  
  /** @deprecated Use DeclarationRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DeclarationRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "DeclarationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
