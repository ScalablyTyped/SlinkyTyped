package typingsSlinky.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortHandle[TReturn] extends js.Object {
  def abort(): TReturn = js.native
}

object AbortHandle {
  @scala.inline
  def apply[TReturn](abort: () => TReturn): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
  @scala.inline
  implicit class AbortHandleOps[Self[treturn] <: AbortHandle[treturn], TReturn] (val x: Self[TReturn]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TReturn] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TReturn]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TReturn] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TReturn] with Other]
    @scala.inline
    def withAbort(value: () => TReturn): Self[TReturn] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

