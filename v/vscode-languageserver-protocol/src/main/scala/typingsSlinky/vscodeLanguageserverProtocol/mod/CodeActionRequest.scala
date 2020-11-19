package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcodeAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  
  val method: textDocumentSlashcodeAction = js.native
  
  /** @deprecated Use CodeActionRequest.type */
  val resultType: typingsSlinky.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
    ]
  ] = js.native
  
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
