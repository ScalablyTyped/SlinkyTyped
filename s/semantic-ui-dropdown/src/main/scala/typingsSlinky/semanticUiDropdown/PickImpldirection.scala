package typingsSlinky.semanticUiDropdown

import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.auto
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.downward
import typingsSlinky.semanticUiDropdown.semanticUiDropdownStrings.upward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'direction'> */
trait PickImpldirection extends js.Object {
  var direction: auto | upward | downward
}

object PickImpldirection {
  @scala.inline
  def apply(direction: auto | upward | downward): PickImpldirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImpldirection]
  }
}

