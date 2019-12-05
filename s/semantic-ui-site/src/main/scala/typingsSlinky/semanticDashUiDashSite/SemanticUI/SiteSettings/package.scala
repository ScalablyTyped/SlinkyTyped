package typingsSlinky.semanticDashUiDashSite.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SiteSettings {
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.debug
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.modules
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.name
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.namespace
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.namespaceStub
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.performance
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.silent
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.siteNamespace
  import typingsSlinky.semanticDashUiDashSite.semanticDashUiDashSiteStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    modules | siteNamespace | namespaceStub | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      modules | siteNamespace | namespaceStub | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
