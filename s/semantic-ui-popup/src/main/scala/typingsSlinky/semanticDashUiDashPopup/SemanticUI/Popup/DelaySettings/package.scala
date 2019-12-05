package typingsSlinky.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DelaySettings {
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.hide
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.show
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
