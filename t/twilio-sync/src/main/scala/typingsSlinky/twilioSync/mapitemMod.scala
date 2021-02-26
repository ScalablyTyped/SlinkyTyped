package typingsSlinky.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapitemMod {
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync Map.
    * @alias MapItem
    * @property {String} key The identifier that maps to this item within the containing Map.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the Map Item was last updated, given in UTC ISO 8601 format (e.g., '2018-04-26T15:23:19.732Z')
    */
  @JSImport("twilio-sync/lib/mapitem", "MapItem")
  @js.native
  class MapItem protected () extends StObject {
    /**
      * @private
      * @constructor
      */
    def this(descriptor: MapItemDescriptor) = this()
    
    def dateExpires: String = js.native
    
    def dateUpdated: js.Date = js.native
    
    val descriptor: js.Any = js.native
    
    def key: String = js.native
    
    def lastEventId: Double = js.native
    
    def revision: String = js.native
    
    /**
      * @private
      */
    def update(eventId: Double, revision: String, value: js.Object, dateUpdated: js.Date): MapItem = js.native
    
    /**
      * @private
      */
    def updateDateExpires(dateExpires: String): Unit = js.native
    
    def uri: String = js.native
    
    def value: js.Object = js.native
  }
  
  @js.native
  trait MapItemDescriptor extends StObject {
    
    var data: js.Object = js.native
    
    var date_expires: String = js.native
    
    var date_updated: js.Date = js.native
    
    var key: String = js.native
    
    var last_event_id: Double = js.native
    
    var revision: String = js.native
    
    var url: String = js.native
  }
  object MapItemDescriptor {
    
    @scala.inline
    def apply(
      data: js.Object,
      date_expires: String,
      date_updated: js.Date,
      key: String,
      last_event_id: Double,
      revision: String,
      url: String
    ): MapItemDescriptor = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapItemDescriptor]
    }
    
    @scala.inline
    implicit class MapItemDescriptorMutableBuilder[Self <: MapItemDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_updated(value: js.Date): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_event_id(value: Double): Self = StObject.set(x, "last_event_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
