package typingsSlinky.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AnimationSettings {
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
