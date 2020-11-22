package typingsSlinky.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typingsSlinky.storybookAddonKnobs.arrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofArrayType extends Instantiable0[default] {
  
  var defaultProps: PartialArrayTypeProps = js.native
  
  def deserialize(value: js.Array[String]): js.Array[String] = js.native
  def deserialize(value: Record[String, String]): js.Array[String] = js.native
  
  var propTypes: Knob = js.native
  
  def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = js.native
}
