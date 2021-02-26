package typingsSlinky.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemEventData extends StObject {
  
  /**
    * Type of the system event data item.
    *
    * @since 2.4
    */
  var `type`: String = js.native
  
  /**
    * Value of the system event data item.
    *
    * @since 2.4
    */
  var value: String = js.native
}
object SystemEventData {
  
  @scala.inline
  def apply(`type`: String, value: String): SystemEventData = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemEventData]
  }
  
  @scala.inline
  implicit class SystemEventDataMutableBuilder[Self <: SystemEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
