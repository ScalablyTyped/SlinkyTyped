package typingsSlinky.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetaData extends js.Object {
  /**
    * The column's name
    */
  var colName: String = js.native
  /**
    * The length, for char, varchar, nvarchar and varbinary.
    */
  var dataLength: js.UndefOr[Double] = js.native
  /**
    * The precision. Only applicable to numeric and decimal.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * The scale. Only applicable to numeric, decimal, time, datetime2 and datetimeoffset.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * The column type.
    */
  var `type`: ColumnType = js.native
}

object ColumnMetaData {
  @scala.inline
  def apply(colName: String, `type`: ColumnType): ColumnMetaData = {
    val __obj = js.Dynamic.literal(colName = colName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetaData]
  }
  @scala.inline
  implicit class ColumnMetaDataOps[Self <: ColumnMetaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ColumnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

