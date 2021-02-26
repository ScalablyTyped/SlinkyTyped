package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneList extends StObject {
  
  var utcTimeZone: TimeZone = js.native
  
  var validTimeZones: js.Array[TimeZone] = js.native
}
object TimeZoneList {
  
  @scala.inline
  def apply(utcTimeZone: TimeZone, validTimeZones: js.Array[TimeZone]): TimeZoneList = {
    val __obj = js.Dynamic.literal(utcTimeZone = utcTimeZone.asInstanceOf[js.Any], validTimeZones = validTimeZones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneList]
  }
  
  @scala.inline
  implicit class TimeZoneListMutableBuilder[Self <: TimeZoneList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUtcTimeZone(value: TimeZone): Self = StObject.set(x, "utcTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTimeZones(value: js.Array[TimeZone]): Self = StObject.set(x, "validTimeZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTimeZonesVarargs(value: TimeZone*): Self = StObject.set(x, "validTimeZones", js.Array(value :_*))
  }
}
