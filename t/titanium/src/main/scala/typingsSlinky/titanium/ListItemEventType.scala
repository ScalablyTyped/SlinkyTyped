package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.prefetch> and <Titanium.UI.ListView.cancelprefetch> events.
  */
@js.native
trait ListItemEventType extends js.Object {
  /**
  	 * The item ID bound to the list item that generated the event.
  	 */
  var itemId: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Item index.
  	 */
  var itemIndex: js.UndefOr[Double] = js.native
  /**
  	 * List section if the item is contained in a list section.
  	 */
  var section: js.UndefOr[ListSection] = js.native
  /**
  	 * Section index.
  	 */
  var sectionIndex: js.UndefOr[Double] = js.native
}

object ListItemEventType {
  @scala.inline
  def apply(): ListItemEventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemEventType]
  }
  @scala.inline
  implicit class ListItemEventTypeOps[Self <: ListItemEventType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: ListSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionIndex")(js.undefined)
        ret
    }
  }
  
}

