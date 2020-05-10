package typingsSlinky.storybookAddonKnobs.filesMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesTypeProps extends KnobControlProps[DateTypeKnobValue] {
  @JSName("knob")
  var knob_FilesTypeProps: FileTypeKnob = js.native
}

object FilesTypeProps {
  @scala.inline
  def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): FilesTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[FilesTypeProps]
  }
  @scala.inline
  implicit class FilesTypePropsOps[Self <: FilesTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKnob(value: FileTypeKnob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

