package typingsSlinky.webtorrent.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var dht: js.UndefOr[Boolean | js.Object] = js.native
  var maxConns: js.UndefOr[Double] = js.native
  var nodeId: js.UndefOr[String | Buffer] = js.native
  var peerId: js.UndefOr[String | Buffer] = js.native
  var tracker: js.UndefOr[Boolean | js.Object] = js.native
  var webSeeds: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDht(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dht")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDht: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dht")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConns")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeId(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerId(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerId")(js.undefined)
        ret
    }
    @scala.inline
    def withTracker(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSeeds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSeeds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSeeds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSeeds")(js.undefined)
        ret
    }
  }
  
}

