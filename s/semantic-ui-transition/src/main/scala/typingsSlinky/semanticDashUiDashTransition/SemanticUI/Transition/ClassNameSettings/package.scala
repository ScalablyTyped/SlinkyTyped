package typingsSlinky.semanticDashUiDashTransition.SemanticUI.Transition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.animating
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.disabled
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.hidden
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.inward
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.loading
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.looping
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.outward
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.transition
  import typingsSlinky.semanticDashUiDashTransition.semanticDashUiDashTransitionStrings.visible
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    animating | disabled | hidden | inward | loading | looping | outward | transition | visible
  ]) with (Partial[
    Pick[
      _Impl, 
      animating | disabled | hidden | inward | loading | looping | outward | transition | visible
    ]
  ])
}
