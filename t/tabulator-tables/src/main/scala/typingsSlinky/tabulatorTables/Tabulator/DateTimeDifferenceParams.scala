package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.days
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hours
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.minutes
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.months
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.seconds
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.weeks
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.tabulatorTables.Tabulator._FormatterParams because Already inherited */ @js.native
trait DateTimeDifferenceParams extends DateTimeParams {
  // Date Time Difference
  var date: js.UndefOr[js.Any] = js.native
  var humanize: js.UndefOr[Boolean] = js.native
  var suffix: js.UndefOr[Boolean] = js.native
  var unit: js.UndefOr[years | months | weeks | days | hours | minutes | seconds] = js.native
}

object DateTimeDifferenceParams {
  @scala.inline
  def apply(): DateTimeDifferenceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeDifferenceParams]
  }
  @scala.inline
  implicit class DateTimeDifferenceParamsOps[Self <: DateTimeDifferenceParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setHumanize(value: Boolean): Self = this.set("humanize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanize: Self = this.set("humanize", js.undefined)
    @scala.inline
    def setSuffix(value: Boolean): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setUnit(value: years | months | weeks | days | hours | minutes | seconds): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

