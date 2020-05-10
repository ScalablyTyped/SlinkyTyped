package typingsSlinky.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of timeline markers supported by the MediaPlayer.
  **/
@js.native
trait MarkerType extends js.Object {
  var advertisement: String = js.native
  var chapter: String = js.native
  var custom: String = js.native
}

object MarkerType {
  @scala.inline
  def apply(advertisement: String, chapter: String, custom: String): MarkerType = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], chapter = chapter.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerType]
  }
  @scala.inline
  implicit class MarkerTypeOps[Self <: MarkerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvertisement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertisement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChapter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

