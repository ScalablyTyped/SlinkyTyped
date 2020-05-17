package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderlyingSink[W] extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.native
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.native
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.native
  var `type`: js.UndefOr[scala.Nothing] = js.native
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.native
}

object UnderlyingSink {
  @scala.inline
  def apply[W](): UnderlyingSink[W] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnderlyingSink[W]]
  }
  @scala.inline
  implicit class UnderlyingSinkOps[Self[w] <: UnderlyingSink[w], W] (val x: Self[W]) extends AnyVal {
    @scala.inline
    def duplicate: Self[W] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[W]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[W] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[W] with Other]
    @scala.inline
    def withAbort(value: /* reason */ js.Any => Unit | js.Thenable[Unit]): Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: () => Unit | js.Thenable[Unit]): Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* controller */ WritableStreamDefaultController => Unit | js.Thenable[Unit]): Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: (W, /* controller */ WritableStreamDefaultController) => Unit | js.Thenable[Unit]): Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self[W] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

