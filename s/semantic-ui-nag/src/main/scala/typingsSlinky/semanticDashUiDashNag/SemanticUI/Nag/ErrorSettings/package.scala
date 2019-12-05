package typingsSlinky.semanticDashUiDashNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.method
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.noCookieStorage
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.noStorage
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, noCookieStorage | noStorage | method]) with (Partial[Pick[_Impl, noCookieStorage | noStorage | method]])
}
