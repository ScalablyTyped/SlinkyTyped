package typingsSlinky.semanticDashUiDashSticky.SemanticUI.Sticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.container
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.elementSize
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.invalidContext
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.method
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.visible
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, container | visible | method | invalidContext | elementSize]) with (Partial[Pick[_Impl, container | visible | method | invalidContext | elementSize]])
}
