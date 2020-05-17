package typingsSlinky.sharepoint

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutActionOptions extends js.Object {
  var disabledTooltip: String = js.native
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  var menuEntries: js.Array[CalloutActionMenuEntry] = js.native
  /** Text for the action link */
  var text: String = js.native
  var tooltip: String = js.native
  /** Callback which returns if the action link is enabled */
  def isEnabledCallback(action: CalloutAction): Boolean = js.native
  /** Callback which returns if the action link is visible */
  def isVisibleCallback(action: CalloutAction): Boolean = js.native
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  def onClickCallback(event: Event, action: CalloutAction): js.Any = js.native
}

object CalloutActionOptions {
  @scala.inline
  def apply(
    disabledTooltip: String,
    isEnabledCallback: CalloutAction => Boolean,
    isVisibleCallback: CalloutAction => Boolean,
    menuEntries: js.Array[CalloutActionMenuEntry],
    onClickCallback: (Event, CalloutAction) => js.Any,
    text: String,
    tooltip: String
  ): CalloutActionOptions = {
    val __obj = js.Dynamic.literal(disabledTooltip = disabledTooltip.asInstanceOf[js.Any], isEnabledCallback = js.Any.fromFunction1(isEnabledCallback), isVisibleCallback = js.Any.fromFunction1(isVisibleCallback), menuEntries = menuEntries.asInstanceOf[js.Any], onClickCallback = js.Any.fromFunction2(onClickCallback), text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutActionOptions]
  }
  @scala.inline
  implicit class CalloutActionOptionsOps[Self <: CalloutActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabledCallback(value: CalloutAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabledCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsVisibleCallback(value: CalloutAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisibleCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMenuEntries(value: js.Array[CalloutActionMenuEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClickCallback(value: (Event, CalloutAction) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

