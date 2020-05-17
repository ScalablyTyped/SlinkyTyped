package typingsSlinky.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Prevents a DOM sub-tree from receiving tab navigations and focus.
  **/
@js.native
trait TabContainer extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the child DOM element that receives tab focus.
    **/
  var childFocus: HTMLElement = js.native
  /**
    * Gets or sets the tab index of this container.
    **/
  var tabIndex: Double = js.native
  //#endregion Constructors
  //#region Methods
  /**
    * Releases resources held by this TabContainer. Call this method when the TabContainer is no longer needed. After calling this method, the TabContainer becomes unusable.
    **/
  def dispose(): Unit = js.native
}

object TabContainer {
  @scala.inline
  def apply(childFocus: HTMLElement, dispose: () => Unit, tabIndex: Double): TabContainer = {
    val __obj = js.Dynamic.literal(childFocus = childFocus.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContainer]
  }
  @scala.inline
  implicit class TabContainerOps[Self <: TabContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFocus(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

