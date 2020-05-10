package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single cell in the terminal's buffer.
  */
@js.native
trait IBufferCell extends js.Object {
  /**
    * Gets a cell's background color number, this differs depending on what the
    * color mode of the cell is:
    *
    * - Default: This should be 0, representing the default background color
    *   (CSI 49 m).
    * - Palette: This is a number from 0 to 255 of ANSI colors
    *   (CSI 4(0-7) m, CSI 10(0-7) m, CSI 48 ; 5 ; 0-255 m).
    * - RGB: A hex value representing a 'true color': 0xRRGGBB
    *   (CSI 4 8 ; 2 ; Pi ; Pr ; Pg ; Pb)
    */
  def getBgColor(): Double = js.native
  /**
    * Gets the number representation of the background color mode, this can be
    * used to perform quick comparisons of 2 cells to see if they're the same.
    * Use `isBgRGB`, `isBgPalette` and `isBgDefault` to check what color mode
    * a cell is.
    */
  def getBgColorMode(): Double = js.native
  /**
    * The character(s) within the cell. Examples of what this can contain:
    *
    * - A normal width character
    * - A wide character (eg. CJK)
    * - An emoji
    */
  def getChars(): String = js.native
  /**
    * Gets the UTF32 codepoint of single characters, if content is a combined
    * string it returns the codepoint of the last character in the string.
    */
  def getCode(): Double = js.native
  /**
    * Gets a cell's foreground color number, this differs depending on what the
    * color mode of the cell is:
    *
    * - Default: This should be 0, representing the default foreground color
    *   (CSI 39 m).
    * - Palette: This is a number from 0 to 255 of ANSI colors (CSI 3(0-7) m,
    *   CSI 9(0-7) m, CSI 38 ; 5 ; 0-255 m).
    * - RGB: A hex value representing a 'true color': 0xRRGGBB.
    *   (CSI 3 8 ; 2 ; Pi ; Pr ; Pg ; Pb)
    */
  def getFgColor(): Double = js.native
  /**
    * Gets the number representation of the foreground color mode, this can be
    * used to perform quick comparisons of 2 cells to see if they're the same.
    * Use `isFgRGB`, `isFgPalette` and `isFgDefault` to check what color mode
    * a cell is.
    */
  def getFgColorMode(): Double = js.native
  /**
    * The width of the character. Some examples:
    *
    * - `1` for most cells.
    * - `2` for wide character like CJK glyphs.
    * - `0` for cells immediately following cells with a width of `2`.
    */
  def getWidth(): Double = js.native
  /** Whether the cell has the default attribute (no color or style). */
  def isAttributeDefault(): Boolean = js.native
  /** Whether the cell is using the default background color mode. */
  def isBgDefault(): Boolean = js.native
  /** Whether the cell is using the palette background color mode. */
  def isBgPalette(): Boolean = js.native
  /** Whether the cell is using the RGB background color mode. */
  def isBgRGB(): Boolean = js.native
  /** Whether the cell has the inverse attribute (CSI 5 m). */
  def isBlink(): Double = js.native
  /** Whether the cell has the bold attribute (CSI 1 m). */
  def isBold(): Double = js.native
  /** Whether the cell has the inverse attribute (CSI 2 m). */
  def isDim(): Double = js.native
  /** Whether the cell is using the default foreground color mode. */
  def isFgDefault(): Boolean = js.native
  /** Whether the cell is using the palette foreground color mode. */
  def isFgPalette(): Boolean = js.native
  /** Whether the cell is using the RGB foreground color mode. */
  def isFgRGB(): Boolean = js.native
  /** Whether the cell has the inverse attribute (CSI 7 m). */
  def isInverse(): Double = js.native
  /** Whether the cell has the inverse attribute (CSI 8 m). */
  def isInvisible(): Double = js.native
  /** Whether the cell has the inverse attribute (CSI 3 m). */
  def isItalic(): Double = js.native
  /** Whether the cell has the underline attribute (CSI 4 m). */
  def isUnderline(): Double = js.native
}

object IBufferCell {
  @scala.inline
  def apply(
    getBgColor: () => Double,
    getBgColorMode: () => Double,
    getChars: () => String,
    getCode: () => Double,
    getFgColor: () => Double,
    getFgColorMode: () => Double,
    getWidth: () => Double,
    isAttributeDefault: () => Boolean,
    isBgDefault: () => Boolean,
    isBgPalette: () => Boolean,
    isBgRGB: () => Boolean,
    isBlink: () => Double,
    isBold: () => Double,
    isDim: () => Double,
    isFgDefault: () => Boolean,
    isFgPalette: () => Boolean,
    isFgRGB: () => Boolean,
    isInverse: () => Double,
    isInvisible: () => Double,
    isItalic: () => Double,
    isUnderline: () => Double
  ): IBufferCell = {
    val __obj = js.Dynamic.literal(getBgColor = js.Any.fromFunction0(getBgColor), getBgColorMode = js.Any.fromFunction0(getBgColorMode), getChars = js.Any.fromFunction0(getChars), getCode = js.Any.fromFunction0(getCode), getFgColor = js.Any.fromFunction0(getFgColor), getFgColorMode = js.Any.fromFunction0(getFgColorMode), getWidth = js.Any.fromFunction0(getWidth), isAttributeDefault = js.Any.fromFunction0(isAttributeDefault), isBgDefault = js.Any.fromFunction0(isBgDefault), isBgPalette = js.Any.fromFunction0(isBgPalette), isBgRGB = js.Any.fromFunction0(isBgRGB), isBlink = js.Any.fromFunction0(isBlink), isBold = js.Any.fromFunction0(isBold), isDim = js.Any.fromFunction0(isDim), isFgDefault = js.Any.fromFunction0(isFgDefault), isFgPalette = js.Any.fromFunction0(isFgPalette), isFgRGB = js.Any.fromFunction0(isFgRGB), isInverse = js.Any.fromFunction0(isInverse), isInvisible = js.Any.fromFunction0(isInvisible), isItalic = js.Any.fromFunction0(isItalic), isUnderline = js.Any.fromFunction0(isUnderline))
    __obj.asInstanceOf[IBufferCell]
  }
  @scala.inline
  implicit class IBufferCellOps[Self <: IBufferCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBgColor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBgColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBgColorMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBgColorMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetChars(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChars")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFgColor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFgColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFgColorMode(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFgColorMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAttributeDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAttributeDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBgDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBgDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBgPalette(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBgPalette")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBgRGB(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBgRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBlink(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBold(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBold")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDim(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDim")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFgDefault(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFgDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFgPalette(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFgPalette")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFgRGB(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFgRGB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInverse(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInvisible(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInvisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsItalic(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItalic")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUnderline(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnderline")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

