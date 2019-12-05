package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MetadataSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.cache
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, cache | results]) with (Partial[Pick[_Impl, cache | results]])
}
