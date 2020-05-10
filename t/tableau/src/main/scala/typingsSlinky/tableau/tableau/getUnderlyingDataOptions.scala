package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait getUnderlyingDataOptions extends js.Object {
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[Boolean] = js.native
  /** Return all the columns for the data source. Default is false. */
  var ignoreAllColumns: js.UndefOr[Boolean] = js.native
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[Boolean] = js.native
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: Double = js.native
}

object getUnderlyingDataOptions {
  @scala.inline
  def apply(maxRows: Double): getUnderlyingDataOptions = {
    val __obj = js.Dynamic.literal(maxRows = maxRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[getUnderlyingDataOptions]
  }
  @scala.inline
  implicit class getUnderlyingDataOptionsOps[Self <: getUnderlyingDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreAliases(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAliases")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAllColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAllColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAllColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAllColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSelection")(js.undefined)
        ret
    }
  }
  
}

