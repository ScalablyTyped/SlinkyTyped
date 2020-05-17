package typingsSlinky.sharepoint.anon

import typingsSlinky.sharepoint.SP.JsGrid.IStyleType.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllSelected extends js.Object {
  var allSelected: Header = js.native
  var allSelectedHover: Header = js.native
  var normal: Header = js.native
  var normalHover: Header = js.native
  var partSelected: Header = js.native
  var partSelectedHover: Header = js.native
}

object AllSelected {
  @scala.inline
  def apply(
    allSelected: Header,
    allSelectedHover: Header,
    normal: Header,
    normalHover: Header,
    partSelected: Header,
    partSelectedHover: Header
  ): AllSelected = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], allSelectedHover = allSelectedHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any], partSelected = partSelected.asInstanceOf[js.Any], partSelectedHover = partSelectedHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSelected]
  }
  @scala.inline
  implicit class AllSelectedOps[Self <: AllSelected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSelected(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllSelectedHover(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSelectedHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormal(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalHover(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartSelected(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartSelectedHover(value: Header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partSelectedHover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

