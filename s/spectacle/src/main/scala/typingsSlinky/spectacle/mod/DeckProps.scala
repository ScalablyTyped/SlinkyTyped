package typingsSlinky.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeckProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayDuration: js.UndefOr[Double] = js.native
  var autoplayLoop: js.UndefOr[Boolean] = js.native
  var autoplayOnStart: js.UndefOr[Boolean] = js.native
  var contentHeight: js.UndefOr[String] = js.native
  var contentWidth: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var disableKeyboardControls: js.UndefOr[Boolean] = js.native
  var disableTouchControls: js.UndefOr[Boolean] = js.native
  var globalStyles: js.UndefOr[Boolean] = js.native
  var history: js.UndefOr[js.Any] = js.native
  var onStateChange: js.UndefOr[
    js.Function2[/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String], Unit]
  ] = js.native
  var progress: js.UndefOr[progressType] = js.native
   // Needs a type, see https://github.com/ReactTraining/history
  var showFullscreenControl: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var transition: js.UndefOr[js.Array[transitionType]] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
}

object DeckProps {
  @scala.inline
  def apply(): DeckProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeckProps]
  }
  @scala.inline
  implicit class DeckPropsOps[Self <: DeckProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoplayOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplayOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplayOnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withContentWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableKeyboardControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableKeyboardControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardControls")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouchControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouchControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouchControls")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: (/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: progressType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFullscreenControl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullscreenControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFullscreenControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFullscreenControl")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: Theme): Self = {
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
    @scala.inline
    def withTransition(value: js.Array[transitionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
  }
  
}

