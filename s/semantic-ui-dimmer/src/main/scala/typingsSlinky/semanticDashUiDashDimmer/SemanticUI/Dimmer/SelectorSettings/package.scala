package typingsSlinky.semanticDashUiDashDimmer.SemanticUI.Dimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.content
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmable
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmer
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, dimmable | dimmer | content]) with (Partial[Pick[_Impl, dimmable | dimmer | content]])
}
