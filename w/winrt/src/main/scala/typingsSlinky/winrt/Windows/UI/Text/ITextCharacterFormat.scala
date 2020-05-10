package typingsSlinky.winrt.Windows.UI.Text

import typingsSlinky.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextCharacterFormat extends js.Object {
  var allCaps: FormatEffect = js.native
  var backgroundColor: Color = js.native
  var bold: FormatEffect = js.native
  var fontStretch: FontStretch = js.native
  var fontStyle: FontStyle = js.native
  var foregroundColor: Color = js.native
  var hidden: FormatEffect = js.native
  var italic: FormatEffect = js.native
  var kerning: Double = js.native
  var languageTag: String = js.native
  var linkType: LinkType = js.native
  var name: String = js.native
  var outline: FormatEffect = js.native
  var position: Double = js.native
  var protectedText: FormatEffect = js.native
  var size: Double = js.native
  var smallCaps: FormatEffect = js.native
  var spacing: Double = js.native
  var strikethrough: FormatEffect = js.native
  var subscript: FormatEffect = js.native
  var superscript: FormatEffect = js.native
  var textScript: TextScript = js.native
  var underline: UnderlineType = js.native
  var weight: Double = js.native
  def getClone(): ITextCharacterFormat = js.native
  def isEqual(format: ITextCharacterFormat): Boolean = js.native
  def setClone(value: ITextCharacterFormat): Unit = js.native
}

object ITextCharacterFormat {
  @scala.inline
  def apply(
    allCaps: FormatEffect,
    backgroundColor: Color,
    bold: FormatEffect,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    foregroundColor: Color,
    getClone: () => ITextCharacterFormat,
    hidden: FormatEffect,
    isEqual: ITextCharacterFormat => Boolean,
    italic: FormatEffect,
    kerning: Double,
    languageTag: String,
    linkType: LinkType,
    name: String,
    outline: FormatEffect,
    position: Double,
    protectedText: FormatEffect,
    setClone: ITextCharacterFormat => Unit,
    size: Double,
    smallCaps: FormatEffect,
    spacing: Double,
    strikethrough: FormatEffect,
    subscript: FormatEffect,
    superscript: FormatEffect,
    textScript: TextScript,
    underline: UnderlineType,
    weight: Double
  ): ITextCharacterFormat = {
    val __obj = js.Dynamic.literal(allCaps = allCaps.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], getClone = js.Any.fromFunction0(getClone), hidden = hidden.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), italic = italic.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], protectedText = protectedText.asInstanceOf[js.Any], setClone = js.Any.fromFunction1(setClone), size = size.asInstanceOf[js.Any], smallCaps = smallCaps.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], subscript = subscript.asInstanceOf[js.Any], superscript = superscript.asInstanceOf[js.Any], textScript = textScript.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextCharacterFormat]
  }
  @scala.inline
  implicit class ITextCharacterFormatOps[Self <: ITextCharacterFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllCaps(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBold(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStretch(value: FontStretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStretch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForegroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClone(value: () => ITextCharacterFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHidden(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEqual(value: ITextCharacterFormat => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItalic(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKerning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkType(value: LinkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutline(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedText(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetClone(value: ITextCharacterFormat => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallCaps(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrikethrough(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscript(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuperscript(value: FormatEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextScript(value: TextScript): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderline(value: UnderlineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

