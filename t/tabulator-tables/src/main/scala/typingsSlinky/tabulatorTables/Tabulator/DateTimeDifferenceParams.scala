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
    def withDate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanize")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: years | months | weeks | days | hours | minutes | seconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

