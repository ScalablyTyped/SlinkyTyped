package typingsSlinky.storybookUi.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: String = js.native
  
  var render: ReactComponentClass[js.Object] = js.native
  
  var route: ReactComponentClass[js.Object] = js.native
}
object Key {
  
  @scala.inline
  def apply(key: String, render: ReactComponentClass[js.Object], route: ReactComponentClass[js.Object]): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRender(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
