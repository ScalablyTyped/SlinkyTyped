package typingsSlinky.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  var $getSize: js.Array[_] = js.native
  
  def render(): Unit = js.native
}
object FlexLayout {
  
  @JSImport("webix", "FlexLayout")
  @js.native
  val ^ : FlexLayout = js.native
  
  @scala.inline
  implicit class FlexLayoutMutableBuilder[Self <: FlexLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$getSize(value: js.Array[_]): Self = StObject.set(x, "$getSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$getSizeVarargs(value: js.Any*): Self = StObject.set(x, "$getSize", js.Array(value :_*))
    
    @scala.inline
    def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
