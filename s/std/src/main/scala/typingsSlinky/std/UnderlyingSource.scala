package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderlyingSource[R] extends js.Object {
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.native
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.native
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.native
  var `type`: js.UndefOr[scala.Nothing] = js.native
}

object UnderlyingSource {
  @scala.inline
  def apply[R](): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  @scala.inline
  implicit class UnderlyingSourceOps[Self[r] <: UnderlyingSource[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def withCancel(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancel: Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPull: Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* controller */ ReadableStreamDefaultController[R] => Unit | js.Thenable[Unit]): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: scala.Nothing): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

