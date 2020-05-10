package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallAdvancedOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.native
  var receive_progress: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object CallAdvancedOptions {
  @scala.inline
  def apply(): CallAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAdvancedOptions]
  }
  @scala.inline
  implicit class CallAdvancedOptionsOps[Self <: CallAdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisclose_me(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisclose_me: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disclose_me")(js.undefined)
        ret
    }
    @scala.inline
    def withReceive_progress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive_progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceive_progress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive_progress")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

