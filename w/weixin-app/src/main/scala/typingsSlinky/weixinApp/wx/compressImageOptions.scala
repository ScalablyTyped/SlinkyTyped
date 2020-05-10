package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait compressImageOptions
  extends BaseOptions[js.Any, js.Any] {
   // 图片路径，图片的路径，可以是相对路径、临时文件路径、存储文件路径
  var quality: js.UndefOr[Double] = js.native
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var src: String = js.native
   // 默认值为80,压缩质量，范围0～100，数值越小，质量越低，压缩率越高（仅对jpg有效）。
  @JSName("success")
  def success_McompressImageOptions(tempFilePath: String): Unit = js.native
}

object compressImageOptions {
  @scala.inline
  def apply(src: String, success: String => Unit): compressImageOptions = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[compressImageOptions]
  }
  @scala.inline
  implicit class compressImageOptionsOps[Self <: compressImageOptions] (val x: Self) extends AnyVal {
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
    def withSuccess(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
  }
  
}

