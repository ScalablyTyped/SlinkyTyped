package typingsSlinky.uikit.mod.UIkit

import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNavElement extends StObject {
  
  var animate: Boolean = js.native
  
  var index: String | Double | Node = js.native
}
object UIkitNavElement {
  
  @scala.inline
  def apply(animate: Boolean, index: String | Double | Node): UIkitNavElement = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavElement]
  }
  
  @scala.inline
  implicit class UIkitNavElementMutableBuilder[Self <: UIkitNavElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String | Double | Node): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNode(value: Node): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
