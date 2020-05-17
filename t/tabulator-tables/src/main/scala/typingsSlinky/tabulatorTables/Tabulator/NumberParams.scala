package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.editor
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberParams
  extends SharedEditorParams
     with EditorParams {
  var max: js.UndefOr[Double] = js.native
  // range,number
  var min: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  var verticalNavigation: js.UndefOr[editor | table] = js.native
}

object NumberParams {
  @scala.inline
  def apply(): NumberParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberParams]
  }
  @scala.inline
  implicit class NumberParamsOps[Self <: NumberParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalNavigation(value: editor | table): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalNavigation")(js.undefined)
        ret
    }
  }
  
}

