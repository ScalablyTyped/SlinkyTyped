package typingsSlinky.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelimiter extends js.Object {
  var delimiter: js.RegExp = js.native
  var dots: js.RegExp = js.native
  var hex: js.RegExp = js.native
  var hyphen: js.RegExp = js.native
  var isBlank: js.RegExp = js.native
  var isCss: js.RegExp = js.native
  var isHex: js.RegExp = js.native
  var isImage: js.RegExp = js.native
  var isNumber: js.RegExp = js.native
  var isPathLetter: js.RegExp = js.native
  var isPercent: js.RegExp = js.native
  var isRgb: js.RegExp = js.native
  var numberAndUnit: js.RegExp = js.native
  var pathLetters: js.RegExp = js.native
  var reference: js.RegExp = js.native
  var rgb: js.RegExp = js.native
  var transforms: js.RegExp = js.native
  var whitespace: js.RegExp = js.native
}

object AnonDelimiter {
  @scala.inline
  def apply(
    delimiter: js.RegExp,
    dots: js.RegExp,
    hex: js.RegExp,
    hyphen: js.RegExp,
    isBlank: js.RegExp,
    isCss: js.RegExp,
    isHex: js.RegExp,
    isImage: js.RegExp,
    isNumber: js.RegExp,
    isPathLetter: js.RegExp,
    isPercent: js.RegExp,
    isRgb: js.RegExp,
    numberAndUnit: js.RegExp,
    pathLetters: js.RegExp,
    reference: js.RegExp,
    rgb: js.RegExp,
    transforms: js.RegExp,
    whitespace: js.RegExp
  ): AnonDelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hyphen = hyphen.asInstanceOf[js.Any], isBlank = isBlank.asInstanceOf[js.Any], isCss = isCss.asInstanceOf[js.Any], isHex = isHex.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], isNumber = isNumber.asInstanceOf[js.Any], isPathLetter = isPathLetter.asInstanceOf[js.Any], isPercent = isPercent.asInstanceOf[js.Any], isRgb = isRgb.asInstanceOf[js.Any], numberAndUnit = numberAndUnit.asInstanceOf[js.Any], pathLetters = pathLetters.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelimiter]
  }
  @scala.inline
  implicit class AnonDelimiterOps[Self <: AnonDelimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphen(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlank(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCss(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImage(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNumber(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPathLetter(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPathLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPercent(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRgb(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberAndUnit(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberAndUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathLetters(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRgb(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransforms(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitespace(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

