package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.active
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.empty
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.focus
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.loading
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.pressed
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | empty | focus | loading | pressed]) with (Partial[Pick[_Impl, active | empty | focus | loading | pressed]])
}
