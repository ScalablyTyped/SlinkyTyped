package typingsSlinky.semanticDashUiDashVisibility.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object VisibilitySettings {
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.`type`
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.checkOnRefresh
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.className
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.context
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.continuous
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.debug
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.duration
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.error
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.includeMargin
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.initialCheck
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.name
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.namespace
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.observeChanges
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.offset
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onAllLoaded
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomPassed
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomPassedReverse
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomVisible
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onBottomVisibleReverse
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onFixed
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onLoad
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onOffScreen
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onOnScreen
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onPassing
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onPassingReverse
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onRefresh
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopPassed
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopPassedReverse
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopVisible
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onTopVisibleReverse
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onUnfixed
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.onUpdate
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.once
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.performance
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.refreshOnLoad
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.refreshOnResize
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.silent
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.throttle
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.transition
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.verbose
  import typingsSlinky.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.zIndex
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    once | continuous | `type` | initialCheck | context | refreshOnLoad | refreshOnResize | checkOnRefresh | zIndex | offset | includeMargin | throttle | observeChanges | transition | duration | onTopVisible | onTopPassed | onBottomVisible | onPassing | onBottomPassed | onTopVisibleReverse | onTopPassedReverse | onBottomVisibleReverse | onPassingReverse | onBottomPassedReverse | onOnScreen | onOffScreen | onLoad | onAllLoaded | onFixed | onUnfixed | onUpdate | onRefresh | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      once | continuous | `type` | initialCheck | context | refreshOnLoad | refreshOnResize | checkOnRefresh | zIndex | offset | includeMargin | throttle | observeChanges | transition | duration | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
