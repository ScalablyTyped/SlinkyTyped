package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionRequest {
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.method")
  @js.native
  val method: textDocumentSlashcodeAction = js.native
  
  /** @deprecated Use CodeActionRequest.type */
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.resultType")
  @js.native
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
    ]
  ] = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeActionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CodeActionParams, 
    (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
    ], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
