package typingsSlinky.semanticDashUiDashDropdown.SemanticUI.Dropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KeySettings {
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.backspace
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.deleteKey
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.delimiter
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.downArrow
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.enter
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.escape
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.leftArrow
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.pageDown
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.pageUp
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.rightArrow
  import typingsSlinky.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.upArrow
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    backspace | delimiter | deleteKey | enter | escape | pageUp | pageDown | leftArrow | upArrow | rightArrow | downArrow
  ]) with (Partial[
    Pick[
      _Impl, 
      backspace | delimiter | deleteKey | enter | escape | pageUp | pageDown | leftArrow | upArrow | rightArrow | downArrow
    ]
  ])
}
