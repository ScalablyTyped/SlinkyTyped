package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    InitializeParams, 
    InitializeResult, 
    typingsSlinky.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}

