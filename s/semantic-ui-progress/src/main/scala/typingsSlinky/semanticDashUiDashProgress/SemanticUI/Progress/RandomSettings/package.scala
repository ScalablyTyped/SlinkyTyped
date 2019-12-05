package typingsSlinky.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RandomSettings {
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.max
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.min
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, min | max]) with (Partial[Pick[_Impl, min | max]])
}
