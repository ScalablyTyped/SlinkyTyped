package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableOption extends js.Object {
  var afterLoad: js.UndefOr[js.Function1[/* event */ AfterLoadEvent, Unit]] = js.native
  var checkByClickRow: js.UndefOr[Boolean] = js.native
  var checkable: js.UndefOr[Boolean] = js.native
  var checkedClass: js.UndefOr[String] = js.native
  var checksChanged: js.UndefOr[js.Function1[/* event */ ChecksChangeEvent, Unit]] = js.native
  var colHover: js.UndefOr[Boolean] = js.native
  var fixCellHeight: js.UndefOr[Boolean] = js.native
  var fixedHeader: js.UndefOr[Boolean] = js.native
  var fixedHeaderOffset: js.UndefOr[Double] = js.native
  var fixedLeftWidth: js.UndefOr[String] = js.native
  var fixedRightWidth: js.UndefOr[String] = js.native
  var flexHeadDrag: js.UndefOr[Boolean] = js.native
  var minColWidth: js.UndefOr[Double] = js.native
  var minFixedLeftWidth: js.UndefOr[Double] = js.native
  var minFixedRightWidth: js.UndefOr[Double] = js.native
  var minFlexAreaWidth: js.UndefOr[Double] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  var rowHover: js.UndefOr[Boolean] = js.native
  var scrollPos: js.UndefOr[String] = js.native
  var selectable: js.UndefOr[Boolean | js.Object] = js.native
  var sizeChanged: js.UndefOr[js.Function1[/* event */ SizeChangeEvent, Unit]] = js.native
  var sort: js.UndefOr[js.Function1[/* event */ SortEvent, Unit]] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  var storage: js.UndefOr[Boolean] = js.native
}

object DataTableOption {
  @scala.inline
  def apply(): DataTableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTableOption]
  }
  @scala.inline
  implicit class DataTableOptionOps[Self <: DataTableOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterLoad(value: /* event */ AfterLoadEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckByClickRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkByClickRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckByClickRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkByClickRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksChanged(value: /* event */ ChecksChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChecksChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withColHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHover")(js.undefined)
        ret
    }
    @scala.inline
    def withFixCellHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixCellHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixCellHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixCellHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeaderOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaderOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeaderOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeaderOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedLeftWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLeftWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLeftWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRightWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRightWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexHeadDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexHeadDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexHeadDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexHeadDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFixedLeftWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFixedLeftWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFixedLeftWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFixedLeftWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFixedRightWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFixedRightWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFixedRightWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFixedRightWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFlexAreaWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFlexAreaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFlexAreaWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFlexAreaWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPos")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeChanged(value: /* event */ SizeChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSizeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: /* event */ SortEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withStorage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(js.undefined)
        ret
    }
  }
  
}

