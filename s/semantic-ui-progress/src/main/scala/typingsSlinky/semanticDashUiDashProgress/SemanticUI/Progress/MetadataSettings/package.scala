package typingsSlinky.semanticDashUiDashProgress.SemanticUI.Progress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.percent
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.total
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.value
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, percent | total | value]) with (Partial[Pick[_Impl, percent | total | value]])
}
