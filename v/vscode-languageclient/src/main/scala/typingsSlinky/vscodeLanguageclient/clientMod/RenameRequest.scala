package typingsSlinky.vscodeLanguageclient.clientMod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.RenameRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    RenameParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}

