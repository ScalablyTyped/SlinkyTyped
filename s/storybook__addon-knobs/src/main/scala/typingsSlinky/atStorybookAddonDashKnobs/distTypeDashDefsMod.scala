package typingsSlinky.atStorybookAddonDashKnobs

import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.accept
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.max
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.min
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.options
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.optionsObj
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.range
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.separator
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.step
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.value
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesArrayMod.ArrayTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesColorMod.ColorTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesDateMod.DateTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FileTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesMod.KnobType
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesNumberMod.NumberTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesObjectMod.ObjectTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesRadioMod.RadiosTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesTextMod.TextTypeKnob
import typingsSlinky.atStorybookAddonDashKnobs.distTypeDashDefsMod.KnobPlus
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/type-defs", JSImport.Namespace)
@js.native
object distTypeDashDefsMod extends js.Object {
  @js.native
  trait Mutable[T] extends js.Object {
    var readonly: js.Any = js.native
  }
  
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    ((Pick[SelectTypeKnob[SelectTypeKnobValue], value | options]) with Anon_SelectV2) | Anon_CallbackHideLabel | (Pick[
      ArrayTypeKnob | BooleanTypeKnob | ColorTypeKnob | DateTypeKnob | FileTypeKnob | NumberTypeKnob | ObjectTypeKnob[js.Any] | OptionsTypeKnob[js.Any] | RadiosTypeKnob | TextTypeKnob, 
      options | value | optionsObj | accept | separator | range | min | max | step
    ])
  ]
  type KnobPlus[T /* <: KnobType */, K] = K with Anon_GroupId[T]
}

