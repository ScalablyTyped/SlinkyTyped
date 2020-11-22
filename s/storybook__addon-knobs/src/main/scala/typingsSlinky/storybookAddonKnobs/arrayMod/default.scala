package typingsSlinky.storybookAddonKnobs.arrayMod

import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.anon.Knob
import typingsSlinky.storybookAddonKnobs.anon.PartialArrayTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
@js.native
class default () extends ArrayType
/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: PartialArrayTypeProps = js.native
  
  def deserialize(value: js.Array[String]): js.Array[String] = js.native
  def deserialize(value: Record[String, String]): js.Array[String] = js.native
  
  var propTypes: Knob = js.native
  
  def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = js.native
}
