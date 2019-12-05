package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.logging
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.maxResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.method
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.noResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.noTemplate
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.serverError
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.source
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    source | noResults | logging | noTemplate | serverError | maxResults | method
  ]) with (Partial[
    Pick[
      _Impl, 
      source | noResults | logging | noTemplate | serverError | maxResults | method
    ]
  ])
}
