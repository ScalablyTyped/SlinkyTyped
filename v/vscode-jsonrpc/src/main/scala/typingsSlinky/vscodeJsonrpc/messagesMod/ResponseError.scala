package typingsSlinky.vscodeJsonrpc.messagesMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-jsonrpc/lib/messages", "ResponseError")
@js.native
class ResponseError[D] protected () extends Error {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
  
  val code: Double = js.native
  
  val data: js.UndefOr[D] = js.native
  
  def toJson(): ResponseErrorLiteral[D] = js.native
}
