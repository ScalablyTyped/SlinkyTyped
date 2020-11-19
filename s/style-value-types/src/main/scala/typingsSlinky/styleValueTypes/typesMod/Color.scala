package typingsSlinky.styleValueTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styleValueTypes.typesMod.HSLA
  - typingsSlinky.styleValueTypes.typesMod.RGBA
*/
trait Color extends js.Object
object Color {
  
  @scala.inline
  def HSLA(hue: Double, lightness: Double, saturation: Double): Color = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  def RGBA(blue: Double, green: Double, red: Double): Color = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}
