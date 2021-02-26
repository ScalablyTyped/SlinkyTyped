package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.filesMod.FileTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
@js.native
trait PartialFilesTypeProps extends StObject {
  
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
  implicit class PartialFilesTypePropsMutableBuilder[Self <: PartialFilesTypeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: FileTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ DateTypeKnobValue => DateTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
