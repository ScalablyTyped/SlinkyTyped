package typingsSlinky.wxJsSdkDt.wx

import typingsSlinky.wxJsSdkDt.anon.LocalIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageConfig extends js.Object {
  /**
    * 照片数，默认9
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * 可以指定是原图还是压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  /**
    * 可以指定来源是相册还是相机，默认二者都有
    */
  var sourceType: js.UndefOr[js.Array[String]] = js.native
  /**
    * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
    */
  def success(res: LocalIds): Unit = js.native
}

object ChooseImageConfig {
  @scala.inline
  def apply(success: LocalIds => Unit): ChooseImageConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageConfig]
  }
  @scala.inline
  implicit class ChooseImageConfigOps[Self <: ChooseImageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: LocalIds => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
  }
  
}

