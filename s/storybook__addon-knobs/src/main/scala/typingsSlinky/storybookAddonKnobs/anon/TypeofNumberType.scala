package typingsSlinky.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnobValue
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeProps
import typingsSlinky.storybookAddonKnobs.numberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNumberType extends Instantiable0[default] {
  
  var defaultProps: NumberTypeProps = js.native
  
  def deserialize(value: String): Double | Null = js.native
  
  var propTypes: KnobValidator = js.native
  
  def serialize(): String = js.native
  def serialize(value: NumberTypeKnobValue): String = js.native
}
