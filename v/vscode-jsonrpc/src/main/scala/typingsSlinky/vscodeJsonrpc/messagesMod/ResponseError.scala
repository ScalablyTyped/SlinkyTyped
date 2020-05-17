package typingsSlinky.vscodeJsonrpc.messagesMod

import typingsSlinky.std.Error
import typingsSlinky.vscodeJsonrpc.mod.HandlerResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends Error
     with HandlerResult[js.Any, D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
  val code: Double = js.native
  val data: js.UndefOr[D] = js.native
  def toJson(): ResponseErrorLiteral[D] = js.native
}

