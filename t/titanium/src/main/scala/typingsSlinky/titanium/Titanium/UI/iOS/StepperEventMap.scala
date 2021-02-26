package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperEventMap extends ProxyEventMap {
  
  var change: StepperChangeEvent = js.native
  
  var click: StepperClickEvent = js.native
  
  var dblclick: StepperDblclickEvent = js.native
  
  var doubletap: StepperDoubletapEvent = js.native
  
  var keypressed: StepperKeypressedEvent = js.native
  
  var longpress: StepperLongpressEvent = js.native
  
  var pinch: StepperPinchEvent = js.native
  
  var postlayout: StepperPostlayoutEvent = js.native
  
  var singletap: StepperSingletapEvent = js.native
  
  var swipe: StepperSwipeEvent = js.native
  
  var touchcancel: StepperTouchcancelEvent = js.native
  
  var touchend: StepperTouchendEvent = js.native
  
  var touchmove: StepperTouchmoveEvent = js.native
  
  var touchstart: StepperTouchstartEvent = js.native
  
  var twofingertap: StepperTwofingertapEvent = js.native
}
object StepperEventMap {
  
  @scala.inline
  def apply(
    change: StepperChangeEvent,
    click: StepperClickEvent,
    dblclick: StepperDblclickEvent,
    doubletap: StepperDoubletapEvent,
    keypressed: StepperKeypressedEvent,
    longpress: StepperLongpressEvent,
    pinch: StepperPinchEvent,
    postlayout: StepperPostlayoutEvent,
    singletap: StepperSingletapEvent,
    swipe: StepperSwipeEvent,
    touchcancel: StepperTouchcancelEvent,
    touchend: StepperTouchendEvent,
    touchmove: StepperTouchmoveEvent,
    touchstart: StepperTouchstartEvent,
    twofingertap: StepperTwofingertapEvent
  ): StepperEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], doubletap = doubletap.asInstanceOf[js.Any], keypressed = keypressed.asInstanceOf[js.Any], longpress = longpress.asInstanceOf[js.Any], pinch = pinch.asInstanceOf[js.Any], postlayout = postlayout.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], twofingertap = twofingertap.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperEventMap]
  }
  
  @scala.inline
  implicit class StepperEventMapMutableBuilder[Self <: StepperEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: StepperChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: StepperClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: StepperDblclickEvent): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubletap(value: StepperDoubletapEvent): Self = StObject.set(x, "doubletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeypressed(value: StepperKeypressedEvent): Self = StObject.set(x, "keypressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongpress(value: StepperLongpressEvent): Self = StObject.set(x, "longpress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinch(value: StepperPinchEvent): Self = StObject.set(x, "pinch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostlayout(value: StepperPostlayoutEvent): Self = StObject.set(x, "postlayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingletap(value: StepperSingletapEvent): Self = StObject.set(x, "singletap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipe(value: StepperSwipeEvent): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchcancel(value: StepperTouchcancelEvent): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: StepperTouchendEvent): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: StepperTouchmoveEvent): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: StepperTouchstartEvent): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwofingertap(value: StepperTwofingertapEvent): Self = StObject.set(x, "twofingertap", value.asInstanceOf[js.Any])
  }
}
