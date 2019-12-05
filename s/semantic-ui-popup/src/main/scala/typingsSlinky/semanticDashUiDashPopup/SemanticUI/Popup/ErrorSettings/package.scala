package typingsSlinky.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.cannotPlace
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.invalidPosition
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.method
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.noTransition
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.notFound
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, invalidPosition | cannotPlace | method | noTransition | notFound]) with (Partial[Pick[_Impl, invalidPosition | cannotPlace | method | noTransition | notFound]])
}
