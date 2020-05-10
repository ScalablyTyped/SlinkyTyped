package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeOptions extends js.Object {
  var preventAbort: js.UndefOr[scala.Boolean] = js.native
  var preventCancel: js.UndefOr[scala.Boolean] = js.native
  var preventClose: js.UndefOr[scala.Boolean] = js.native
  var signal: js.UndefOr[org.scalajs.dom.experimental.AbortSignal] = js.native
}

object PipeOptions {
  @scala.inline
  def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  @scala.inline
  implicit class PipeOptionsOps[Self <: PipeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventAbort(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventAbort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventCancel(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventClose(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: org.scalajs.dom.experimental.AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
  }
  
}

