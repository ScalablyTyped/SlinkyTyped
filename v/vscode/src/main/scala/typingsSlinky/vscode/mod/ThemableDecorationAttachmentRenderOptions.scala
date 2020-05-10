package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var border: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var borderColor: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
  		 * or a text can be shown, but not both.
  		 */
  var contentIconPath: js.UndefOr[String | Uri] = js.native
  /**
  		 * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
  		 */
  var contentText: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var fontStyle: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var fontWeight: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var height: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var margin: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var textDecoration: js.UndefOr[String] = js.native
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var width: js.UndefOr[String] = js.native
}

object ThemableDecorationAttachmentRenderOptions {
  @scala.inline
  def apply(): ThemableDecorationAttachmentRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationAttachmentRenderOptions]
  }
  @scala.inline
  implicit class ThemableDecorationAttachmentRenderOptionsOps[Self <: ThemableDecorationAttachmentRenderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentIconPath(value: String | Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentIconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withContentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentText")(js.undefined)
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
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
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
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

