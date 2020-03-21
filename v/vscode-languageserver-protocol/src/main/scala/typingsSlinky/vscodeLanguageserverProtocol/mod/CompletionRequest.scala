package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    CompletionParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

