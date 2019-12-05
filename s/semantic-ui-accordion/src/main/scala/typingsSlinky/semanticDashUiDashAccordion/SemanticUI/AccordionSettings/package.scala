package typingsSlinky.semanticDashUiDashAccordion.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AccordionSettings {
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.animateChildren
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.className
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.closeNested
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.collapsible
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.debug
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.duration
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.easing
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.error
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.exclusive
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.name
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.namespace
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.observeChanges
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.on
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onChange
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onClose
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onClosing
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onOpen
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onOpening
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.performance
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.selector
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.silent
  import typingsSlinky.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    exclusive | on | animateChildren | closeNested | collapsible | duration | easing | observeChanges | onOpening | onOpen | onClosing | onClose | onChange | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      exclusive | on | animateChildren | closeNested | collapsible | duration | easing | observeChanges | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
