package typingsSlinky.vscodeDashLanguageclient.libClientMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    CodeLensParams, 
    (js.Array[
      typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
    ]) | Null, 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}

