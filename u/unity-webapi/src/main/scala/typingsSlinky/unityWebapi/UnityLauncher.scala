package typingsSlinky.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnityLauncher extends StObject {
  
  def addAction(name: String, onActionInvoked: js.Function): js.Any = js.native
  
  def clearCount(): js.Any = js.native
  
  def clearProgress(): js.Any = js.native
  
  def removeAction(name: String): js.Any = js.native
  
  def removeActions(): js.Any = js.native
  
  def setCount(count: Double): js.Any = js.native
  
  def setProgress(progress: Double): js.Any = js.native
  
  def setUrgent(urgent: Boolean): js.Any = js.native
}
object UnityLauncher {
  
  @scala.inline
  def apply(
    addAction: (String, js.Function) => js.Any,
    clearCount: () => js.Any,
    clearProgress: () => js.Any,
    removeAction: String => js.Any,
    removeActions: () => js.Any,
    setCount: Double => js.Any,
    setProgress: Double => js.Any,
    setUrgent: Boolean => js.Any
  ): UnityLauncher = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction2(addAction), clearCount = js.Any.fromFunction0(clearCount), clearProgress = js.Any.fromFunction0(clearProgress), removeAction = js.Any.fromFunction1(removeAction), removeActions = js.Any.fromFunction0(removeActions), setCount = js.Any.fromFunction1(setCount), setProgress = js.Any.fromFunction1(setProgress), setUrgent = js.Any.fromFunction1(setUrgent))
    __obj.asInstanceOf[UnityLauncher]
  }
  
  @scala.inline
  implicit class UnityLauncherMutableBuilder[Self <: UnityLauncher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAction(value: (String, js.Function) => js.Any): Self = StObject.set(x, "addAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClearCount(value: () => js.Any): Self = StObject.set(x, "clearCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearProgress(value: () => js.Any): Self = StObject.set(x, "clearProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAction(value: String => js.Any): Self = StObject.set(x, "removeAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActions(value: () => js.Any): Self = StObject.set(x, "removeActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCount(value: Double => js.Any): Self = StObject.set(x, "setCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProgress(value: Double => js.Any): Self = StObject.set(x, "setProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrgent(value: Boolean => js.Any): Self = StObject.set(x, "setUrgent", js.Any.fromFunction1(value))
  }
}
