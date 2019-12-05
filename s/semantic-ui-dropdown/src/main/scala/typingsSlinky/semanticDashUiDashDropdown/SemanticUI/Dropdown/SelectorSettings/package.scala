package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.addition
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.dropdown
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.icon
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.input
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.item
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.label
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.menu
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.menuIcon
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.message
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.remove
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.search
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.siblingLabel
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.text
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    addition | dropdown | icon | input | item | label | remove | siblingLabel | menu | message | menuIcon | search | text
  ]) with (Partial[
    Pick[
      _Impl, 
      addition | dropdown | icon | input | item | label | remove | siblingLabel | menu | message | menuIcon | search | text
    ]
  ])
}
