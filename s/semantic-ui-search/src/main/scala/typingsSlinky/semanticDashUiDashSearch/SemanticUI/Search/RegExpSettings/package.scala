package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RegExpSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.beginsWith
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.escape
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, escape | beginsWith]) with (Partial[Pick[_Impl, escape | beginsWith]])
}
