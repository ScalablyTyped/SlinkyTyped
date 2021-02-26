package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ColorHCL
import typingsSlinky.vegaTypings.encodeMod.ColorHSL
import typingsSlinky.vegaTypings.encodeMod.ColorLAB
import typingsSlinky.vegaTypings.encodeMod.ColorRGB
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends _ColorValueRef {
  
  var color: ColorRGB | ColorHSL | ColorLAB | ColorHCL = js.native
}
object Color {
  
  @scala.inline
  def apply(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorRGB | ColorHSL | ColorLAB | ColorHCL): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
