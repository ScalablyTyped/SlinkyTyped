package typingsSlinky.semanticDashUiDashDimmer.SemanticUI.Dimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DurationSettings {
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.hide
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.show
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, show | hide]) with (Partial[Pick[_Impl, show | hide]])
}
