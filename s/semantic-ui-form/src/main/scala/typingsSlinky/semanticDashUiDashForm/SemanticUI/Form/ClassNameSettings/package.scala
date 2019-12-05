package typingsSlinky.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.active
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.disabled
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.placeholder
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.visible
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | placeholder | disabled | visible]) with (Partial[Pick[_Impl, active | placeholder | disabled | visible]])
}
