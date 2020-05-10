package typingsSlinky.storybookReactNative.previewMod

import typingsSlinky.storybookReactNative.AnonBackgroundColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Params extends js.Object {
  var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.native
  var disableWebsockets: Boolean = js.native
  var host: String = js.native
  var initialSelection: js.Any = js.native
  var isUIHidden: Boolean = js.native
  var keyboardAvoidingViewVerticalOffset: Double = js.native
  var onDeviceUI: Boolean = js.native
  var port: Double = js.native
  var query: String = js.native
  var resetStorybook: Boolean = js.native
  var secured: Boolean = js.native
  var shouldDisableKeyboardAvoidingView: Boolean = js.native
  var shouldPersistSelection: Boolean = js.native
  var tabOpen: Double = js.native
  var theme: AnonBackgroundColor = js.native
}

object Params {
  @scala.inline
  def apply(
    disableWebsockets: Boolean,
    host: String,
    initialSelection: js.Any,
    isUIHidden: Boolean,
    keyboardAvoidingViewVerticalOffset: Double,
    onDeviceUI: Boolean,
    port: Double,
    query: String,
    resetStorybook: Boolean,
    secured: Boolean,
    shouldDisableKeyboardAvoidingView: Boolean,
    shouldPersistSelection: Boolean,
    tabOpen: Double,
    theme: AnonBackgroundColor
  ): Params = {
    val __obj = js.Dynamic.literal(disableWebsockets = disableWebsockets.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], initialSelection = initialSelection.asInstanceOf[js.Any], isUIHidden = isUIHidden.asInstanceOf[js.Any], keyboardAvoidingViewVerticalOffset = keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any], onDeviceUI = onDeviceUI.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resetStorybook = resetStorybook.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any], shouldDisableKeyboardAvoidingView = shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any], shouldPersistSelection = shouldPersistSelection.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  @scala.inline
  implicit class ParamsOps[Self <: Params] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableWebsockets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebsockets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSelection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUIHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUIHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardAvoidingViewVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAvoidingViewVerticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDeviceUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetStorybook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStorybook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldDisableKeyboardAvoidingView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldDisableKeyboardAvoidingView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldPersistSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldPersistSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: AnonBackgroundColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAsyncStorageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncStorage")(null)
        ret
    }
  }
  
}

