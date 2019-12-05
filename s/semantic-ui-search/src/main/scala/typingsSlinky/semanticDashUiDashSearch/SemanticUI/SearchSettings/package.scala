package typingsSlinky.semanticDashUiDashSearch.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SearchSettings {
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.`type`
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.apiSettings
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.cache
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.className
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.debug
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.duration
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.easing
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.error
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.fields
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.hideDelay
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.maxResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.metadata
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.minCharacters
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.name
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.namespace
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsAdd
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsClose
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onResultsOpen
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onSearchQuery
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.onSelect
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.performance
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.regExp
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchDelay
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchFields
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.searchFullText
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.selectFirstResult
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.selector
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.showNoResults
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.silent
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.source
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.templates
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.transition
  import typingsSlinky.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    apiSettings | `type` | minCharacters | transition | duration | maxResults | cache | source | selectFirstResult | showNoResults | searchFullText | fields | searchFields | hideDelay | searchDelay | easing | onSelect | onResultsAdd | onSearchQuery | onResults | onResultsOpen | onResultsClose | templates | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      `type` | apiSettings | minCharacters | transition | duration | maxResults | cache | source | selectFirstResult | showNoResults | searchFullText | fields | searchFields | hideDelay | searchDelay | easing | templates | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
