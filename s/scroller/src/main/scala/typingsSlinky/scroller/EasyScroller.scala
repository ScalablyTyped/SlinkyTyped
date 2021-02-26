package typingsSlinky.scroller

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EasyScroller extends StObject {
  
  def bindEvents(): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def render(): Unit = js.native
}
object EasyScroller {
  
  @scala.inline
  def apply(bindEvents: () => Unit, reflow: () => Unit, render: () => Unit): EasyScroller = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), reflow = js.Any.fromFunction0(reflow), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EasyScroller]
  }
  
  @scala.inline
  implicit class EasyScrollerMutableBuilder[Self <: EasyScroller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindEvents(value: () => Unit): Self = StObject.set(x, "bindEvents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReflow(value: () => Unit): Self = StObject.set(x, "reflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
