package typingsSlinky.timezoneSupport

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data19702038Mod extends Shortcut {
  
  @JSImport("timezone-support/dist/data-1970-2038", JSImport.Default)
  @js.native
  val default: TimeZoneData = js.native
  
  type PackedTimeZones = StringDictionary[String]
  
  @js.native
  trait TimeZoneData extends StObject {
    
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
    implicit class TimeZoneDataMutableBuilder[Self <: TimeZoneData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      @scala.inline
      def setZones(value: PackedTimeZones): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = TimeZoneData
  
  /* This means you don't have to write `default`, but can instead just say `data19702038Mod.foo` */
  override def _to: TimeZoneData = default
}
