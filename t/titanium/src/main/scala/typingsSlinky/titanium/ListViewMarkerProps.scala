package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter for [setMarker](Titanium.UI.ListView.setMarker) and [addMarker](Titanium.UI.ListView.addMarker) methods.
  */
@js.native
trait ListViewMarkerProps extends js.Object {
  /**
  	 * The itemIndex of the reference item.
  	 */
  var itemIndex: js.UndefOr[Double] = js.native
  /**
  	 * The sectionIndex of the reference item.
  	 */
  var sectionIndex: js.UndefOr[Double] = js.native
}

object ListViewMarkerProps {
  @scala.inline
  def apply(): ListViewMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMarkerProps]
  }
  @scala.inline
  implicit class ListViewMarkerPropsOps[Self <: ListViewMarkerProps] (val x: Self) extends AnyVal {
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

