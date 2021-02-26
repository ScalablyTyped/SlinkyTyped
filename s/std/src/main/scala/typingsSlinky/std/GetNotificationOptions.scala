package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationOptions extends StObject {
  
  var tag: js.UndefOr[java.lang.String] = js.native
}
object GetNotificationOptions {
  
  @scala.inline
  def apply(): org.scalajs.dom.experimental.serviceworkers.GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[org.scalajs.dom.experimental.serviceworkers.GetNotificationOptions]
  }
  
  @scala.inline
  implicit class GetNotificationOptionsMutableBuilder[Self <: org.scalajs.dom.experimental.serviceworkers.GetNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
