package typingsSlinky.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutAction extends js.Object {
  def getDisabledToolTip(): String = js.native
  def getIsDisabledCallback(action: CalloutAction): Boolean = js.native
  def getIsMenu(): Boolean = js.native
  def getIsVisibleCallback(action: CalloutAction): Boolean = js.native
  def getMenuEntries(): js.Array[CalloutActionMenuEntry] = js.native
  def getOnClickCallback(event: js.Any, action: CalloutAction): js.Any = js.native
  def getText(): String = js.native
  def getToolTop(): String = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def render(): Unit = js.native
  def set(options: CalloutActionOptions): Unit = js.native
}

object CalloutAction {
  @scala.inline
  def apply(
    getDisabledToolTip: () => String,
    getIsDisabledCallback: CalloutAction => Boolean,
    getIsMenu: () => Boolean,
    getIsVisibleCallback: CalloutAction => Boolean,
    getMenuEntries: () => js.Array[CalloutActionMenuEntry],
    getOnClickCallback: (js.Any, CalloutAction) => js.Any,
    getText: () => String,
    getToolTop: () => String,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    render: () => Unit,
    set: CalloutActionOptions => Unit
  ): CalloutAction = {
    val __obj = js.Dynamic.literal(getDisabledToolTip = js.Any.fromFunction0(getDisabledToolTip), getIsDisabledCallback = js.Any.fromFunction1(getIsDisabledCallback), getIsMenu = js.Any.fromFunction0(getIsMenu), getIsVisibleCallback = js.Any.fromFunction1(getIsVisibleCallback), getMenuEntries = js.Any.fromFunction0(getMenuEntries), getOnClickCallback = js.Any.fromFunction2(getOnClickCallback), getText = js.Any.fromFunction0(getText), getToolTop = js.Any.fromFunction0(getToolTop), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), render = js.Any.fromFunction0(render), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[CalloutAction]
  }
  @scala.inline
  implicit class CalloutActionOps[Self <: CalloutAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDisabledToolTip(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDisabledToolTip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsDisabledCallback(value: CalloutAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsDisabledCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIsMenu(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsMenu")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIsVisibleCallback(value: CalloutAction => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsVisibleCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMenuEntries(value: () => js.Array[CalloutActionMenuEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuEntries")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOnClickCallback(value: (js.Any, CalloutAction) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnClickCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetToolTop(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToolTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: CalloutActionOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

