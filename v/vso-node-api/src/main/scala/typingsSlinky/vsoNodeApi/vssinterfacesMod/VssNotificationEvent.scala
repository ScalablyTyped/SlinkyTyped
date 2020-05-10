package typingsSlinky.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VssNotificationEvent extends js.Object {
  /**
    * Optional: A list of actors which are additional identities with corresponding roles that are relevant to the event.
    */
  var actors: js.Array[EventActor] = js.native
  /**
    * Optional: A list of artifacts referenced or impacted by this event.
    */
  var artifactUris: js.Array[String] = js.native
  /**
    * Required: The event payload.  If Data is a string, it must be in Json or XML format.  Otherwise it must have a serialization format attribute.
    */
  var data: js.Any = js.native
  /**
    * Required: The name of the event.  This event must be registered in the context it is being fired.
    */
  var eventType: String = js.native
  /**
    * Optional: A list of scopes which are are relevant to the event.
    */
  var scopes: js.Array[EventScope] = js.native
}

object VssNotificationEvent {
  @scala.inline
  def apply(
    actors: js.Array[EventActor],
    artifactUris: js.Array[String],
    data: js.Any,
    eventType: String,
    scopes: js.Array[EventScope]
  ): VssNotificationEvent = {
    val __obj = js.Dynamic.literal(actors = actors.asInstanceOf[js.Any], artifactUris = artifactUris.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssNotificationEvent]
  }
  @scala.inline
  implicit class VssNotificationEventOps[Self <: VssNotificationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActors(value: js.Array[EventActor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[EventScope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

