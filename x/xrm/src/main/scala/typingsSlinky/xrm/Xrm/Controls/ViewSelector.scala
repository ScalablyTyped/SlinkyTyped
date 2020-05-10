package typingsSlinky.xrm.Xrm.Controls

import typingsSlinky.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the view selector.  Use the ViewSelector methods to get or set information about the view selector
  * of the grid control.
  */
@js.native
trait ViewSelector extends js.Object {
  /**
    * Use this method to get a reference to the current view.
    * @returns The current view.
    */
  def getCurrentView(): LookupValue = js.native
  /**
    * Use this method to determine whether the view selector is visible.
    * @returns true if visible, false if not.
    */
  def isVisible(): Boolean = js.native
  /**
    * Use this method to set the current view.
    * @param viewSelectorItem The view selector item.
    */
  def setCurrentView(viewSelectorItem: LookupValue): Unit = js.native
}

object ViewSelector {
  @scala.inline
  def apply(getCurrentView: () => LookupValue, isVisible: () => Boolean, setCurrentView: LookupValue => Unit): ViewSelector = {
    val __obj = js.Dynamic.literal(getCurrentView = js.Any.fromFunction0(getCurrentView), isVisible = js.Any.fromFunction0(isVisible), setCurrentView = js.Any.fromFunction1(setCurrentView))
    __obj.asInstanceOf[ViewSelector]
  }
  @scala.inline
  implicit class ViewSelectorOps[Self <: ViewSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCurrentView(value: () => LookupValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCurrentView(value: LookupValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentView")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

