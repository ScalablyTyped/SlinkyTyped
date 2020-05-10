package typingsSlinky.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when a list row is moved to a different location by the user.
		 */
@js.native
trait ListViewMoveEvent extends ListViewBaseEvent {
  /**
  			 * false. This event does not bubble.
  			 */
  var bubbles: Boolean = js.native
  /**
  			 * The item ID bound to the list item that generated the event.
  			 */
  var itemId: String = js.native
  /**
  			 * Item index.
  			 */
  var itemIndex: Double = js.native
  /**
  			 * List section from which the item is moved.
  			 */
  var section: ListSection = js.native
  /**
  			 * Section index.
  			 */
  var sectionIndex: Double = js.native
  /**
  			 * Position within the `targetSection`.
  			 */
  var targetItemIndex: Double = js.native
  /**
  			 * List section to which the item is moved. Might be the same as `section` property.
  			 */
  var targetSection: ListSection = js.native
  /**
  			 * Section index.
  			 */
  var targetSectionIndex: Double = js.native
}

object ListViewMoveEvent {
  @scala.inline
  def apply(
    bubbles: Boolean,
    itemId: String,
    itemIndex: Double,
    section: ListSection,
    sectionIndex: Double,
    source: ListView,
    targetItemIndex: Double,
    targetSection: ListSection,
    targetSectionIndex: Double
  ): ListViewMoveEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetItemIndex = targetItemIndex.asInstanceOf[js.Any], targetSection = targetSection.asInstanceOf[js.Any], targetSectionIndex = targetSectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMoveEvent]
  }
  @scala.inline
  implicit class ListViewMoveEventOps[Self <: ListViewMoveEvent] (val x: Self) extends AnyVal {
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
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSection(value: ListSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSection(value: ListSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

