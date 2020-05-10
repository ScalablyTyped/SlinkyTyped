package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the user stops dragging the list view and the [pullView](Titanium.UI.ListView.pullView) is completely visible.
		 */
@js.native
trait ListViewPullendEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
}

object ListViewPullendEvent {
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewPullendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewPullendEvent]
  }
  @scala.inline
  implicit class ListViewPullendEventOps[Self <: ListViewPullendEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

