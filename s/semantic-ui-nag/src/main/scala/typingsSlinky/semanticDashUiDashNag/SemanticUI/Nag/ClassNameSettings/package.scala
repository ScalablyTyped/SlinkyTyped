package typingsSlinky.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.bottom
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.fixed
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, bottom | fixed]) with (Partial[Pick[_Impl, bottom | fixed]])
}
