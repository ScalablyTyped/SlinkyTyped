package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemableDecorationRenderOptions extends js.Object {
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text.
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
  		 * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
  		 * Alternatively a color from the color registry can be [referenced](#ThemeColor).
  		 */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text.
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var border: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderRadius: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderSpacing: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderStyle: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderWidth: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var cursor: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var fontStyle: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var fontWeight: js.UndefOr[String] = js.native
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the gutter.
  		 */
  var gutterIconPath: js.UndefOr[String | Uri] = js.native
  /**
  		 * Specifies the size of the gutter icon.
  		 * Available values are 'auto', 'contain', 'cover' and any percentage value.
  		 * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
  		 */
  var gutterIconSize: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var letterSpacing: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var opacity: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var outline: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineStyle: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineWidth: js.UndefOr[String] = js.native
  /**
  		 * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
  		 */
  var overviewRulerColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var textDecoration: js.UndefOr[String] = js.native
}

object ThemableDecorationRenderOptions {
  @scala.inline
  def apply(): ThemableDecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
  @scala.inline
  implicit class ThemableDecorationRenderOptionsOps[Self <: ThemableDecorationRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: ThemableDecorationAttachmentRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: ThemableDecorationAttachmentRenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderSpacing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterIconPath(value: String | Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterIconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterIconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGutterIconSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterIconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutterIconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutterIconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLetterSpacing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLetterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOverviewRulerColor(value: String | ThemeColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverviewRulerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDecoration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(js.undefined)
        ret
    }
  }
  
}

