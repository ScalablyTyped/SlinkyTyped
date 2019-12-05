package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.defaultText
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.defaultValue
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.placeholderText
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.text
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.value
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, defaultText | defaultValue | placeholderText | text | value]) with (Partial[Pick[_Impl, defaultText | defaultValue | placeholderText | text | value]])
}
