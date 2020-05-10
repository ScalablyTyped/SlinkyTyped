package typingsSlinky.streamThrottle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleOptions extends js.Object {
  val chunksize: js.UndefOr[Double] = js.native
  val rate: Double = js.native
}

object ThrottleOptions {
  @scala.inline
  def apply(rate: Double): ThrottleOptions = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleOptions]
  }
  @scala.inline
  implicit class ThrottleOptionsOps[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withChunksize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunksize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunksize")(js.undefined)
        ret
    }
  }
  
}

