package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAddResult extends js.Object {
  var addResult: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  var maxSelections: js.UndefOr[String] = js.native
  var noResults: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAddResult {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAddResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAddResult]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplAddResultOps[Self <: PartialPickImplkeyofImplAddResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResult")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSelections(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(js.undefined)
        ret
    }
  }
  
}

