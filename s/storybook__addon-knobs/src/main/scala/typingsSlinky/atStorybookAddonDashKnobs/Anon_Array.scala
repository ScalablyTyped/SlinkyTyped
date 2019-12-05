package typingsSlinky.atStorybookAddonDashKnobs

import slinky.core.ReactComponentClass
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesBooleanMod.BooleanTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesButtonMod.ButtonTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesFilesMod.FilesTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesOptionsMod.OptionsTypeProps
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeKnobValue
import typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesSelectMod.SelectTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var boolean: ReactComponentClass[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean
  var button: ReactComponentClass[ButtonTypeProps] with Anon_DeserializeSerializeUndefined
  var files: ReactComponentClass[FilesTypeProps] with Anon_DeserializeSerializeUndefined
  var options: ReactComponentClass[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT
  var select: ReactComponentClass[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue
}

object Anon_Array {
  @scala.inline
  def apply(
    boolean: ReactComponentClass[BooleanTypeProps] with Anon_DeserializeSerializeValueBoolean,
    button: ReactComponentClass[ButtonTypeProps] with Anon_DeserializeSerializeUndefined,
    files: ReactComponentClass[FilesTypeProps] with Anon_DeserializeSerializeUndefined,
    options: ReactComponentClass[OptionsTypeProps[_]] with Anon_DeserializeSerializeValueT,
    select: ReactComponentClass[SelectTypeProps[SelectTypeKnobValue]] with Anon_DeserializeSerializeValueSelectTypeKnobValue
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Array]
  }
}

