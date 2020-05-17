package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiDropdown.JQuery
import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.activate
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.combo
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'action'> */
@js.native
trait PickImplaction extends js.Object {
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
}

object PickImplaction {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ): PickImplaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaction]
  }
  @scala.inline
  implicit class PickImplactionOps[Self <: PickImplaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

