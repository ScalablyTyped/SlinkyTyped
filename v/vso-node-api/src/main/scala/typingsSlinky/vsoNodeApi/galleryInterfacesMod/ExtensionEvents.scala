package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionEvents extends StObject {
  
  /**
    * Generic container for events data. The dictionary key denotes the type of event and the list contains properties related to that event
    */
  var events: StringDictionary[js.Array[ExtensionEvent]] = js.native
  
  /**
    * Id of the extension, this will never be sent back to the client. This field will mainly be used when EMS calls into Gallery REST API to update install/uninstall events for various extensions in one go.
    */
  var extensionId: String = js.native
  
  /**
    * Name of the extension
    */
  var extensionName: String = js.native
  
  /**
    * Name of the publisher
    */
  var publisherName: String = js.native
}
object ExtensionEvents {
  
  @scala.inline
  def apply(
    events: StringDictionary[js.Array[ExtensionEvent]],
    extensionId: String,
    extensionName: String,
    publisherName: String
  ): ExtensionEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvents]
  }
  
  @scala.inline
  implicit class ExtensionEventsMutableBuilder[Self <: ExtensionEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: StringDictionary[js.Array[ExtensionEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
