package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxParams
  extends SharedEditorParams
     with EditorParams {
  var indeterminateValue: js.UndefOr[String] = js.native
  // tick
  var tristate: js.UndefOr[Boolean] = js.native
}

object CheckboxParams {
  @scala.inline
  def apply(): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxParams]
  }
  @scala.inline
  implicit class CheckboxParamsOps[Self <: CheckboxParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndeterminateValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminateValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminateValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminateValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTristate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tristate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTristate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tristate")(js.undefined)
        ret
    }
  }
  
}

