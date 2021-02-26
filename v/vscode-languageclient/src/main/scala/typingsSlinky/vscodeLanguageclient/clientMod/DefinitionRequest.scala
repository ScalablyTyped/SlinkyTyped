package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashdefinition
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DefinitionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefinitionRequest {
  
  @JSImport("vscode-languageclient/lib/client", "DefinitionRequest.method")
  @js.native
  val method: textDocumentSlashdefinition = js.native
  
  /** @deprecated Use DefinitionRequest.type */
  @JSImport("vscode-languageclient/lib/client", "DefinitionRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "DefinitionRequest.type")
  @js.native
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
