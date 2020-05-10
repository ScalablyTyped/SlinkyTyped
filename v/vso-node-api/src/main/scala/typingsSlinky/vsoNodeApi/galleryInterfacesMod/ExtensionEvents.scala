package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionEvents extends js.Object {
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
  implicit class ExtensionEventsOps[Self <: ExtensionEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: StringDictionary[js.Array[ExtensionEvent]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

