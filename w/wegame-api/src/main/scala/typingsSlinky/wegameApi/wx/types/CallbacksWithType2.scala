package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbacksWithType2[T, F] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ F, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.native
}

object CallbacksWithType2 {
  @scala.inline
  def apply[T, F](): CallbacksWithType2[T, F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksWithType2[T, F]]
  }
  @scala.inline
  implicit class CallbacksWithType2Ops[Self[t, f] <: CallbacksWithType2[t, f], T, F] (val x: Self[T, F]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, F] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, F]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, F]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, F]) with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ F => Unit): Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ T => Unit): Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self[T, F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

