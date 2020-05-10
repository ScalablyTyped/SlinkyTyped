package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the tab is no longer selected.
		 */
@js.native
trait TabUnselectedEvent extends TabBaseEvent {
  /**
  			 * Index of the current active tab.
  			 */
  var index: Double = js.native
  /**
  			 * Index of the previous active tab.
  			 */
  var previousIndex: Double = js.native
  /**
  			 * Previous active tab object.
  			 */
  var previousTab: Tab = js.native
  /**
  			 * Current active tab object.
  			 */
  var tab: Tab = js.native
}

object TabUnselectedEvent {
  @scala.inline
  def apply(index: Double, previousIndex: Double, previousTab: Tab, source: Tab, tab: Tab): TabUnselectedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], previousIndex = previousIndex.asInstanceOf[js.Any], previousTab = previousTab.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabUnselectedEvent]
  }
  @scala.inline
  implicit class TabUnselectedEventOps[Self <: TabUnselectedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTab(value: Tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: Tab): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

