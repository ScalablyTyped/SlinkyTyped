package typingsSlinky.smoothScrollbar

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.Touch
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.smoothScrollbar.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/utils/touch-record", JSImport.Namespace)
@js.native
object touchRecordMod extends js.Object {
  
  @js.native
  class TouchRecord () extends js.Object {
    
    var _activeTouchID: js.Any = js.native
    
    var _add: js.Any = js.native
    
    var _delete: js.Any = js.native
    
    var _getActiveTracker: js.Any = js.native
    
    var _has: js.Any = js.native
    
    val _primitiveValue: js.Any = js.native
    
    var _renew: js.Any = js.native
    
    var _setActiveID: js.Any = js.native
    
    var _touchList: js.Any = js.native
    
    def getDelta(): Y = js.native
    
    def getVelocity(): Y = js.native
    
    def isActive(): Boolean = js.native
    
    def release(evt: TouchEvent): Unit = js.native
    
    def track(evt: TouchEvent): NumberDictionary[Tracker] = js.native
    
    def update(evt: TouchEvent): NumberDictionary[Tracker] = js.native
  }
  
  @js.native
  class Tracker protected () extends js.Object {
    def this(touch: Touch) = this()
    
    var delta: Y = js.native
    
    var lastPosition: Y = js.native
    
    def update(touch: Touch): Unit = js.native
    
    var updateTime: Double = js.native
    
    var velocity: Y = js.native
  }
}
