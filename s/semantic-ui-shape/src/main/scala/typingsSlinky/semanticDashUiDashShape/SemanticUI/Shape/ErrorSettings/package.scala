package typingsSlinky.semanticDashUiDashShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.method
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.side
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, side | method]) with (Partial[Pick[_Impl, side | method]])
}
