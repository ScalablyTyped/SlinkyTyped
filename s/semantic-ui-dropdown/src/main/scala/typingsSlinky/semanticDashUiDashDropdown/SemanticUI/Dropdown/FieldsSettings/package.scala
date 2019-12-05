package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FieldsSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.name
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.remoteValues
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.value
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.values
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, remoteValues | values | name | value]) with (Partial[Pick[_Impl, remoteValues | values | name | value]])
}
