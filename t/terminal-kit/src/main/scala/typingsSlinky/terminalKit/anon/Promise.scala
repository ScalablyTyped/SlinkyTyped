package typingsSlinky.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise extends js.Object {
  var promise: js.Promise[js.UndefOr[String]] = js.native
  def abort(): Unit = js.native
}

object Promise {
  @scala.inline
  def apply(abort: () => Unit, promise: js.Promise[js.UndefOr[String]]): Promise = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  @scala.inline
  implicit class PromiseOps[Self <: Promise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPromise(value: js.Promise[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

