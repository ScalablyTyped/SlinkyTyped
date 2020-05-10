package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the list view displays the reference item.
		 */
@js.native
trait ListViewMarkerEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
  /**
  			 * section item index of the reference item.
  			 */
  var itemIndex: Double = js.native
  /**
  			 * section index of the reference item.
  			 */
  var sectionIndex: Double = js.native
}

object ListViewMarkerEvent {
  @scala.inline
  def apply(bubbles: Boolean, itemIndex: Double, sectionIndex: Double, source: ListView): ListViewMarkerEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerEvent]
  }
  @scala.inline
  implicit class ListViewMarkerEventOps[Self <: ListViewMarkerEvent] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

