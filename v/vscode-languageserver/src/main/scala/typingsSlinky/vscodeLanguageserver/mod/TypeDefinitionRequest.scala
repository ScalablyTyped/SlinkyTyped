package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeDefinitionRequest {
  
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.method")
  @js.native
  val method: textDocumentSlashtypeDefinition = js.native
  
  /** @deprecated Use TypeDefinitionRequest.type */
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  @JSImport("vscode-languageserver", "TypeDefinitionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    TypeDefinitionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    TypeDefinitionRegistrationOptions
  ] = js.native
}
