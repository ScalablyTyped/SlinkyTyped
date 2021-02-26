package typingsSlinky.storybookAddonKnobs.anon

import typingsSlinky.react.mod.Validator
import typingsSlinky.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typingsSlinky.storybookAddonKnobs.filesMod.FileTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
@js.native
trait WeakValidationMapFilesTyp extends StObject {
  
  var knob: js.UndefOr[Validator[js.UndefOr[FileTypeKnob | Null]]] = js.native
  
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
    ]
  ] = js.native
}
object WeakValidationMapFilesTyp {
  
  @scala.inline
  def apply(): WeakValidationMapFilesTyp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapFilesTyp]
  }
  
  @scala.inline
  implicit class WeakValidationMapFilesTypMutableBuilder[Self <: WeakValidationMapFilesTyp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKnob(value: Validator[js.UndefOr[FileTypeKnob | Null]]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
