package typingsSlinky.semanticDashUiDashModal.SemanticUI.Modal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.active
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.scrolling
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | scrolling]) with (Partial[Pick[_Impl, active | scrolling]])
}
