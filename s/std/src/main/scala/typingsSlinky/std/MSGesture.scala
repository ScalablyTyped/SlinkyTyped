package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSGesture extends StObject {
  
  def addPointer(pointerId: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  var target: org.scalajs.dom.raw.Element = js.native
}
object MSGesture {
  
  @scala.inline
  def apply(addPointer: Double => Unit, stop: () => Unit, target: org.scalajs.dom.raw.Element): MSGesture = {
    val __obj = js.Dynamic.literal(addPointer = js.Any.fromFunction1(addPointer), stop = js.Any.fromFunction0(stop), target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSGesture]
  }
  
  @scala.inline
  implicit class MSGestureMutableBuilder[Self <: MSGesture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddPointer(value: Double => Unit): Self = StObject.set(x, "addPointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
