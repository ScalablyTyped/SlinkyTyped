package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestInfo extends js.Object {
  var block: String = js.native
  var bodies: Double = js.native
  var browser: String = js.native
  var bwIn: Double = js.native
  var bwOut: Double = js.native
  var connectivity: String = js.native
  var fvonly: Double = js.native
  var ignoreSSL: Double = js.native
  var iq: Double = js.native
  var keepua: Double = js.native
  var label: String = js.native
  var latency: Double = js.native
  var location: String = js.native
  var mobile: Double = js.native
  var netlog: Double = js.native
  var noscript: Double = js.native
  var plr: String = js.native
  var pngss: Double = js.native
  var priority: Double = js.native
  var runs: Double = js.native
  var scripted: Double = js.native
  var standards: Double = js.native
  var tcpdump: Double = js.native
  var timeline: Double = js.native
  var trace: Double = js.native
  var url: String = js.native
  var video: String = js.native
  var web10: Double = js.native
}

object TestInfo {
  @scala.inline
  def apply(
    block: String,
    bodies: Double,
    browser: String,
    bwIn: Double,
    bwOut: Double,
    connectivity: String,
    fvonly: Double,
    ignoreSSL: Double,
    iq: Double,
    keepua: Double,
    label: String,
    latency: Double,
    location: String,
    mobile: Double,
    netlog: Double,
    noscript: Double,
    plr: String,
    pngss: Double,
    priority: Double,
    runs: Double,
    scripted: Double,
    standards: Double,
    tcpdump: Double,
    timeline: Double,
    trace: Double,
    url: String,
    video: String,
    web10: Double
  ): TestInfo = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], bwIn = bwIn.asInstanceOf[js.Any], bwOut = bwOut.asInstanceOf[js.Any], connectivity = connectivity.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], ignoreSSL = ignoreSSL.asInstanceOf[js.Any], iq = iq.asInstanceOf[js.Any], keepua = keepua.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], netlog = netlog.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], plr = plr.asInstanceOf[js.Any], pngss = pngss.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], scripted = scripted.asInstanceOf[js.Any], standards = standards.asInstanceOf[js.Any], tcpdump = tcpdump.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], web10 = web10.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInfo]
  }
  @scala.inline
  implicit class TestInfoOps[Self <: TestInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBwIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bwIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBwOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bwOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFvonly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fvonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreSSL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeepua(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepua")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetlog(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netlog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoscript(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPngss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pngss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScripted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scripted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandards(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcpdump(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpdump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeb10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web10")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

