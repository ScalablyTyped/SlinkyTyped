package typingsSlinky.zingchart.mod

import typingsSlinky.zingchart.AnonCalloutoffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait refresh extends js.Object {
  /**
    * Enabling true will allow dynamic value range of the scale pertaining to the values. false (default) | true
    */
  var `adjust-scale`: js.UndefOr[Boolean] = js.native
  var curtain: js.UndefOr[AnonCalloutoffset] = js.native
  /**
    * Sets the timeout between two refresh operations. If value is smaller than 50, seconds are assumed, otherwise milliseconds are assu
    * med. 5 | 10 | ...
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Sets the max amount of nodes visible in the graph. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.native
  /**
    * The number of nodes before starting the feed from 0 again. 500 | 1000 | ...
    */
  var `reset-timeout`: js.UndefOr[Double] = js.native
  /**
    * Defines the specific type of feed. http | js | websockets
    */
  var transport: js.UndefOr[String] = js.native
  /**
    * Sets the type of data refresh, full being the only option at loader's level. "full"
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The url path for the feed. feed() | https://myPhpFunction.php | wss://websockets.zingchart.com:8889
    */
  var url: js.UndefOr[String] = js.native
}

object refresh {
  @scala.inline
  def apply(): refresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[refresh]
  }
  @scala.inline
  implicit class refreshOps[Self <: refresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAdjust-scale`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust-scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAdjust-scale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust-scale")(js.undefined)
        ret
    }
    @scala.inline
    def withCurtain(value: AnonCalloutoffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curtain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurtain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curtain")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-ticks`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-ticks`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-ticks")(js.undefined)
        ret
    }
    @scala.inline
    def `withReset-timeout`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset-timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutReset-timeout`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset-timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

