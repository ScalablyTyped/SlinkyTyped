package typingsSlinky.xstate.jsonMod

import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.Guard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionConfig extends js.Object {
  var actions: js.Array[ActionObject[_, _]] = js.native
  var cond: js.UndefOr[Guard[_, _]] = js.native
  var eventType: String = js.native
  var source: String = js.native
  var target: js.Array[String] = js.native
}

object TransitionConfig {
  @scala.inline
  def apply(actions: js.Array[ActionObject[_, _]], eventType: String, source: String, target: js.Array[String]): TransitionConfig = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
  @scala.inline
  implicit class TransitionConfigOps[Self <: TransitionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[ActionObject[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCond(value: Guard[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cond")(js.undefined)
        ret
    }
  }
  
}

