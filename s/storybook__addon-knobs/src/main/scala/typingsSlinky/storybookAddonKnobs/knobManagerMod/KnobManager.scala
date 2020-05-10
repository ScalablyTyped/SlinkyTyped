package typingsSlinky.storybookAddonKnobs.knobManagerMod

import typingsSlinky.storybookAddonKnobs.typeDefsMod.Knob
import typingsSlinky.storybookAddonKnobs.typeDefsMod.Mutable
import typingsSlinky.storybookAddonKnobs.typesMod.KnobType
import typingsSlinky.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnobManager extends js.Object {
  var calling: Boolean = js.native
  var channel: js.UndefOr[Channel] = js.native
  var knobStore: typingsSlinky.storybookAddonKnobs.knobStoreMod.default = js.native
  var options: KnobManagerOptions = js.native
  def _mayCallChannel(): Unit = js.native
  def getKnobValue(hasValue: Knob[_]): js.Any = js.native
  def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
  ] = js.native
  def setChannel(channel: Channel): Unit = js.native
  def setOptions(options: KnobManagerOptions): Unit = js.native
}

object KnobManager {
  @scala.inline
  def apply(
    _mayCallChannel: () => Unit,
    calling: Boolean,
    getKnobValue: Knob[_] => js.Any,
    knob: (String, Knob[js.Any]) => Mutable[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
    ],
    knobStore: typingsSlinky.storybookAddonKnobs.knobStoreMod.default,
    options: KnobManagerOptions,
    setChannel: Channel => Unit,
    setOptions: KnobManagerOptions => Unit
  ): KnobManager = {
    val __obj = js.Dynamic.literal(_mayCallChannel = js.Any.fromFunction0(_mayCallChannel), calling = calling.asInstanceOf[js.Any], getKnobValue = js.Any.fromFunction1(getKnobValue), knob = js.Any.fromFunction2(knob), knobStore = knobStore.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setChannel = js.Any.fromFunction1(setChannel), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[KnobManager]
  }
  @scala.inline
  implicit class KnobManagerOps[Self <: KnobManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_mayCallChannel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mayCallChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKnobValue(value: Knob[_] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKnobValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKnob(
      value: (String, Knob[js.Any]) => Mutable[
          /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withKnobStore(value: typingsSlinky.storybookAddonKnobs.knobStoreMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knobStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: KnobManagerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetChannel(value: Channel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: KnobManagerOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChannel(value: Channel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
  }
  
}

