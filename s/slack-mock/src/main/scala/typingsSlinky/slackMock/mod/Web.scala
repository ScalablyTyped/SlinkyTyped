package typingsSlinky.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web[T] extends js.Object {
  var calls: js.Array[WebCall[T]] = js.native
  def addResponse(opts: WebOptions[T]): Unit = js.native
  def reset(): Unit = js.native
}

object Web {
  @scala.inline
  def apply[T](addResponse: WebOptions[T] => Unit, calls: js.Array[WebCall[T]], reset: () => Unit): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1(addResponse), calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Web[T]]
  }
  @scala.inline
  implicit class WebOps[Self[t] <: Web[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddResponse(value: WebOptions[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResponse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalls(value: js.Array[WebCall[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

