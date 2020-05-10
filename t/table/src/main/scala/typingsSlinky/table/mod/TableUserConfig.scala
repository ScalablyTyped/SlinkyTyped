package typingsSlinky.table.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableUserConfig extends js.Object {
  var border: js.UndefOr[TableBorder] = js.native
  var columnCount: js.UndefOr[Double] = js.native
  var columnDefault: js.UndefOr[TableColumns] = js.native
  var columns: js.UndefOr[NumberDictionary[TableColumns]] = js.native
  var drawHorizontalLine: js.UndefOr[TableDrawHorizontalLine] = js.native
  var singleLine: js.UndefOr[Boolean] = js.native
}

object TableUserConfig {
  @scala.inline
  def apply(): TableUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableUserConfig]
  }
  @scala.inline
  implicit class TableUserConfigOps[Self <: TableUserConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: TableBorder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDefault(value: TableColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: NumberDictionary[TableColumns]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawHorizontalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontalLine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDrawHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawHorizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLine")(js.undefined)
        ret
    }
  }
  
}

