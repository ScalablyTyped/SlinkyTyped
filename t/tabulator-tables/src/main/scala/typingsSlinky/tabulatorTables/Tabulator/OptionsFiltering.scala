package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.anon.PickFilterfieldvalue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsFiltering extends js.Object {
  /** The dataFiltered callback is triggered after the table dataset is filtered. */
  var dataFiltered: js.UndefOr[
    js.Function2[/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent], Unit]
  ] = js.native
  /** The dataFiltering callback is triggered whenever a filter event occurs, before the filter happens. */
  var dataFiltering: js.UndefOr[js.Function1[/* filters */ js.Array[Filter], Unit]] = js.native
  /**When using real time header filtering, Tabulator will wait 300 miliseconds after a keystroke before triggering the filter. You can customise this delay by using the headerFilterLiveFilterDelay table setup option */
  var headerFilterLiveFilterDelay: js.UndefOr[Double] = js.native
  /** Array of filters to be applied on load.	 */
  var initialFilter: js.UndefOr[js.Array[Filter]] = js.native
  /** array of initial values for header filters.	 */
  var initialHeaderFilter: js.UndefOr[js.Array[PickFilterfieldvalue]] = js.native
}

object OptionsFiltering {
  @scala.inline
  def apply(): OptionsFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsFiltering]
  }
  @scala.inline
  implicit class OptionsFilteringOps[Self <: OptionsFiltering] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFiltered(value: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDataFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltered")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFiltering(value: /* filters */ js.Array[Filter] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltering")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilterLiveFilterDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterLiveFilterDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilterLiveFilterDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilterLiveFilterDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialFilter(value: js.Array[Filter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialHeaderFilter(value: js.Array[PickFilterfieldvalue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeaderFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialHeaderFilter")(js.undefined)
        ret
    }
  }
  
}

