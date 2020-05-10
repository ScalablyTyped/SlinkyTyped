package typingsSlinky.stremioAddonSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subtitles resource for the chosen media.
  */
@js.native
trait Subtitle extends js.Object {
  /**
    * Language code for the subtitle, if a valid ISO 639-2 code is not sent, the text of this value will be used instead.
    */
  var lang: String = js.native
  /**
    * Url to the subtitle file.
    */
  var url: String = js.native
}

object Subtitle {
  @scala.inline
  def apply(lang: String, url: String): Subtitle = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtitle]
  }
  @scala.inline
  implicit class SubtitleOps[Self <: Subtitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

