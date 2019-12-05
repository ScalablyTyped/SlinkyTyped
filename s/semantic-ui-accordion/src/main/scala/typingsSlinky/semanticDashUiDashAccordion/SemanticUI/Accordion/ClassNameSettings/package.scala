package typingsSlinky.semanticDashUiDashAccordion.SemanticUI.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClassNameSettings {
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.active
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.animating
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, active | animating]) with (Partial[Pick[_Impl, active | animating]])
}
