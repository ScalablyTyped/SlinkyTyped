package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedSelectAutoCompleteEditorParams extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
}

object SharedSelectAutoCompleteEditorParams {
  @scala.inline
  def apply(): SharedSelectAutoCompleteEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
  }
  @scala.inline
  implicit class SharedSelectAutoCompleteEditorParamsOps[Self <: SharedSelectAutoCompleteEditorParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
  }
  
}

