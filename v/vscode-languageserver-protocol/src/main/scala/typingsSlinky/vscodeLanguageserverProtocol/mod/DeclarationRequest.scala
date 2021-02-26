package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolDeclarationMod.DeclarationRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationRequest {
  
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.method")
  @js.native
  val method: textDocumentSlashdeclaration = js.native
  
  /** @deprecated Use DeclarationRequest.type */
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  @JSImport("vscode-languageserver-protocol", "DeclarationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DeclarationParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DeclarationRegistrationOptions
  ] = js.native
}
