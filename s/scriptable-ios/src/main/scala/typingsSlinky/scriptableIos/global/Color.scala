package typingsSlinky.scriptableIos.global

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
@JSGlobal("Color")
@js.native
class Color protected ()
  extends typingsSlinky.scriptableIos.Color {
  /**
    * _Stores color data including opacity._
    *
    * Constructs a new color with a hex value and optionally an alpha value. The hex value may specify the alpha value but this will be ignored if the alpha value parameter is provided.
    * Examples of valid hex values: #ff0000, #00ff0080 #00f and #ff. The hashtag is optional.
    * @param hex - Hex value.
    * @param alpha - Alpha value.
    * @see https://docs.scriptable.app/color/#-new-color
    */
  def this(hex: String, alpha: Double) = this()
}
/* static members */
@JSGlobal("Color")
@js.native
object Color extends js.Object {
  
  /**
    * _Constructs a black color._
    * @see https://docs.scriptable.app/color/#black
    */
  def black(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a blue color._
    * @see https://docs.scriptable.app/color/#blue
    */
  def blue(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a brown color._
    * @see https://docs.scriptable.app/color/#brown
    */
  def brown(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a transparent color._
    * @see https://docs.scriptable.app/color/#clear
    */
  def clear(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a cyan color._
    * @see https://docs.scriptable.app/color/#cyan
    */
  def cyan(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a dark gray color._
    * @see https://docs.scriptable.app/color/#darkgray
    */
  def darkGray(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Creates a dynamic color._
    *
    * The dynamic color will use either its light or dark variant depending on the appearance of the system.
    *
    * Dynamic colors are not supported when used with `DrawContext`.
    * @param lightColor - Color used in light appearance.
    * @param darkColor - Color used in dark appearance.
    * @see https://docs.scriptable.app/color/#dynamic
    */
  def dynamic(lightColor: typingsSlinky.scriptableIos.Color, darkColor: typingsSlinky.scriptableIos.Color): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a gray color._
    * @see https://docs.scriptable.app/color/#gray
    */
  def gray(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a green color._
    * @see https://docs.scriptable.app/color/#green
    */
  def green(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a light gray color._
    * @see https://docs.scriptable.app/color/#lightgray
    */
  def lightGray(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a magenta color._
    * @see https://docs.scriptable.app/color/#magenta
    */
  def magenta(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a orange color._
    * @see https://docs.scriptable.app/color/#orange
    */
  def orange(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a purple color._
    * @see https://docs.scriptable.app/color/#purple
    */
  def purple(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a red color._
    * @see https://docs.scriptable.app/color/#red
    */
  def red(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a white color._
    * @see https://docs.scriptable.app/color/#white
    */
  def white(): typingsSlinky.scriptableIos.Color = js.native
  
  /**
    * _Constructs a yellow color._
    * @see https://docs.scriptable.app/color/#yellow
    */
  def yellow(): typingsSlinky.scriptableIos.Color = js.native
}
