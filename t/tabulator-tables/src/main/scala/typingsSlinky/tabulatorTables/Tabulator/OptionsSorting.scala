package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSorting extends js.Object {
  /** Array of sorters to be applied on load.	 */
  var initialSort: js.UndefOr[js.Array[Sorter]] = js.native
  /** reverse the order that multiple sorters are applied to the table.	 */
  var sortOrderReverse: js.UndefOr[Boolean] = js.native
}

object OptionsSorting {
  @scala.inline
  def apply(): OptionsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSorting]
  }
  @scala.inline
  implicit class OptionsSortingOps[Self <: OptionsSorting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialSort(value: js.Array[Sorter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrderReverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrderReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrderReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrderReverse")(js.undefined)
        ret
    }
  }
  
}

