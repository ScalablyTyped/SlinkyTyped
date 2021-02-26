package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  /** @deprecated Use CodeLensRequest.type */
  @JSImport("vscode-languageclient/lib/client", "CodeLensRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens]] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "CodeLensRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
