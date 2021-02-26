package typingsSlinky.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutActionMenu extends StObject {
  
  def addAction(action: CalloutAction): Unit = js.native
  
  def calculateActionWidth(): Unit = js.native
  
  def getActions(): js.Array[CalloutAction] = js.native
  
  def refreshActions(): Unit = js.native
  
  def render(): Unit = js.native
}
object CalloutActionMenu {
  
  @scala.inline
  def apply(
    addAction: CalloutAction => Unit,
    calculateActionWidth: () => Unit,
    getActions: () => js.Array[CalloutAction],
    refreshActions: () => Unit,
    render: () => Unit
  ): CalloutActionMenu = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1(addAction), calculateActionWidth = js.Any.fromFunction0(calculateActionWidth), getActions = js.Any.fromFunction0(getActions), refreshActions = js.Any.fromFunction0(refreshActions), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[CalloutActionMenu]
  }
  
  @scala.inline
  implicit class CalloutActionMenuMutableBuilder[Self <: CalloutActionMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAction(value: CalloutAction => Unit): Self = StObject.set(x, "addAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateActionWidth(value: () => Unit): Self = StObject.set(x, "calculateActionWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActions(value: () => js.Array[CalloutAction]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshActions(value: () => Unit): Self = StObject.set(x, "refreshActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
