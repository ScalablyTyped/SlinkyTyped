package typingsSlinky.semanticDashUiDashTransition.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TransitionSettings {
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.allowRepeats
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.animation
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.className
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.debug
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.displayType
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.duration
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.error
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.interval
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.name
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.namespace
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onComplete
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onHide
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onShow
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.onStart
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.performance
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.queue
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.reverse
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.silent
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.useFailSafe
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    animation | interval | reverse | displayType | duration | useFailSafe | allowRepeats | queue | onShow | onHide | onStart | onComplete | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      animation | interval | reverse | displayType | duration | useFailSafe | allowRepeats | queue | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
