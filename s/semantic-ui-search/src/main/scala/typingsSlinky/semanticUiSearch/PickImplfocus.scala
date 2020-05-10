package typingsSlinky.semanticUiSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'focus'> */
@js.native
trait PickImplfocus extends js.Object {
  var focus: String = js.native
}

object PickImplfocus {
  @scala.inline
  def apply(focus: String): PickImplfocus = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfocus]
  }
  @scala.inline
  implicit class PickImplfocusOps[Self <: PickImplfocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

