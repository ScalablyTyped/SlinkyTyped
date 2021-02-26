package typingsSlinky.storybookComponents.components

import typingsSlinky.storybookComponents.fieldMod.FieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("@storybook/components/dist/form/field/field", "Field")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Field.type): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FieldProps): SharedBuilder_FieldProps1274675511 = new SharedBuilder_FieldProps1274675511(js.Array(this.component, p.asInstanceOf[js.Any]))
}
