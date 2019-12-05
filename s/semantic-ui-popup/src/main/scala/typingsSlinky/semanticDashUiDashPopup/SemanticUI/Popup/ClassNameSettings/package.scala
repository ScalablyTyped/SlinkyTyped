package typingsSlinky.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.loading
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.popup
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.popupVisible
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.position
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.visible
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, loading | popup | position | visible | popupVisible]) with (Partial[Pick[_Impl, loading | popup | position | visible | popupVisible]])
}
