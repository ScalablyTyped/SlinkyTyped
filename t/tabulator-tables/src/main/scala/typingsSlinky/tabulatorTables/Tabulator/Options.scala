package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.tabulatorTables.Tabulator.OptionsCell because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined cellHozAlign, cellVertAlign */ @js.native
trait Options
  extends OptionsCells
     with OptionsGeneral
     with OptionsMenu
     with OptionsHistory
     with OptionsLocale
     with OptionsDownload
     with OptionsColumns
     with OptionsRows
     with OptionsData
     with OptionsSorting
     with OptionsFiltering
     with OptionsRowGrouping
     with OptionsPagination
     with OptionsPersistentConfiguration
     with OptionsClipboard
     with OptionsDataTree
     with OptionsHTML {
  var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  var cellVertAlign: js.UndefOr[VerticalAlign] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellHozAlign(value: ColumnDefinitionAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHozAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHozAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHozAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withCellVertAlign(value: VerticalAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellVertAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellVertAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellVertAlign")(js.undefined)
        ret
    }
  }
  
}

