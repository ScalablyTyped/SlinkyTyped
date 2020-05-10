package typingsSlinky.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResult extends js.Object {
  var browser: IBrowser = js.native
  var cpu: ICPU = js.native
  var device: IDevice = js.native
  var engine: IEngine = js.native
  var os: IOS = js.native
  var ua: String = js.native
}

object IResult {
  @scala.inline
  def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: IBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpu(value: ICPU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevice(value: IDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngine(value: IEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: IOS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUa(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ua")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

