package typingsSlinky.semanticDashUiDashShape.SemanticUI.Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.active
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.animating
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.hidden
  import typingsSlinky.semanticDashUiDashShape.semanticDashUiDashShapeStrings.loading
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, animating | hidden | loading | active]) with (Partial[Pick[_Impl, animating | hidden | loading | active]])
}
