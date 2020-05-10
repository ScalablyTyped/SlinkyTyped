package typingsSlinky.victory.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventPropTypeInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.native
  /**
    * Event handlers map. Keys are standard event names (such as onClick) and values are event callbacks
    */
  var eventHandlers: StringDictionary[
    js.Function1[
      /* event */ SyntheticEvent[Event_, _], 
      (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
    ]
  ] = js.native
  var eventKey: js.UndefOr[TEventKey] = js.native
  /**
    * Targets may be any valid style namespace for a given component
    */
  var target: TTarget = js.native
}

object EventPropTypeInterface {
  @scala.inline
  def apply[TTarget, TEventKey](
    eventHandlers: StringDictionary[
      js.Function1[
        /* event */ SyntheticEvent[Event_, _], 
        (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
      ]
    ],
    target: TTarget
  ): EventPropTypeInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(eventHandlers = eventHandlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPropTypeInterface[TTarget, TEventKey]]
  }
  @scala.inline
  implicit class EventPropTypeInterfaceOps[Self[ttarget, teventkey] <: EventPropTypeInterface[ttarget, teventkey], TTarget, TEventKey] (val x: Self[TTarget, TEventKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TEventKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TEventKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TEventKey]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TEventKey]) with Other]
    @scala.inline
    def withEventHandlers(
      value: StringDictionary[
          js.Function1[
            /* event */ SyntheticEvent[Event_, _], 
            (js.Array[EventCallbackInterface[TTarget, TEventKey]]) | (EventCallbackInterface[TTarget, TEventKey])
          ]
        ]
    ): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: TTarget): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildName(value: String): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildName: Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventKey(value: TEventKey): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventKey: Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(js.undefined)
        ret
    }
  }
  
}

