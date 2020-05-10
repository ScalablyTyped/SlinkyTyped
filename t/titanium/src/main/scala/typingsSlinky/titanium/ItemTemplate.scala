package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template that represents the basic appearance of a list item.
  */
@js.native
trait ItemTemplate extends js.Object {
  /**
  	 * Contains an array of subview templates to be added (in order) as children to this view.
  	 */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.native
  /**
  	 * Contains key-value pairs of view events and their listeners that are applied to the ListItem.
  	 */
  var events: js.UndefOr[js.Any] = js.native
  /**
  	 * Contains key-value pairs of view properties and their values that are applied to the ListItem.
  	 */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.native
}

object ItemTemplate {
  @scala.inline
  def apply(): ItemTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemTemplate]
  }
  @scala.inline
  implicit class ItemTemplateOps[Self <: ItemTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildTemplates(value: js.Array[ViewTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Dictionary[ListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

