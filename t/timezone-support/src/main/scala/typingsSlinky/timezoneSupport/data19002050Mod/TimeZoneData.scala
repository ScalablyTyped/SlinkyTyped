package typingsSlinky.timezoneSupport.data19002050Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneData extends js.Object {
  
  var links: js.Array[String] = js.native
  
  var zones: PackedTimeZones = js.native
}
object TimeZoneData {
  
  @scala.inline
  def apply(links: js.Array[String], zones: PackedTimeZones): TimeZoneData = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZoneData]
  }
  
  @scala.inline
  implicit class TimeZoneDataOps[Self <: TimeZoneData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZones(value: PackedTimeZones): Self = this.set("zones", value.asInstanceOf[js.Any])
  }
}
