package typingsSlinky.semanticDashUiDashAccordion.SemanticUI.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.accordion
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.content
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.title
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.trigger
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[_Impl, accordion | title | trigger | content]) with (Partial[Pick[_Impl, accordion | title | trigger | content]])
}
