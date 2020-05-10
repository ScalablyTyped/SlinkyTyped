package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlaybackRateChangeRequestedEventArgs extends js.Object {
  var rate: Double = js.native
}

object IPlaybackRateChangeRequestedEventArgs {
  @scala.inline
  def apply(rate: Double): IPlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaybackRateChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class IPlaybackRateChangeRequestedEventArgsOps[Self <: IPlaybackRateChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

