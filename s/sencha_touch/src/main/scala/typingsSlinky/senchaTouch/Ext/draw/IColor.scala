package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColor extends IBase {
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1).
  		* @returns Ext.draw.Color
  		*/
  var createLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the equivalent HSL components of the color
  		* @param target Array Optional array to receive the values.
  		* @returns Array
  		*/
  var getHSL: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.native
  /** [Method] Parse the string and set current color
  		* @param str String Color in string.
  		* @returns Object this
  		*/
  var setFromString: js.UndefOr[js.Function1[/* str */ js.UndefOr[String], _]] = js.native
  /** [Method] Set current color based on the specified HSL values
  		* @param h Number Hue component (0..359)
  		* @param s Number Saturation component (0..1)
  		* @param l Number Lightness component (0..1)
  		* @returns Object this
  		*/
  var setHSL: js.UndefOr[
    js.Function3[/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double], _]
  ] = js.native
  /** [Method] Convert a color to hexadecimal format
  		* @param color String/Array The color value (i.e 'rgb(255, 255, 255)', 'color: #ffffff'). Can also be an Array, in this case the function handles the first member.
  		* @returns String The color in hexadecimal format.
  		*/
  var toHex: js.UndefOr[js.Function1[/* color */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[String]] = js.native
}

object IColor {
  @scala.inline
  def apply(): IColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColor]
  }
  @scala.inline
  implicit class IColorOps[Self <: IColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDarker(value: /* factor */ js.UndefOr[Double] => IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateDarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDarker")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateLighter(value: /* factor */ js.UndefOr[Double] => IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLighter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateLighter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLighter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGrayscale(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrayscale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGrayscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGrayscale")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHSL(value: /* target */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHSL")(js.undefined)
        ret
    }
    @scala.inline
    def withLightnessFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightnessFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightnessFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightnessFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFromString(value: /* str */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFromString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFromString")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHSL(value: (/* h */ js.UndefOr[Double], /* s */ js.UndefOr[Double], /* l */ js.UndefOr[Double]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHSL")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetHSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHSL")(js.undefined)
        ret
    }
    @scala.inline
    def withToHex(value: /* color */ js.UndefOr[js.Any] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHex")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

