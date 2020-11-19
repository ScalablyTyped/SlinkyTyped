package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashtypeDefinition
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolTypeDefinitionMod.TypeDefinitionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TypeDefinitionRequest")
@js.native
object TypeDefinitionRequest extends js.Object {
  
  val method: textDocumentSlashtypeDefinition = js.native
  
  /** @deprecated Use TypeDefinitionRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
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
