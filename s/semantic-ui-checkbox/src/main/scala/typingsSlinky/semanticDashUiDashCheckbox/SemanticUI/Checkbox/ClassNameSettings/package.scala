package typingsSlinky.semanticDashUiDashCheckbox.SemanticUI.Checkbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.checked
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.disabled
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.radio
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.readOnly
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, checked | disabled | radio | readOnly]) with (Partial[Pick[_Impl, checked | disabled | radio | readOnly]])
}
