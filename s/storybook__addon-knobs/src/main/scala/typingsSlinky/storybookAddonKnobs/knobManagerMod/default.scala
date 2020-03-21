package typingsSlinky.storybookAddonKnobs.knobManagerMod

import typingsSlinky.storybookAddonKnobs.typeDefsMod.Knob
import typingsSlinky.storybookAddonKnobs.typeDefsMod.Mutable
import typingsSlinky.storybookAddonKnobs.typesMod.KnobType
import typingsSlinky.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/KnobManager", JSImport.Default)
@js.native
class default () extends KnobManager {
  /* CompleteClass */
  override var calling: Boolean = js.native
  /* CompleteClass */
  override var knobStore: typingsSlinky.storybookAddonKnobs.knobStoreMod.default = js.native
  /* CompleteClass */
  override var options: KnobManagerOptions = js.native
  /* CompleteClass */
  override def _mayCallChannel(): Unit = js.native
  /* CompleteClass */
  override def getKnobValue(hasValue: Knob[_]): js.Any = js.native
  /* CompleteClass */
  override def knob[T /* <: KnobType */](name: String, options: Knob[T]): Mutable[
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/addon-knobs.@storybook/addon-knobs/dist/type-defs.Knob<T>['value'] */ js.Any
  ] = js.native
  /* CompleteClass */
  override def setChannel(channel: Channel): Unit = js.native
  /* CompleteClass */
  override def setOptions(options: KnobManagerOptions): Unit = js.native
}

