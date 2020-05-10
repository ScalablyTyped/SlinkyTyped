package typingsSlinky.xstate.jsonMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Record
import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.InvokeDefinition
import typingsSlinky.xstate.xstateStrings.`final`
import typingsSlinky.xstate.xstateStrings.atomic
import typingsSlinky.xstate.xstateStrings.compound
import typingsSlinky.xstate.xstateStrings.history
import typingsSlinky.xstate.xstateStrings.parallel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateNodeConfig extends js.Object {
  var entry: js.Array[ActionObject[_, _]] = js.native
  var exit: js.Array[ActionObject[_, _]] = js.native
  var id: String = js.native
  var initial: js.UndefOr[String] = js.native
  var invoke: js.Array[InvokeDefinition[_, _]] = js.native
  var key: String = js.native
  var on: StringDictionary[js.Array[TransitionConfig]] = js.native
  var states: Record[String, StateNodeConfig] = js.native
  var `type`: atomic | compound | parallel | `final` | history = js.native
}

object StateNodeConfig {
  @scala.inline
  def apply(
    entry: js.Array[ActionObject[_, _]],
    exit: js.Array[ActionObject[_, _]],
    id: String,
    invoke: js.Array[InvokeDefinition[_, _]],
    key: String,
    on: StringDictionary[js.Array[TransitionConfig]],
    states: Record[String, StateNodeConfig],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeConfig = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeConfig]
  }
  @scala.inline
  implicit class StateNodeConfigOps[Self <: StateNodeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntry(value: js.Array[ActionObject[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: js.Array[ActionObject[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoke(value: js.Array[InvokeDefinition[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: StringDictionary[js.Array[TransitionConfig]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: Record[String, StateNodeConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: atomic | compound | parallel | `final` | history): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
  }
  
}

