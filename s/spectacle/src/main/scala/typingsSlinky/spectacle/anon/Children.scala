package typingsSlinky.spectacle.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  var children: ReactElement = js.native
  
  var elementNum: Double = js.native
  
  var transitionEffect: From = js.native
}
object Children {
  
  @scala.inline
  def apply(elementNum: Double, transitionEffect: From): Children = {
    val __obj = js.Dynamic.literal(elementNum = elementNum.asInstanceOf[js.Any], transitionEffect = transitionEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setElementNum(value: Double): Self = StObject.set(x, "elementNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEffect(value: From): Self = StObject.set(x, "transitionEffect", value.asInstanceOf[js.Any])
  }
}
