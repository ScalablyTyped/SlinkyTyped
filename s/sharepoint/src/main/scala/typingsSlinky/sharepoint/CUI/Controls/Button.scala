package typingsSlinky.sharepoint.CUI.Controls

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import typingsSlinky.sharepoint.CUI.Control
import typingsSlinky.sharepoint.CUI.ISelectableControl
import typingsSlinky.sharepoint.CUI.Root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Button
  extends Control
     with ISelectableControl {
  def createComponentForDisplayModeInternal(displayMode: String): js.Any = js.native
  def createDOMElementForDisplayMode(displayMode: String): js.Any = js.native
  def deselect(): Unit = js.native
  def focusOnDisplayedComponent(): Unit = js.native
  def getCommandValueId(): String = js.native
  def getDropDownDOMElementForDisplayMode(displayMode: String): Unit = js.native
  def getLabel(): String = js.native
  def getMenuItemId(): String = js.native
  def getTextValue(): String = js.native
  def handleMouseBlur(e: FocusEvent): js.Any = js.native
  def handleMouseFocus(e: FocusEvent): js.Any = js.native
  def handleTabBlur(e: FocusEvent): js.Any = js.native
  def handleTabFocus(e: FocusEvent): js.Any = js.native
  def onClick(e: Event): Unit = js.native
  def onEnabledChanged(enabled: Boolean): js.Any = js.native
  def onMenuClosed(): Unit = js.native
  def receiveFocus(): Unit = js.native
}

object Button {
  @scala.inline
  def apply(
    createComponentForDisplayMode: String => js.Any,
    createComponentForDisplayModeInternal: String => js.Any,
    createDOMElementForDisplayMode: String => js.Any,
    deselect: () => Unit,
    dispose: () => Unit,
    focusOnDisplayedComponent: () => Unit,
    getCommandValueId: () => String,
    getDropDownDOMElementForDisplayMode: String => Unit,
    getLabel: () => String,
    getMenuItemId: () => String,
    getTextValue: () => String,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    handleMouseBlur: FocusEvent => js.Any,
    handleMouseFocus: FocusEvent => js.Any,
    handleTabBlur: FocusEvent => js.Any,
    handleTabFocus: FocusEvent => js.Any,
    onClick: Event => Unit,
    onEnabledChanged: Boolean => js.Any,
    onMenuClosed: () => Unit,
    receiveFocus: () => Unit,
    set_enabled: Boolean => Boolean
  ): Button = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), createComponentForDisplayModeInternal = js.Any.fromFunction1(createComponentForDisplayModeInternal), createDOMElementForDisplayMode = js.Any.fromFunction1(createDOMElementForDisplayMode), deselect = js.Any.fromFunction0(deselect), dispose = js.Any.fromFunction0(dispose), focusOnDisplayedComponent = js.Any.fromFunction0(focusOnDisplayedComponent), getCommandValueId = js.Any.fromFunction0(getCommandValueId), getDropDownDOMElementForDisplayMode = js.Any.fromFunction1(getDropDownDOMElementForDisplayMode), getLabel = js.Any.fromFunction0(getLabel), getMenuItemId = js.Any.fromFunction0(getMenuItemId), getTextValue = js.Any.fromFunction0(getTextValue), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), handleMouseBlur = js.Any.fromFunction1(handleMouseBlur), handleMouseFocus = js.Any.fromFunction1(handleMouseFocus), handleTabBlur = js.Any.fromFunction1(handleTabBlur), handleTabFocus = js.Any.fromFunction1(handleTabFocus), onClick = js.Any.fromFunction1(onClick), onEnabledChanged = js.Any.fromFunction1(onEnabledChanged), onMenuClosed = js.Any.fromFunction0(onMenuClosed), receiveFocus = js.Any.fromFunction0(receiveFocus), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateComponentForDisplayModeInternal(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComponentForDisplayModeInternal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDOMElementForDisplayMode(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDOMElementForDisplayMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeselect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusOnDisplayedComponent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOnDisplayedComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCommandValueId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommandValueId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDropDownDOMElementForDisplayMode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDropDownDOMElementForDisplayMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMenuItemId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItemId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHandleMouseBlur(value: FocusEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleMouseFocus(value: FocusEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleTabBlur(value: FocusEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTabBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandleTabFocus(value: FocusEvent => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleTabFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClick(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnEnabledChanged(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnabledChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMenuClosed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuClosed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReceiveFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveFocus")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

