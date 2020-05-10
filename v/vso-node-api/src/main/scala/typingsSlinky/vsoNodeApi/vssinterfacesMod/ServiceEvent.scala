package typingsSlinky.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEvent extends js.Object {
  /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
  var eventType: String = js.native
  /**
    * This is the service that published this event.
    */
  var publisher: Publisher = js.native
  /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
  var resource: js.Any = js.native
  /**
    * This dictionary carries the context descriptors along with their ids.
    */
  var resourceContainers: StringDictionary[js.Any] = js.native
  /**
    * This is the version of the resource.
    */
  var resourceVersion: String = js.native
}

object ServiceEvent {
  @scala.inline
  def apply(
    eventType: String,
    publisher: Publisher,
    resource: js.Any,
    resourceContainers: StringDictionary[js.Any],
    resourceVersion: String
  ): ServiceEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceContainers = resourceContainers.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEvent]
  }
  @scala.inline
  implicit class ServiceEventOps[Self <: ServiceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisher(value: Publisher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceContainers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceContainers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

