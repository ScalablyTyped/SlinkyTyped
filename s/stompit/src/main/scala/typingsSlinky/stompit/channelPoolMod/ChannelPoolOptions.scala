package typingsSlinky.stompit.channelPoolMod

import typingsSlinky.stompit.channelMod.ChannelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPoolOptions extends js.Object {
  var channelOptions: js.UndefOr[ChannelOptions] = js.native
  var freeExcessTimeout: js.UndefOr[Double] = js.native
  var maxChannels: js.UndefOr[Double] = js.native
  var minChannels: js.UndefOr[Double] = js.native
  var minFreeChannels: js.UndefOr[Double] = js.native
  var requestChannelTimeout: js.UndefOr[Double] = js.native
}

object ChannelPoolOptions {
  @scala.inline
  def apply(): ChannelPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelPoolOptions]
  }
  @scala.inline
  implicit class ChannelPoolOptionsOps[Self <: ChannelPoolOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelOptions(value: ChannelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeExcessTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeExcessTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeExcessTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeExcessTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withMinChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFreeChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFreeChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFreeChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFreeChannels")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestChannelTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChannelTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestChannelTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChannelTimeout")(js.undefined)
        ret
    }
  }
  
}

