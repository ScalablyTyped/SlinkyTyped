package typingsSlinky.storybookComponents.components

import typingsSlinky.storybookComponents.fieldMod.FieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormField {
  @JSImport("@storybook/components", "Form.Field")
  @js.native
  object component extends js.Object
  
  def withProps(p: FieldProps): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormField.type): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, js.Dictionary.empty))()
}

