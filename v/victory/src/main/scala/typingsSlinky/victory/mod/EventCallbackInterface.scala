package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return value for eventHandlers values
  */
@js.native
trait EventCallbackInterface[TTarget, TEventKey] extends js.Object {
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.native
  var eventKey: js.UndefOr[TEventKey] = js.native
  var target: js.UndefOr[TTarget] = js.native
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any = js.native
}

object EventCallbackInterface {
  @scala.inline
  def apply[TTarget, TEventKey](mutation: js.Any => js.Any): EventCallbackInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction1(mutation))
    __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
  }
  @scala.inline
  implicit class EventCallbackInterfaceOps[Self[ttarget, teventkey] <: EventCallbackInterface[ttarget, teventkey], TTarget, TEventKey] (val x: Self[TTarget, TEventKey]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TTarget, TEventKey] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TTarget, TEventKey]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TTarget, TEventKey]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TTarget, TEventKey]) with Other]
    @scala.inline
    def withMutation(value: js.Any => js.Any): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutation")(js.Any.fromFunction1(value))
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
    @scala.inline
    def withTarget(value: TTarget): Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self[TTarget, TEventKey] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

