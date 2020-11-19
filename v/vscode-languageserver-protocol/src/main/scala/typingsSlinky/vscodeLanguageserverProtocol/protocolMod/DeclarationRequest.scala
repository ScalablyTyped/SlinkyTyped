package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typingsSlinky.vscodeLanguageserverTypes.mod.Location
import typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "DeclarationRequest")
@js.native
object DeclarationRequest extends js.Object {
  
  val method: textDocumentSlashdeclaration = js.native
  
  /** @deprecated Use DeclarationRequest.type */
  val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
  
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    js.Array[Location | LocationLink], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
