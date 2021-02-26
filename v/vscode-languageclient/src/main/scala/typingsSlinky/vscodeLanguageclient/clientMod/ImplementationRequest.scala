package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashimplementation
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolImplementationMod.ImplementationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImplementationRequest {
  
  @JSImport("vscode-languageclient/lib/client", "ImplementationRequest.method")
  @js.native
  val method: textDocumentSlashimplementation = js.native
  
  /** @deprecated Use ImplementationRequest.type */
  @JSImport("vscode-languageclient/lib/client", "ImplementationRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]
  ] = js.native
  
  @JSImport("vscode-languageclient/lib/client", "ImplementationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ImplementationParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Location | typingsSlinky.vscodeLanguageserverTypes.mod.LocationLink
    ], 
    Unit, 
    ImplementationRegistrationOptions
  ] = js.native
}
