package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'noResults'> */
@js.native
trait PickImplnoResults extends js.Object {
  var noResults: String = js.native
}

object PickImplnoResults {
  @scala.inline
  def apply(noResults: String): PickImplnoResults = {
    val __obj = js.Dynamic.literal(noResults = noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoResults]
  }
  @scala.inline
  implicit class PickImplnoResultsOps[Self <: PickImplnoResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResults")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

