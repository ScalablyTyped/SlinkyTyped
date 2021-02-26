package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeJsonrpc.mod.ProgressType
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensRequest {
  
  /** @deprecated Use CodeLensRequest.type */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "CodeLensRequest.resultType")
  @js.native
  val resultType: ProgressType[js.Array[CodeLens]] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "CodeLensRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[CodeLens] | Null, 
    js.Array[CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}
