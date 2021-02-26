package typingsSlinky.three

import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Record
import typingsSlinky.three.bufferAttributeMod.BufferAttribute
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("three/src/math/Color", "Color")
  @js.native
  class Color () extends StObject {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(r: Double, g: Double, b: Double) = this()
    
    def add(color: Color): this.type = js.native
    
    def addColors(color1: Color, color2: Color): this.type = js.native
    
    def addScalar(s: Double): this.type = js.native
    
    /**
    	 * Blue channel value between 0 and 1. Default is 1.
    	 * @default 1
    	 */
    var b: Double = js.native
    
    /**
    	 * Converts this color from gamma to linear space.
    	 */
    def convertGammaToLinear(): Color = js.native
    def convertGammaToLinear(gammaFactor: Double): Color = js.native
    
    /**
    	 * Converts this color from linear to gamma space.
    	 */
    def convertLinearToGamma(): Color = js.native
    def convertLinearToGamma(gammaFactor: Double): Color = js.native
    
    /**
    	 * Converts this color from linear to sRGB space.
    	 */
    def convertLinearToSRGB(): Color = js.native
    
    /**
    	 * Converts this color from sRGB to linear space.
    	 */
    def convertSRGBToLinear(): Color = js.native
    
    /**
    	 * Copies given color.
    	 * @param color Color to copy.
    	 */
    def copy(color: Color): this.type = js.native
    
    /**
    	 * Copies given color making conversion from gamma to linear space.
    	 * @param color Color to copy.
    	 */
    def copyGammaToLinear(color: Color): Color = js.native
    def copyGammaToLinear(color: Color, gammaFactor: Double): Color = js.native
    
    /**
    	 * Copies given color making conversion from linear to gamma space.
    	 * @param color Color to copy.
    	 */
    def copyLinearToGamma(color: Color): Color = js.native
    def copyLinearToGamma(color: Color, gammaFactor: Double): Color = js.native
    
    /**
    	 * Copies given color making conversion from linear to sRGB space.
    	 * @param color Color to copy.
    	 */
    def copyLinearToSRGB(color: Color): Color = js.native
    
    /**
    	 * Copies given color making conversion from sRGB to linear space.
    	 * @param color Color to copy.
    	 */
    def copySRGBToLinear(color: Color): Color = js.native
    
    def equals(color: Color): Boolean = js.native
    
    /**
    	 * Sets this color's red, green and blue value from the provided array.
    	 * @param array the source array.
    	 * @param offset (optional) offset into the array. Default is 0.
    	 */
    def fromArray(array: js.Array[Double]): this.type = js.native
    def fromArray(array: js.Array[Double], offset: Double): this.type = js.native
    /**
    	 * Sets this color's red, green and blue value from the provided array-like.
    	 * @param array the source array-like.
    	 * @param offset (optional) offset into the array-like. Default is 0.
    	 */
    def fromArray(array: ArrayLike[Double]): this.type = js.native
    def fromArray(array: ArrayLike[Double], offset: Double): this.type = js.native
    
    def fromBufferAttribute(attribute: BufferAttribute, index: Double): this.type = js.native
    
    /**
    	 * Green channel value between 0 and 1. Default is 1.
    	 * @default 1
    	 */
    var g: Double = js.native
    
    def getHSL(target: HSL): HSL = js.native
    
    /**
    	 * Returns the hexadecimal value of this color.
    	 */
    def getHex(): Double = js.native
    
    /**
    	 * Returns the string formated hexadecimal value of this color.
    	 */
    def getHexString(): String = js.native
    
    /**
    	 * Returns the value of this color in CSS context style.
    	 * Example: rgb(r, g, b)
    	 */
    def getStyle(): String = js.native
    
    val isColor: `true` = js.native
    
    def lerp(color: Color, alpha: Double): this.type = js.native
    
    def lerpHSL(color: Color, alpha: Double): this.type = js.native
    
    def multiply(color: Color): this.type = js.native
    
    def multiplyScalar(s: Double): this.type = js.native
    
    def offsetHSL(h: Double, s: Double, l: Double): this.type = js.native
    
    /**
    	 * Red channel value between 0 and 1. Default is 1.
    	 * @default 1
    	 */
    var r: Double = js.native
    
    def set(color: String): Color = js.native
    def set(color: Double): Color = js.native
    def set(color: Color): Color = js.native
    
    /**
    	 * Sets this color from a color name.
    	 * Faster than {@link Color#setStyle .setStyle()} method if you don't need the other CSS-style formats.
    	 * @param style Color name in X11 format.
    	 */
    def setColorName(style: String): Color = js.native
    
    /**
    	 * Sets this color from HSL values.
    	 * Based on MochiKit implementation by Bob Ippolito.
    	 *
    	 * @param h Hue channel value between 0 and 1.
    	 * @param s Saturation value channel between 0 and 1.
    	 * @param l Value channel value between 0 and 1.
    	 */
    def setHSL(h: Double, s: Double, l: Double): Color = js.native
    
    def setHex(hex: Double): Color = js.native
    
    /**
    	 * Sets this color from RGB values.
    	 * @param r Red channel value between 0 and 1.
    	 * @param g Green channel value between 0 and 1.
    	 * @param b Blue channel value between 0 and 1.
    	 */
    def setRGB(r: Double, g: Double, b: Double): Color = js.native
    
    def setScalar(scalar: Double): Color = js.native
    
    /**
    	 * Sets this color from a CSS context style string.
    	 * @param contextStyle Color in CSS context style format.
    	 */
    def setStyle(style: String): Color = js.native
    
    def sub(color: Color): this.type = js.native
    
    /**
    	 * Returns an array [red, green, blue], or copies red, green and blue into the provided array.
    	 * @param array (optional) array to store the color to. If this is not provided, a new array will be created.
    	 * @param offset (optional) optional offset into the array.
    	 * @return The created or provided array.
    	 */
    def toArray(): js.Array[Double] = js.native
    def toArray(array: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
    def toArray(array: js.Array[Double]): js.Array[Double] = js.native
    def toArray(array: js.Array[Double], offset: Double): js.Array[Double] = js.native
    /**
    	 * Copies red, green and blue into the provided array-like.
    	 * @param array array-like to store the color to.
    	 * @param offset (optional) optional offset into the array-like.
    	 * @return The provided array-like.
    	 */
    def toArray(xyz: ArrayLike[Double]): ArrayLike[Double] = js.native
    def toArray(xyz: ArrayLike[Double], offset: Double): ArrayLike[Double] = js.native
  }
  /* static members */
  object Color {
    
    @JSImport("three/src/math/Color", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	 * List of X11 color names.
    	 */
    @JSImport("three/src/math/Color", "Color.NAMES")
    @js.native
    def NAMES: Record[String, Double] = js.native
    @scala.inline
    def NAMES_=(x: Record[String, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAMES")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait HSL extends StObject {
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object HSL {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit class HSLMutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
}
