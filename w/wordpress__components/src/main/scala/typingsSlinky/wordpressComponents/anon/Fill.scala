package typingsSlinky.wordpressComponents.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends StObject {
  
  var Fill: ReactComponentClass[OmitPropsname] = js.native
  
  var Slot: ReactComponentClass[OmitPropsnameBubblesVirtually] = js.native
}
object Fill {
  
  @scala.inline
  def apply(Fill: ReactComponentClass[OmitPropsname], Slot: ReactComponentClass[OmitPropsnameBubblesVirtually]): Fill = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: ReactComponentClass[OmitPropsname]): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: ReactComponentClass[OmitPropsnameBubblesVirtually]): Self = StObject.set(x, "Slot", value.asInstanceOf[js.Any])
  }
}
