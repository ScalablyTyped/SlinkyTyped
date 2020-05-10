package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.ListSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments for the <Titanium.UI.ListView.itemsselected> event.
  */
@js.native
trait SelectedItem extends js.Object {
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

object SelectedItem {
  @scala.inline
  def apply(): SelectedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItem]
  }
  @scala.inline
  implicit class SelectedItemOps[Self <: SelectedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

