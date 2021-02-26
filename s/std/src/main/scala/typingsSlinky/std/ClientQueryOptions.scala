package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientQueryOptions extends StObject {
  
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.native
  
  var `type`: js.UndefOr[ClientTypes] = js.native
}
object ClientQueryOptions {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.serviceworkers.ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.serviceworkers.ClientQueryOptions]
  }
  
  @scala.inline
  implicit class ClientQueryOptionsMutableBuilder[Self <: org.scalajs.dom.experimental.serviceworkers.ClientQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeUncontrolled(value: scala.Boolean): Self = StObject.set(x, "includeUncontrolled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUncontrolledUndefined: Self = StObject.set(x, "includeUncontrolled", js.undefined)
    
    @scala.inline
    def setType(value: ClientTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
