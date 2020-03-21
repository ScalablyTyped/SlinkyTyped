package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    CodeLensParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}

