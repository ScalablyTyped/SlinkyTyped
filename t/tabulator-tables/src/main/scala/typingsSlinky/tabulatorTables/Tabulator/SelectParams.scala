package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.editor
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.hybrid
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectParams
  extends SharedEditorParams
     with SharedSelectAutoCompleteEditorParams
     with _EditorParams {
  var listItemFormatter: js.UndefOr[js.Function2[/* value */ String, /* text */ String, String]] = js.native
  var values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String = js.native
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.native
}

object SelectParams {
  @scala.inline
  def apply(values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): SelectParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParams]
  }
  @scala.inline
  implicit class SelectParamsOps[Self <: SelectParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemFormatter(value: (/* value */ String, /* text */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemFormatter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutListItemFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalNavigation(value: editor | table | hybrid): Self = {
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

