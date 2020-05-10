package typingsSlinky.uiGrid.mod.grouping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridOptions extends js.Object {
  /**
    * Enable row grouping for entire grid.
    * Defaults to true
    * @default true
    */
  var enableGroupHeaderSelection: js.UndefOr[Boolean] = js.native
  /**
    * Allows group header rows to be selected.
    * Defaults to false
    * @default false
    */
  var enableGrouping: js.UndefOr[Boolean] = js.native
  /**
    * The string to use for the grouping header row label on rows which contain
    * a null or undefined value in the grouped column.
    * Defaults to "Null"
    * @default 'Null'
    */
  var groupingNullLabel: js.UndefOr[String] = js.native
  /**
    * Shows counts on the groupHeader rows.
    * Note that if you are using a cellFilter or a sortingAlgorithm which relies on a specific format or data
    * type, showing counts may cause that to break, since the group header rows will always be a string with
    * groupingShowCounts enabled. Defaults to true except on columns of type 'date'
    * @default true
    */
  var groupingShowCounts: js.UndefOr[Boolean] = js.native
}

object IGridOptions {
  @scala.inline
  def apply(): IGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGridOptions]
  }
  @scala.inline
  implicit class IGridOptionsOps[Self <: IGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableGroupHeaderSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupHeaderSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGroupHeaderSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGroupHeaderSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingNullLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingNullLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingNullLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingNullLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupingShowCounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingShowCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupingShowCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupingShowCounts")(js.undefined)
        ret
    }
  }
  
}

