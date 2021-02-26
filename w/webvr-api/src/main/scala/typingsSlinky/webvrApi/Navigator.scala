package typingsSlinky.webvrApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
}
object Navigator {
  
  @scala.inline
  def apply(activeVRDisplays: js.Array[VRDisplay], getVRDisplays: () => js.Promise[js.Array[VRDisplay]]): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays))
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVRDisplays(value: js.Array[VRDisplay]): Self = StObject.set(x, "activeVRDisplays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVRDisplaysVarargs(value: VRDisplay*): Self = StObject.set(x, "activeVRDisplays", js.Array(value :_*))
    
    @scala.inline
    def setGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = StObject.set(x, "getVRDisplays", js.Any.fromFunction0(value))
  }
}
