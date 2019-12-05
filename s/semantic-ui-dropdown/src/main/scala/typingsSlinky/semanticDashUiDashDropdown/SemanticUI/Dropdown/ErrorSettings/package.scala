package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.action
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.alreadySetup
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.labels
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.method
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.noTransition
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, action | alreadySetup | labels | method | noTransition]) with (Partial[Pick[_Impl, action | alreadySetup | labels | method | noTransition]])
}
