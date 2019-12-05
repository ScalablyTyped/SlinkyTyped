package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TemplatesSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.category
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.escape
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.message
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.standard
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, escape | message | category | standard]) with (Partial[Pick[_Impl, String]])
}
