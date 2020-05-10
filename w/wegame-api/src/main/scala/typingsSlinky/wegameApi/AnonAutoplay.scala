package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wegameApiStrings.contain
import typingsSlinky.wegameApi.wegameApiStrings.cover
import typingsSlinky.wegameApi.wegameApiStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoplay extends js.Object {
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * 视频是否显示控件，默认true
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * 默认值150
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: js.UndefOr[Double] = js.native
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[Double] = js.native
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: js.UndefOr[Boolean] = js.native
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: js.UndefOr[contain | cover | fill] = js.native
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: js.UndefOr[Double] = js.native
  /**
    * 视频的封面
    */
  var poster: js.UndefOr[String] = js.native
  /**
    * 视频的资源地址
    */
  var src: String = js.native
  /**
    * 视频的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 视频的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 视频的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.native
}

object AnonAutoplay {
  @scala.inline
  def apply(src: String): AnonAutoplay = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoplay]
  }
  @scala.inline
  implicit class AnonAutoplayOps[Self <: AnonAutoplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withInitialTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectFit(value: contain | cover | fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectFit")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

