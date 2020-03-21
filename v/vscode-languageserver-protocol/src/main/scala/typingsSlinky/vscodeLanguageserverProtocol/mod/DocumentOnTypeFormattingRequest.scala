package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.DocumentOnTypeFormattingRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DocumentOnTypeFormattingRequest")
@js.native
object DocumentOnTypeFormattingRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    DocumentOnTypeFormattingParams, 
    js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    Unit, 
    DocumentOnTypeFormattingRegistrationOptions
  ] = js.native
}

