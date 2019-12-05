package typingsSlinky.wonderDotJs

import typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/EventNameHandler", JSImport.Namespace)
@js.native
object distEs2015EventObjectEventNameHandlerMod extends js.Object {
  @js.native
  sealed trait EEventName extends js.Object
  
  @js.native
  class EventNameHandler () extends js.Object
  
  @js.native
  object EEventName extends js.Object {
    @js.native
    sealed trait CLICK extends EEventName
    
    @js.native
    sealed trait KEYDOWN extends EEventName
    
    @js.native
    sealed trait KEYPRESS extends EEventName
    
    @js.native
    sealed trait KEYUP extends EEventName
    
    @js.native
    sealed trait MOUSEDOWN extends EEventName
    
    @js.native
    sealed trait MOUSEDRAG extends EEventName
    
    @js.native
    sealed trait MOUSEMOVE extends EEventName
    
    @js.native
    sealed trait MOUSEOUT extends EEventName
    
    @js.native
    sealed trait MOUSEOVER extends EEventName
    
    @js.native
    sealed trait MOUSEUP extends EEventName
    
    @js.native
    sealed trait MOUSEWHEEL extends EEventName
    
    @js.native
    sealed trait TOUCHDOWN extends EEventName
    
    @js.native
    sealed trait TOUCHMOVE extends EEventName
    
    @js.native
    sealed trait TOUCHUP extends EEventName
    
    /* 0 */ val CLICK: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.CLICK with Double = js.native
    /* 11 */ val KEYDOWN: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.KEYDOWN with Double = js.native
    /* 13 */ val KEYPRESS: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.KEYPRESS with Double = js.native
    /* 12 */ val KEYUP: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.KEYUP with Double = js.native
    /* 5 */ val MOUSEDOWN: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEDOWN with Double = js.native
    /* 7 */ val MOUSEDRAG: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEDRAG with Double = js.native
    /* 4 */ val MOUSEMOVE: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEMOVE with Double = js.native
    /* 3 */ val MOUSEOUT: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEOUT with Double = js.native
    /* 1 */ val MOUSEOVER: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEOVER with Double = js.native
    /* 2 */ val MOUSEUP: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEUP with Double = js.native
    /* 6 */ val MOUSEWHEEL: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.MOUSEWHEEL with Double = js.native
    /* 10 */ val TOUCHDOWN: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.TOUCHDOWN with Double = js.native
    /* 9 */ val TOUCHMOVE: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.TOUCHMOVE with Double = js.native
    /* 8 */ val TOUCHUP: typingsSlinky.wonderDotJs.distEs2015EventObjectEventNameHandlerMod.EEventName.TOUCHUP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EEventName with Double] = js.native
  }
  
  /* static members */
  @js.native
  object EventNameHandler extends js.Object {
    def handleEventName(domEventName: EEventName): js.Any = js.native
  }
  
}

