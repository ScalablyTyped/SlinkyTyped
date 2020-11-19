package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DefinitionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "DefinitionRequest")
@js.native
object DefinitionRequest extends js.Object {
  
  val method: textDocumentSlashdefinition = js.native
  
  /** @deprecated Use DefinitionRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  val `type`: ProtocolRequestType[
    DefinitionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    DefinitionRegistrationOptions
  ] = js.native
}
