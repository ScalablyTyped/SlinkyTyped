package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataInView extends js.Object {
  var FilterFields: String = js.native
  var FilterLink: String = js.native
  var FirstRow: Double = js.native
  /** Either "0" or "1" */
  var ForceNoHierarchy: String = js.native
  var HierarchyHasIndention: String = js.native
  var LastRow: Double = js.native
  /** Link to the next page  (not defined if not available) */
  var NextHref: String = js.native
  /** Link to the previous page (not defined if not available) */
  var PrevHref: String = js.native
  var Row: js.Array[Item] = js.native
  var SortDir: String = js.native
  var SortField: String = js.native
}

object ListDataInView {
  @scala.inline
  def apply(
    FilterFields: String,
    FilterLink: String,
    FirstRow: Double,
    ForceNoHierarchy: String,
    HierarchyHasIndention: String,
    LastRow: Double,
    NextHref: String,
    PrevHref: String,
    Row: js.Array[Item],
    SortDir: String,
    SortField: String
  ): ListDataInView = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], FilterLink = FilterLink.asInstanceOf[js.Any], FirstRow = FirstRow.asInstanceOf[js.Any], ForceNoHierarchy = ForceNoHierarchy.asInstanceOf[js.Any], HierarchyHasIndention = HierarchyHasIndention.asInstanceOf[js.Any], LastRow = LastRow.asInstanceOf[js.Any], NextHref = NextHref.asInstanceOf[js.Any], PrevHref = PrevHref.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], SortDir = SortDir.asInstanceOf[js.Any], SortField = SortField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataInView]
  }
  @scala.inline
  implicit class ListDataInViewOps[Self <: ListDataInView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceNoHierarchy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceNoHierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchyHasIndention(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HierarchyHasIndention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrevHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

