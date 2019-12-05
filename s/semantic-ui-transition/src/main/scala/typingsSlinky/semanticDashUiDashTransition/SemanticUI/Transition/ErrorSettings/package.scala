package typingsSlinky.semanticDashUiDashTransition.SemanticUI.Transition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.method
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.noAnimation
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, noAnimation | method]) with (Partial[Pick[_Impl, noAnimation | method]])
}
