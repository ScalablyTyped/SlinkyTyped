package typingsSlinky.semanticDashUiDashTab.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TabSettings {
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.alwaysRefresh
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.apiSettings
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.auto
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.cache
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.cacheType
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.childrenOnly
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.className
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.context
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.deactivate
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.debug
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.error
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.evaluateScripts
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.history
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.historyType
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.ignoreFirstLoad
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.loadOnce
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.maxDepth
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.metadata
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.name
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.namespace
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.onFirstLoad
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.onLoad
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.onRequest
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.onVisible
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.path
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.performance
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.selector
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.silent
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.templates
  import typingsSlinky.semanticDashUiDashTab.semanticDashUiDashTabStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    auto | deactivate | history | ignoreFirstLoad | evaluateScripts | alwaysRefresh | cacheType | cache | apiSettings | historyType | path | context | childrenOnly | maxDepth | loadOnce | onFirstLoad | onLoad | onRequest | onVisible | templates | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      auto | deactivate | history | ignoreFirstLoad | evaluateScripts | alwaysRefresh | cacheType | cache | apiSettings | historyType | path | context | childrenOnly | maxDepth | loadOnce | templates | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
