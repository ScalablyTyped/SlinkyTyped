package typingsSlinky.semanticUiReact.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.accordionAccordionMod.AccordionComponent
import typingsSlinky.semanticUiReact.accordionAccordionMod.AccordionProps
import typingsSlinky.semanticUiReact.accordionPanelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react", "Accordion")
@js.native
class Accordion protected ()
  extends Component[AccordionProps, js.Object, js.Any] {
  def this(props: AccordionProps) = this()
  def this(props: AccordionProps, context: js.Any) = this()
}

@JSImport("semantic-ui-react", "Accordion")
@js.native
object Accordion extends TopLevel[AccordionComponent] {
  @js.native
  class Panel () extends default
  
}

