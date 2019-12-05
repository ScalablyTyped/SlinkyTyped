package typingsSlinky.semanticDashUiDashShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.side
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.sides
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, sides | side]) with (Partial[Pick[_Impl, sides | side]])
}
