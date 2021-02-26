package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VizResizeEvent extends TableauEvent {
  
  /** Gets the sheetSize record for the current sheet. For more information, see SheetSizeOptions Record. */
  def getVizSize(): Size = js.native
}
object VizResizeEvent {
  
  @scala.inline
  def apply(getEventName: () => TableauEventName, getViz: () => Viz, getVizSize: () => Size): VizResizeEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getViz = js.Any.fromFunction0(getViz), getVizSize = js.Any.fromFunction0(getVizSize))
    __obj.asInstanceOf[VizResizeEvent]
  }
  
  @scala.inline
  implicit class VizResizeEventMutableBuilder[Self <: VizResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVizSize(value: () => Size): Self = StObject.set(x, "getVizSize", js.Any.fromFunction0(value))
  }
}
