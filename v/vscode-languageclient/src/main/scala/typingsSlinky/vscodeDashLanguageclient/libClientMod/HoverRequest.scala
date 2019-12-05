package typingsSlinky.vscodeDashLanguageclient.libClientMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentPositionParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "HoverRequest")
@js.native
object HoverRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    TextDocumentPositionParams, 
    typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Hover | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

