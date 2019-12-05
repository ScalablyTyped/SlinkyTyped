package typingsSlinky.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.parent
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.tabs
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, tabs | parent]) with (Partial[Pick[_Impl, tabs | parent]])
}
