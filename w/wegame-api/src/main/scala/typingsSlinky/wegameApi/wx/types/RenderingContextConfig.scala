package typingsSlinky.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingContextConfig extends js.Object {
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[Boolean] = js.native
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[Double] = js.native
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
}

object RenderingContextConfig {
  @scala.inline
  def apply(): RenderingContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingContextConfig]
  }
  @scala.inline
  implicit class RenderingContextConfigOps[Self <: RenderingContextConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withAntialiasSamples(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasSamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialiasSamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialiasSamples")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDrawingBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDrawingBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(js.undefined)
        ret
    }
  }
  
}

