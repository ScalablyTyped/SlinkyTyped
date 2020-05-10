package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 封面URL */
  var coverImgUrl: js.UndefOr[String] = js.native
  /** 音乐链接 */
  var dataUrl: String = js.native
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.native
}

object PlayBackgroundAudioOptions {
  @scala.inline
  def apply(dataUrl: String): PlayBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(dataUrl = dataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayBackgroundAudioOptions]
  }
  @scala.inline
  implicit class PlayBackgroundAudioOptionsOps[Self <: PlayBackgroundAudioOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverImgUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImgUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverImgUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImgUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

