package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.category
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.prompt
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.result
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchButton
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, prompt | searchButton | results | category | result]) with (Partial[Pick[_Impl, prompt | searchButton | results | category | result]])
}
