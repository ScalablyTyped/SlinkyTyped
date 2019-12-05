package typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: RequestType[ReferenceParams, js.Array[Location] | Null, Unit, TextDocumentRegistrationOptions] = js.native
}

