package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.avg
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.bottom
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.length
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.max
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.min
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.sum
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDefinitionSorterParams extends js.Object {
  var alignEmptyValues: js.UndefOr[top | bottom] = js.native
  var format: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[length | sum | max | min | avg] = js.native
}

object ColumnDefinitionSorterParams {
  @scala.inline
  def apply(): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
  @scala.inline
  implicit class ColumnDefinitionSorterParamsOps[Self <: ColumnDefinitionSorterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignEmptyValues(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: length | sum | max | min | avg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

