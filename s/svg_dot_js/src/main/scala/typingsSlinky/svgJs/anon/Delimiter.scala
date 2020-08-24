package typingsSlinky.svgJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
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

object Delimiter {
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
  ): Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hyphen = hyphen.asInstanceOf[js.Any], isBlank = isBlank.asInstanceOf[js.Any], isCss = isCss.asInstanceOf[js.Any], isHex = isHex.asInstanceOf[js.Any], isImage = isImage.asInstanceOf[js.Any], isNumber = isNumber.asInstanceOf[js.Any], isPathLetter = isPathLetter.asInstanceOf[js.Any], isPercent = isPercent.asInstanceOf[js.Any], isRgb = isRgb.asInstanceOf[js.Any], numberAndUnit = numberAndUnit.asInstanceOf[js.Any], pathLetters = pathLetters.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelimiter(value: js.RegExp): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: js.RegExp): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def setHex(value: js.RegExp): Self = this.set("hex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyphen(value: js.RegExp): Self = this.set("hyphen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlank(value: js.RegExp): Self = this.set("isBlank", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCss(value: js.RegExp): Self = this.set("isCss", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHex(value: js.RegExp): Self = this.set("isHex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsImage(value: js.RegExp): Self = this.set("isImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNumber(value: js.RegExp): Self = this.set("isNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPathLetter(value: js.RegExp): Self = this.set("isPathLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPercent(value: js.RegExp): Self = this.set("isPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRgb(value: js.RegExp): Self = this.set("isRgb", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberAndUnit(value: js.RegExp): Self = this.set("numberAndUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathLetters(value: js.RegExp): Self = this.set("pathLetters", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: js.RegExp): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setRgb(value: js.RegExp): Self = this.set("rgb", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransforms(value: js.RegExp): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhitespace(value: js.RegExp): Self = this.set("whitespace", value.asInstanceOf[js.Any])
  }
  
}

