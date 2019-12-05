package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LabelSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.duration
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.transition
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.variation
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, transition | duration | variation]) with (Partial[Pick[_Impl, transition | duration | variation]])
}
