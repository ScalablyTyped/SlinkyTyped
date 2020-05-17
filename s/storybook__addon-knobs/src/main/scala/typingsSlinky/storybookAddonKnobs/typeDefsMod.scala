package typingsSlinky.storybookAddonKnobs

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.storybookAddonKnobs.anon.GroupId
import typingsSlinky.storybookAddonKnobs.anon.HideLabel
import typingsSlinky.storybookAddonKnobs.anon.PickArrayTypeKnobvaluesep
import typingsSlinky.storybookAddonKnobs.anon.PickBooleanTypeKnobvalue
import typingsSlinky.storybookAddonKnobs.anon.PickColorTypeKnobvalue
import typingsSlinky.storybookAddonKnobs.anon.PickDateTypeKnobvalue
import typingsSlinky.storybookAddonKnobs.anon.PickFileTypeKnobvalueacce
import typingsSlinky.storybookAddonKnobs.anon.PickNumberTypeKnobvaluera
import typingsSlinky.storybookAddonKnobs.anon.PickObjectTypeKnobanyvalu
import typingsSlinky.storybookAddonKnobs.anon.PickOptionsTypeKnobanyopt
import typingsSlinky.storybookAddonKnobs.anon.PickRadiosTypeKnobvalueop
import typingsSlinky.storybookAddonKnobs.anon.PickSelectTypeKnobSelectT
import typingsSlinky.storybookAddonKnobs.anon.PickTextTypeKnobvalue
import typingsSlinky.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/type-defs", JSImport.Namespace)
@js.native
object typeDefsMod extends js.Object {
  type Knob[T /* <: KnobType */] = KnobPlus[
    T, 
    HideLabel | PickArrayTypeKnobvaluesep | PickBooleanTypeKnobvalue | PickColorTypeKnobvalue | PickDateTypeKnobvalue | PickFileTypeKnobvalueacce | PickNumberTypeKnobvaluera | PickObjectTypeKnobanyvalu | PickOptionsTypeKnobanyopt | PickRadiosTypeKnobvalueop | PickSelectTypeKnobSelectT | PickTextTypeKnobvalue
  ]
  type KnobPlus[T /* <: KnobType */, K] = K with GroupId[T]
  type Mutable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: T[P] extends std.Array<infer U>? std.Array<any> : T[P]}
    */ typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.Mutable with TopLevel[js.Any]
}

