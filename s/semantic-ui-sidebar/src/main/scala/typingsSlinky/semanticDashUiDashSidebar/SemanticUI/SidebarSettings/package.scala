package typingsSlinky.semanticDashUiDashSidebar.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SidebarSettings {
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.className
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.closable
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.context
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.debug
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.defaultTransition
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.delaySetup
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.dimPage
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.duration
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.easing
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.error
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.exclusive
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.mobileTransition
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.name
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.namespace
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onChange
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onHidden
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onHide
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onShow
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.onVisible
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.performance
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.regExp
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.returnScroll
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.scrollLock
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.selector
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.silent
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.transition
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.useLegacy
  import typingsSlinky.semanticDashUiDashSidebar.semanticDashUiDashSidebarStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    context | exclusive | closable | dimPage | scrollLock | returnScroll | delaySetup | transition | mobileTransition | defaultTransition | useLegacy | duration | easing | onVisible | onShow | onChange | onHide | onHidden | className | regExp | selector | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      context | exclusive | closable | dimPage | scrollLock | returnScroll | delaySetup | transition | mobileTransition | defaultTransition | useLegacy | duration | easing | className | regExp | selector | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
