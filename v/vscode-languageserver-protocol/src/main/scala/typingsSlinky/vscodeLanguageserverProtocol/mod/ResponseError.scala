package typingsSlinky.vscodeLanguageserverProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typingsSlinky.vscodeJsonrpc.mod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}
