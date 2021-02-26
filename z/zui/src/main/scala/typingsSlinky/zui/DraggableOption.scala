package typingsSlinky.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableOption extends StObject {
  
  var before: js.UndefOr[js.Function1[/* e */ js.UndefOr[DraggableEvent], Boolean]] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var finish: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var handle: js.UndefOr[String] = js.native
  
  var mouseButton: js.UndefOr[String] = js.native
  
  var move: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object DraggableOption {
  
  @scala.inline
  def apply(): DraggableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOption]
  }
  
  @scala.inline
  implicit class DraggableOptionMutableBuilder[Self <: DraggableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: /* e */ js.UndefOr[DraggableEvent] => Boolean): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setFinish(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    @scala.inline
    def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    @scala.inline
    def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
