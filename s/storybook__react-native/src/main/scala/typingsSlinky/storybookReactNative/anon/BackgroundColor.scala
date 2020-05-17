package typingsSlinky.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var buttonActiveTextColor: String = js.native
  var buttonTextColor: String = js.native
  var headerTextColor: String = js.native
  var labelColor: String = js.native
  var previewBorderColor: String = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    buttonActiveTextColor: String,
    buttonTextColor: String,
    headerTextColor: String,
    labelColor: String,
    previewBorderColor: String
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], buttonActiveTextColor = buttonActiveTextColor.asInstanceOf[js.Any], buttonTextColor = buttonTextColor.asInstanceOf[js.Any], headerTextColor = headerTextColor.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], previewBorderColor = previewBorderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonActiveTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonActiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

