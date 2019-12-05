package typingsSlinky.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.api
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.method
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.missingTab
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.noContent
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.path
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.recursion
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.state
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, api | method | missingTab | noContent | path | recursion | state]) with (Partial[Pick[_Impl, api | method | missingTab | noContent | path | recursion | state]])
}
