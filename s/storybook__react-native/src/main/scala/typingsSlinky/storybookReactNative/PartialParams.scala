package typingsSlinky.storybookReactNative

import typingsSlinky.storybookReactNative.previewMod.AsyncStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/react-native.@storybook/react-native/dist/preview.Params> */
@js.native
trait PartialParams extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage] = js.native
  var disableWebsockets: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var initialSelection: js.UndefOr[js.Any] = js.native
  var isUIHidden: js.UndefOr[Boolean] = js.native
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.native
  var onDeviceUI: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
  var query: js.UndefOr[String] = js.native
  var resetStorybook: js.UndefOr[Boolean] = js.native
  var secured: js.UndefOr[Boolean] = js.native
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.native
  var shouldPersistSelection: js.UndefOr[Boolean] = js.native
  var tabOpen: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[AnonBackgroundColor] = js.native
}

object PartialParams {
  @scala.inline
  def apply(): PartialParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParams]
  }
  @scala.inline
  implicit class PartialParamsOps[Self <: PartialParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncStorage(value: AsyncStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWebsockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebsockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWebsockets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebsockets")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelection")(js.undefined)
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
    def withOnDeviceUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDeviceUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceUI")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withResetStorybook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStorybook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetStorybook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStorybook")(js.undefined)
        ret
    }
    @scala.inline
    def withSecured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(js.undefined)
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
    def withShouldPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPersistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldPersistSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPersistSelection")(js.undefined)
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
    def withTheme(value: AnonBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

