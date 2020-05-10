package typingsSlinky.simplemde.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortcutsArray
  extends /* action */ StringDictionary[js.UndefOr[String]] {
  var cleanBlock: js.UndefOr[String] = js.native
  var drawImage: js.UndefOr[String] = js.native
  var drawLink: js.UndefOr[String] = js.native
  var toggleBlockquote: js.UndefOr[String] = js.native
  var toggleBold: js.UndefOr[String] = js.native
  var toggleCodeBlock: js.UndefOr[String] = js.native
  var toggleFullScreen: js.UndefOr[String] = js.native
  var toggleHeadingBigger: js.UndefOr[String] = js.native
  var toggleHeadingSmaller: js.UndefOr[String] = js.native
  var toggleItalic: js.UndefOr[String] = js.native
  var toggleOrderedList: js.UndefOr[String] = js.native
  var togglePreview: js.UndefOr[String] = js.native
  var toggleSideBySide: js.UndefOr[String] = js.native
  var toggleUnorderedList: js.UndefOr[String] = js.native
}

object ShortcutsArray {
  @scala.inline
  def apply(): ShortcutsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortcutsArray]
  }
  @scala.inline
  implicit class ShortcutsArrayOps[Self <: ShortcutsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawLink")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleBlockquote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBlockquote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleBlockquote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBlockquote")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleBold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleBold")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCodeBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCodeBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleCodeBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCodeBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleFullScreen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleHeadingBigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHeadingBigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleHeadingBigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHeadingBigger")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleHeadingSmaller(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHeadingSmaller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleHeadingSmaller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleHeadingSmaller")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleItalic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleItalic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleItalic")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOrderedList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOrderedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOrderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOrderedList")(js.undefined)
        ret
    }
    @scala.inline
    def withTogglePreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTogglePreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("togglePreview")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleSideBySide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSideBySide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleSideBySide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleSideBySide")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleUnorderedList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleUnorderedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleUnorderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleUnorderedList")(js.undefined)
        ret
    }
  }
  
}

