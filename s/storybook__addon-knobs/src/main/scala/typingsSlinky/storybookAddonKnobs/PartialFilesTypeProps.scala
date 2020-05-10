package typingsSlinky.storybookAddonKnobs

import typingsSlinky.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.filesMod.FileTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
@js.native
trait PartialFilesTypeProps extends js.Object {
  var knob: js.UndefOr[FileTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]] = js.native
}

object PartialFilesTypeProps {
  @scala.inline
  def apply(): PartialFilesTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilesTypeProps]
  }
  @scala.inline
  implicit class PartialFilesTypePropsOps[Self <: PartialFilesTypeProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ DateTypeKnobValue => DateTypeKnobValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
  }
  
}

