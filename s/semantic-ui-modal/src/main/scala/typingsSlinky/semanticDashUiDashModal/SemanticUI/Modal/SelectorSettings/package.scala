package typingsSlinky.semanticDashUiDashModal.SemanticUI.Modal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.approve
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.close
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.deny
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, close | approve | deny]) with (Partial[Pick[_Impl, close | approve | deny]])
}
