package typingsSlinky.webpackBlocksDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchOptions extends js.Object {
  var aggregateTimeout: js.UndefOr[Double] = js.native
  var ignored: js.UndefOr[js.RegExp] = js.native
  var poll: js.UndefOr[Boolean | Double] = js.native
}

object WatchOptions {
  @scala.inline
  def apply(): WatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchOptions]
  }
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregateTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnored(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignored")(js.undefined)
        ret
    }
    @scala.inline
    def withPoll(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll")(js.undefined)
        ret
    }
  }
  
}

