package typingsSlinky.semanticDashUiDashSearch.SemanticUI.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FieldsSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.action
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.actionText
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.actionURL
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categories
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categoryName
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categoryResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.description
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.image
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.price
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.title
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    categories | categoryName | categoryResults | description | image | price | results | title | action | actionText | actionURL
  ]) with (Partial[
    Pick[
      _Impl, 
      categories | categoryName | categoryResults | description | image | price | results | title | action | actionText | actionURL
    ]
  ])
}
