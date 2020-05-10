package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user drags the list view past the top edge of the [pullView](Titanium.UI.ListView.pullView).
		 */
@js.native
trait ListViewPullEvent extends ListViewBaseEvent {
  /**
  			 * Determines if the `pullView` is completely visible (true) or partially hidden (false).
  			 */
  var active: Boolean = js.native
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
}

object ListViewPullEvent {
  @scala.inline
  def apply(active: Boolean, bubbles: Boolean, source: ListView): ListViewPullEvent = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPullEvent]
  }
  @scala.inline
  implicit class ListViewPullEventOps[Self <: ListViewPullEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

