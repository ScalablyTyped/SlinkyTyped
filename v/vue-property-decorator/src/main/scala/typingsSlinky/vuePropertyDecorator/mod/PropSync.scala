package typingsSlinky.vuePropertyDecorator.mod

import typingsSlinky.std.PropertyDecorator
import typingsSlinky.vue.optionsMod.PropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-property-decorator", "PropSync")
@js.native
object PropSync extends js.Object {
  
  def apply(propName: String): PropertyDecorator = js.native
  def apply(propName: String, options: js.Array[Constructor]): PropertyDecorator = js.native
  def apply(propName: String, options: PropOptions[_]): PropertyDecorator = js.native
  def apply(propName: String, options: Constructor): PropertyDecorator = js.native
}
