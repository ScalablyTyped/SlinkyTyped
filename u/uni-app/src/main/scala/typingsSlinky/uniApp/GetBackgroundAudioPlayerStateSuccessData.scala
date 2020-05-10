package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundAudioPlayerStateSuccessData extends js.Object {
  /**
    * 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回
    */
  var currentPosition: js.UndefOr[Double] = js.native
  /**
    * 歌曲数据链接，只有在当前有音乐播放时返回
    */
  var dataUrl: js.UndefOr[String] = js.native
  /**
    * 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回
    */
  var downloadPercent: js.UndefOr[Double] = js.native
  /**
    * 选定音频的长度（单位：s），只有在当前有音乐播放时返回
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 播放状态（2：没有音乐在播放，1：播放中，0：暂停中）
    */
  var status: js.UndefOr[Double] = js.native
}

object GetBackgroundAudioPlayerStateSuccessData {
  @scala.inline
  def apply(): GetBackgroundAudioPlayerStateSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessData]
  }
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateSuccessDataOps[Self <: GetBackgroundAudioPlayerStateSuccessData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDataUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

