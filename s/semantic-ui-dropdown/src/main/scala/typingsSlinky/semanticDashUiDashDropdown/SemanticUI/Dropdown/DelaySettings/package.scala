package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DelaySettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.hide
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.search
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.show
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.touch
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, hide | show | search | touch]) with (Partial[Pick[_Impl, hide | show | search | touch]])
}
