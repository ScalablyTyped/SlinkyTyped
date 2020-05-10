package typingsSlinky.storybookReactNative.onDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUIProps extends js.Object {
  var isUIHidden: js.UndefOr[Boolean] = js.native
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.native
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.native
  var stories: js.Any = js.native
  var tabOpen: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object OnDeviceUIProps {
  @scala.inline
  def apply(stories: js.Any): OnDeviceUIProps = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceUIProps]
  }
  @scala.inline
  implicit class OnDeviceUIPropsOps[Self <: OnDeviceUIProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStories(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUIHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUIHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUIHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUIHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardAvoidingViewVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAvoidingViewVerticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardAvoidingViewVerticalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAvoidingViewVerticalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldDisableKeyboardAvoidingView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisableKeyboardAvoidingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldDisableKeyboardAvoidingView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisableKeyboardAvoidingView")(js.undefined)
        ret
    }
    @scala.inline
    def withTabOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

