package typingsSlinky.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.ReferenceParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    ReferenceParams, 
    (js.Array[
      typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

