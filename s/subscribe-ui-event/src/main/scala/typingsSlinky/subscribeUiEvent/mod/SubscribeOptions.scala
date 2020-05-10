package typingsSlinky.subscribeUiEvent.mod

import typingsSlinky.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var enableResizeInfo: js.UndefOr[Boolean] = js.native
  var enableScrollInfo: js.UndefOr[Boolean] = js.native
  var enableTouchInfo: js.UndefOr[Boolean] = js.native
  var eventOptions: js.UndefOr[AddEventListenerOptions] = js.native
  var throttleRate: js.UndefOr[Double] = js.native
  var useRAF: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResizeInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResizeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResizeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableScrollInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableScrollInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableScrollInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouchInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEventOptions(value: AddEventListenerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseRAF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRAF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseRAF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRAF")(js.undefined)
        ret
    }
  }
  
}

