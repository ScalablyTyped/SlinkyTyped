package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarParams extends TrafficParams {
  // Progress Bar
  var legend: js.UndefOr[String | `true` | ValueStringCallback] = js.native
  var legendAlign: js.UndefOr[Align] = js.native
  var legendColor: js.UndefOr[Color] = js.native
}

object ProgressBarParams {
  @scala.inline
  def apply(): ProgressBarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarParams]
  }
  @scala.inline
  implicit class ProgressBarParamsOps[Self <: ProgressBarParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLegendFunction1(value: /* value */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLegend(value: String | `true` | ValueStringCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendAlign(value: Align): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendColorFunction1(value: /* value */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLegendColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendColor")(js.undefined)
        ret
    }
  }
  
}

