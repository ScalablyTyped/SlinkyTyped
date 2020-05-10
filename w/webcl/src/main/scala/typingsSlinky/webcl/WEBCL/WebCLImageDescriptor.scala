package typingsSlinky.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.4.1
@js.native
trait WebCLImageDescriptor extends js.Object {
  var channelOrder: ChannelOrder = js.native
  var channelType: ChannelType = js.native
  var height: Double = js.native
  var rowPitch: Double = js.native
  var width: Double = js.native
}

object WebCLImageDescriptor {
  @scala.inline
  def apply(
    channelOrder: ChannelOrder,
    channelType: ChannelType,
    height: Double,
    rowPitch: Double,
    width: Double
  ): WebCLImageDescriptor = {
    val __obj = js.Dynamic.literal(channelOrder = channelOrder.asInstanceOf[js.Any], channelType = channelType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowPitch = rowPitch.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCLImageDescriptor]
  }
  @scala.inline
  implicit class WebCLImageDescriptorOps[Self <: WebCLImageDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelOrder(value: ChannelOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannelType(value: ChannelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

