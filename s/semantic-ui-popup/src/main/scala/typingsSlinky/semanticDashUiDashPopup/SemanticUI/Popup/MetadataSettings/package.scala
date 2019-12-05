package typingsSlinky.semanticDashUiDashPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.content
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.html
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.offset
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.position
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.title
  import typingsSlinky.semanticDashUiDashPopup.semanticDashUiDashPopupStrings.variation
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, content | html | offset | position | title | variation]) with (Partial[Pick[_Impl, content | html | offset | position | title | variation]])
}
