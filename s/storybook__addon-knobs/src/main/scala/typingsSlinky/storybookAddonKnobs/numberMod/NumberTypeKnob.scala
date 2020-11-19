package typingsSlinky.storybookAddonKnobs.numberMod

import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberTypeKnob
  extends KnobControlConfig[NumberTypeKnobValue]
     with NumberTypeKnobOptions
object NumberTypeKnob {
  
  @scala.inline
  def apply(name: String, value: NumberTypeKnobValue): NumberTypeKnob = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberTypeKnob]
  }
}
