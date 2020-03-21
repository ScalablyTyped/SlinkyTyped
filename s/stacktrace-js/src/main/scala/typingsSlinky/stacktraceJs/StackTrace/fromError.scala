package typingsSlinky.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.fromError")
@js.native
object fromError extends js.Object {
  def apply(error: js.Error): js.Promise[js.Array[StackFrame]] = js.native
  def apply(error: js.Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
}

