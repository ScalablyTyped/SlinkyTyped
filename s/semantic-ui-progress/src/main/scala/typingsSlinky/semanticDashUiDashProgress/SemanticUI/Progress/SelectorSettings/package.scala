package typingsSlinky.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.bar
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.label
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.progress
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, bar | label | progress]) with (Partial[Pick[_Impl, bar | label | progress]])
}
