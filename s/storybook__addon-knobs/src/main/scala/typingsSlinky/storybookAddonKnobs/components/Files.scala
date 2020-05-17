package typingsSlinky.storybookAddonKnobs.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.filesMod.FileTypeKnob
import typingsSlinky.storybookAddonKnobs.filesMod.FilesTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Files {
  @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[FilesTypeProps]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[FilesTypeProps]]))
  }
}

