package typingsSlinky.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when the query finds a new batch of matching items.
			 */
@js.native
trait SearchQueryFounditemsEvent extends SearchQueryBaseEvent {
  /**
  				 * The number of items that are currently fetched.
  				 */
  var foundItemsCount: Double = js.native
  /**
  				 * An array of indexed items that match the specified query.
  				 */
  var items: js.Array[SearchableItem] = js.native
}

object SearchQueryFounditemsEvent {
  @scala.inline
  def apply(foundItemsCount: Double, items: js.Array[SearchableItem], source: SearchQuery): SearchQueryFounditemsEvent = {
    val __obj = js.Dynamic.literal(foundItemsCount = foundItemsCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryFounditemsEvent]
  }
  @scala.inline
  implicit class SearchQueryFounditemsEventOps[Self <: SearchQueryFounditemsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFoundItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[SearchableItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

