package typingsSlinky.tabulatorDashTables.Tabulator

import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.avg
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.bottom
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.length
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.max
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.min
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.sum
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinitionSorterParams extends js.Object {
  var alignEmptyValues: js.UndefOr[top | bottom] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String | Boolean] = js.undefined
  var `type`: js.UndefOr[length | sum | max | min | avg] = js.undefined
}

object ColumnDefinitionSorterParams {
  @scala.inline
  def apply(
    alignEmptyValues: top | bottom = null,
    format: String = null,
    locale: String | Boolean = null,
    `type`: length | sum | max | min | avg = null
  ): ColumnDefinitionSorterParams = {
    val __obj = js.Dynamic.literal()
    if (alignEmptyValues != null) __obj.updateDynamic("alignEmptyValues")(alignEmptyValues.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinitionSorterParams]
  }
}

