package typingsSlinky.xstate.typesMod.SCXML

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.xstateStrings.external
import typingsSlinky.xstate.xstateStrings.internal
import typingsSlinky.xstate.xstateStrings.platform
import typingsSlinky.xstate.xstateStrings.scxml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event[TEvent /* <: EventObject */] extends js.Object {
  /**
    * @private
    */
  @JSName("$$type")
  var DollarDollartype: scxml = js.native
  /**
    * This field contains whatever data the sending entity chose to include in this event.
    * The receiving SCXML Processor should reformat this data to match its data model,
    * but must not otherwise modify it.
    *
    * If the conversion is not possible, the Processor must leave the field blank
    * and must place an error 'error.execution' in the internal event queue.
    */
  var data: TEvent = js.native
  /**
    * If this event is generated from an invoked child process, the SCXML Processor
    * must set this field to the invoke id of the invocation that triggered the child process.
    * Otherwise it must leave it blank.
    */
  var invokeid: js.UndefOr[String] = js.native
  /**
    * This is a character string giving the name of the event.
    * The SCXML Processor must set the name field to the name of this event.
    * It is what is matched against the 'event' attribute of <transition>.
    * Note that transitions can do additional tests by using the value of this field
    * inside boolean expressions in the 'cond' attribute.
    */
  var name: String = js.native
  /**
    * This is a URI, equivalent to the 'target' attribute on the <send> element.
    * For external events, the SCXML Processor should set this field to a value which,
    * when used as the value of 'target', will allow the receiver of the event to <send>
    * a response back to the originating entity via the Event I/O Processor specified in 'origintype'.
    * For internal and platform events, the Processor must leave this field blank.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * This is equivalent to the 'type' field on the <send> element.
    * For external events, the SCXML Processor should set this field to a value which,
    * when used as the value of 'type', will allow the receiver of the event to <send>
    * a response back to the originating entity at the URI specified by 'origin'.
    * For internal and platform events, the Processor must leave this field blank.
    */
  var origintype: js.UndefOr[String] = js.native
  /**
    * If the sending entity has specified a value for this, the Processor must set this field to that value
    * (see C Event I/O Processors for details).
    * Otherwise, in the case of error events triggered by a failed attempt to send an event,
    * the Processor must set this field to the send id of the triggering <send> element.
    * Otherwise it must leave it blank.
    */
  var sendid: js.UndefOr[String] = js.native
  /**
    * This field describes the event type.
    * The SCXML Processor must set it to: "platform" (for events raised by the platform itself, such as error events),
    * "internal" (for events raised by <raise> and <send> with target '_internal')
    * or "external" (for all other events).
    */
  var `type`: platform | internal | external = js.native
}

object Event {
  @scala.inline
  def apply[TEvent](DollarDollartype: scxml, data: TEvent, name: String, `type`: platform | internal | external): Event[TEvent] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("$$type")(DollarDollartype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  @scala.inline
  implicit class EventOps[Self[tevent] <: Event[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withDollarDollartype(value: scxml): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: TEvent): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: platform | internal | external): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeid(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokeid: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeid")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigintype(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origintype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigintype: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origintype")(js.undefined)
        ret
    }
    @scala.inline
    def withSendid(value: String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendid: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendid")(js.undefined)
        ret
    }
  }
  
}

