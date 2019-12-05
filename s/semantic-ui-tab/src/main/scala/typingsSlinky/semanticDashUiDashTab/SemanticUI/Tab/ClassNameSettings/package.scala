package typingsSlinky.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.active
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.loading
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, loading | active]) with (Partial[Pick[_Impl, loading | active]])
}
