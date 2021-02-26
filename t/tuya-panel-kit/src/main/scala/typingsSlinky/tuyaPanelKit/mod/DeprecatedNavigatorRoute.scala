package typingsSlinky.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecatedNavigatorRoute
  extends /* prop */ StringDictionary[js.Any] {
  
  var id: String = js.native
}
object DeprecatedNavigatorRoute {
  
  @scala.inline
  def apply(id: String): DeprecatedNavigatorRoute = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedNavigatorRoute]
  }
  
  @scala.inline
  implicit class DeprecatedNavigatorRouteMutableBuilder[Self <: DeprecatedNavigatorRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
