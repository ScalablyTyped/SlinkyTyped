package typingsSlinky.semanticDashUiDashSticky.SemanticUI.Sticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bottom
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.bound
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.fixed
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.supported
  import typingsSlinky.semanticDashUiDashSticky.semanticDashUiDashStickyStrings.top
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, bound | fixed | supported | top | bottom]) with (Partial[Pick[_Impl, bound | fixed | supported | top | bottom]])
}
