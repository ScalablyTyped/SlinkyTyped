package typingsSlinky.atStorybookAddonDashKnobs

import slinky.core.ReactComponentClass
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.`object`
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.array
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.boolean
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.button
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.color
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.date
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.files
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.number
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.options
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.radios
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.select
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.text
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FilesTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types", JSImport.Namespace)
@js.native
object distComponentsTypesMod extends js.Object {
  def getKnobControl(
    `type`: number | boolean | `object` | color | button | select | text | date | options | radios | array | files
  ): KnobControlType = js.native
  @js.native
  object default extends js.Object {
    var array: TypeofClassArrayType = js.native
    var boolean: ReactComponentClass[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean = js.native
    var button: ReactComponentClass[ButtonTypeProps] with Anon_DeserializeSerializeUndefined = js.native
    var color: TypeofClassColorType = js.native
    var date: TypeofClassDateType = js.native
    var files: ReactComponentClass[FilesTypeProps] with Anon_DeserializeSerializeUndefined = js.native
    var number: TypeofClassNumberType = js.native
    var `object`: TypeofClassObjectType = js.native
    var options: ReactComponentClass[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT = js.native
    var radios: TypeofClassRadiosType = js.native
    var select: ReactComponentClass[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue = js.native
    var text: TypeofClassTextType = js.native
  }
  
  type KnobControlType = ReactComponentClass[_] with Anon_DeserializeSerializeV
  type KnobType = String
}

