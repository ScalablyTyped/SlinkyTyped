package typingsSlinky.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'accordion'> */
@js.native
trait PickImplaccordion extends StObject {
  
  var accordion: String = js.native
}
object PickImplaccordion {
  
  @scala.inline
  def apply(accordion: String): PickImplaccordion = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaccordion]
  }
  
  @scala.inline
  implicit class PickImplaccordionMutableBuilder[Self <: PickImplaccordion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
  }
}
