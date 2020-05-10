package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fires when the list view starts scrolling by user interaction. Calling the `scrollTo` methods will not fire this event
		 */
@js.native
trait ListViewScrollstartEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
  /**
  			 * The first visible item in the list view when the event fires; this item might not be fully visible. May be -1 on iOS.
  			 */
  var firstVisibleItem: js.Any = js.native
  /**
  			 * The index of the first visible item in the list view when the event fires; this item might not be fully visible.
  			 * Note: The index is `-1` when there are no items in the <Titanium.UI.ListView>.
  			 */
  var firstVisibleItemIndex: Double = js.native
  /**
  			 * The first visible section in the list view when the event fires.
  			 */
  var firstVisibleSection: ListSection = js.native
  /**
  			 * The index of the first visible section in the list view when the event fires.
  			 * Note: The index is `-1` when there are no items in the <Titanium.UI.ListView>.
  			 */
  var firstVisibleSectionIndex: Double = js.native
  /**
  			 * The number of visible items in the list view when the event fires.
  			 */
  var visibleItemCount: Double = js.native
}

object ListViewScrollstartEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    firstVisibleItem: js.Any,
    firstVisibleItemIndex: Double,
    firstVisibleSection: ListSection,
    firstVisibleSectionIndex: Double,
    source: ListView,
    visibleItemCount: Double
  ): ListViewScrollstartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], firstVisibleItem = firstVisibleItem.asInstanceOf[js.Any], firstVisibleItemIndex = firstVisibleItemIndex.asInstanceOf[js.Any], firstVisibleSection = firstVisibleSection.asInstanceOf[js.Any], firstVisibleSectionIndex = firstVisibleSectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], visibleItemCount = visibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewScrollstartEvent]
  }
  @scala.inline
  implicit class ListViewScrollstartEventOps[Self <: ListViewScrollstartEvent] (val x: Self) extends AnyVal {
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
    def withFirstVisibleItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleSection(value: ListSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstVisibleSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisibleSectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibleItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

