package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MessageSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.addResult
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.count
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.maxSelections
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.noResults
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, addResult | count | maxSelections | noResults]) with (Partial[Pick[_Impl, addResult | count | maxSelections | noResults]])
}
