package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  /***
  		* @property fromCell
  		* @type {Integer}
  		*/
  var fromCell: Double = js.native
  /***
  		* @property fromRow
  		* @type {Integer}
  		*/
  var fromRow: Double = js.native
  /***
  		* @property toCell
  		* @type {Integer}
  		*/
  var toCell: Double = js.native
  /***
  		* @property toRow
  		* @type {Integer}
  		*/
  var toRow: Double = js.native
  /***
  		* Returns whether a range contains a given cell.
  		* @method contains
  		* @param row {Integer}
  		* @param cell {Integer}
  		* @return {Boolean}
  		*/
  def contains(row: Double, cell: Double): Boolean = js.native
  /***
  		* Returns whether a range represents a single cell.
  		* @method isSingleCell
  		* @return {Boolean}
  		*/
  def isSingleCell(): Boolean = js.native
  /***
  		* Returns whether a range represents a single row.
  		* @method isSingleRow
  		* @return {Boolean}
  		*/
  def isSingleRow(): Boolean = js.native
}

object Range {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    fromCell: Double,
    fromRow: Double,
    isSingleCell: () => Boolean,
    isSingleRow: () => Boolean,
    toCell: Double,
    toRow: Double
  ): Range = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), fromCell = fromCell.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], isSingleCell = js.Any.fromFunction0(isSingleCell), isSingleRow = js.Any.fromFunction0(isSingleRow), toCell = toCell.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFromCell(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSingleCell(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSingleCell")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSingleRow(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSingleRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToCell(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

