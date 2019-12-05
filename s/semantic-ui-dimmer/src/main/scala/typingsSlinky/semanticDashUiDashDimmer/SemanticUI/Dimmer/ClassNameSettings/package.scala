package typingsSlinky.semanticDashUiDashDimmer.SemanticUI.Dimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.active
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmable
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmed
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.disabled
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.hide
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.pageDimmer
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.show
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.transition
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    active | dimmable | dimmed | disabled | pageDimmer | hide | show | transition
  ]) with (Partial[
    Pick[
      _Impl, 
      active | dimmable | dimmed | disabled | pageDimmer | hide | show | transition
    ]
  ])
}
