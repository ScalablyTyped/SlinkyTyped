package typingsSlinky.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Stores color data including opacity._
  *
  * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
  * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
  * @see https://docs.scriptable.app/color/#-new-color
  */
@js.native
trait Color extends StObject {
  
  /**
    * _Alpha of the color._
    * @see https://docs.scriptable.app/color/#alpha
    */
  var alpha: Double = js.native
  
  /**
    * _Amount of blue in the color._
    * @see https://docs.scriptable.app/color/#blue
    */
  var blue: Double = js.native
  
  /**
    * _Amount of green in the color._
    * @see https://docs.scriptable.app/color/#green
    */
  var green: Double = js.native
  
  /**
    * _HEX representation._
    * @see https://docs.scriptable.app/color/#hex
    */
  var hex: String = js.native
  
  /**
    * _Amount of red in the color._
    * @see https://docs.scriptable.app/color/#red
    */
  var red: Double = js.native
}
object Color {
  
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, hex: String, red: Double): Color = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
