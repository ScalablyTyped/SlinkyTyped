package typingsSlinky.xregexp.anon

import typingsSlinky.xregexp.mod.UnicodeCharacterRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xregexp.xregexp.PickRequired<xregexp.xregexp.UnicodeCharacterRangeBase, 'inverseOf'> */
@js.native
trait PickRequiredUnicodeCharacAstral extends UnicodeCharacterRange {
  /**
    * An alternate name for the character range.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
    * When this is present, it is used in combination with `bmp` in astral mode.
    * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
    */
  var astral: js.UndefOr[String] = js.native
  /**
    * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
    * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
    * When `astral` is not present, this is used BMP and astral modes.
    * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
    */
  var bmp: js.UndefOr[String] = js.native
  /**
    * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
    */
  var inverseOf: js.UndefOr[String] = js.native
  /**
    * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
    */
  var isBmpLast: js.UndefOr[Boolean] = js.native
  /**
    * The name of the character range.
    */
  var name: String = js.native
}

object PickRequiredUnicodeCharacAstral {
  @scala.inline
  def apply(name: String): PickRequiredUnicodeCharacAstral = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequiredUnicodeCharacAstral]
  }
  @scala.inline
  implicit class PickRequiredUnicodeCharacAstralOps[Self <: PickRequiredUnicodeCharacAstral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withAstral(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astral")(js.undefined)
        ret
    }
    @scala.inline
    def withBmp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bmp")(js.undefined)
        ret
    }
    @scala.inline
    def withInverseOf(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverseOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBmpLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBmpLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBmpLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBmpLast")(js.undefined)
        ret
    }
  }
  
}

