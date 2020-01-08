package typingsSlinky.tabulatorDashTables.Tabulator

import typingsSlinky.tabulatorDashTables.tabulatorDashTablesBooleans.`true`
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.days
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.hours
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.minutes
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.months
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.seconds
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.weeks
import typingsSlinky.tabulatorDashTables.tabulatorDashTablesStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tabulatorDashTables.Tabulator._FormatterParams because Already inherited */ trait DateTimeDifferenceParams extends DateTimeParams {
  // Date Time Difference
  var date: js.UndefOr[js.Any] = js.undefined
  var humanize: js.UndefOr[Boolean] = js.undefined
  var suffix: js.UndefOr[Boolean] = js.undefined
  var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.undefined
}

object DateTimeDifferenceParams {
  @scala.inline
  def apply(
    date: js.Any = null,
    humanize: js.UndefOr[Boolean] = js.undefined,
    inputFormat: String = null,
    invalidPlaceholder: `true` | String | Double | ValueStringCallback = null,
    outputFormat: String = null,
    suffix: js.UndefOr[Boolean] = js.undefined,
    unit: years | months | weeks | days | hours | minutes | seconds = null
  ): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(humanize)) __obj.updateDynamic("humanize")(humanize.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (invalidPlaceholder != null) __obj.updateDynamic("invalidPlaceholder")(invalidPlaceholder.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(suffix)) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
}

