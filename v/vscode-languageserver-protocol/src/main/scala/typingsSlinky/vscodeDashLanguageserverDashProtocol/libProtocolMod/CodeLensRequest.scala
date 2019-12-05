package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  val `type`: RequestType[CodeLensParams, js.Array[CodeLens] | Null, Unit, CodeLensRegistrationOptions] = js.native
}

