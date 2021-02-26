package typingsSlinky.webix.mod

import typingsSlinky.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait markup extends StObject {
  
  var attribute: js.Any = js.native
  
  var dataTag: js.Any = js.native
  
  def init(node: String, target: String): baseview = js.native
  
  var namespace: js.Any = js.native
  
  def parse(data: js.Any, datatype: String): Unit = js.native
}
object markup {
  
  @JSImport("webix", "markup")
  @js.native
  val ^ : typingsSlinky.webix.webix.markup = js.native
  
  @scala.inline
  implicit class markupMutableBuilder[Self <: markup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: js.Any): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTag(value: js.Any): Self = StObject.set(x, "dataTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: (String, String) => baseview): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNamespace(value: js.Any): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: (js.Any, String) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
