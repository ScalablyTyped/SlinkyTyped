package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    CodeActionParams, 
    (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.Command | typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}

