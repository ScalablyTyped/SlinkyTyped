package typingsSlinky.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionParams
import typingsSlinky.vscodeDashLanguageserverDashProtocol.libProtocolMod.CompletionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: typingsSlinky.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[
    CompletionParams, 
    typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionList | (js.Array[
      typingsSlinky.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CompletionItem
    ]) | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

