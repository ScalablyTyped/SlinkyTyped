package typingsSlinky.semanticDashUiDashTab.SemanticUI.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.loaded
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.promise
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.tab
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, tab | loaded | promise]) with (Partial[Pick[_Impl, tab | loaded | promise]])
}
