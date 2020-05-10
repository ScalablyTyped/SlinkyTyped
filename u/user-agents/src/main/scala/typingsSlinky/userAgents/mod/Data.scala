package typingsSlinky.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /**
    *  The value of navigator.appName
    */
  var appName: String = js.native
  /**
    *  The value of navigator.connection
    */
  var connection: js.UndefOr[Connection] = js.native
  /**
    *  The value of navigator.cpuClass
    */
  var cpuClass: js.UndefOr[String] = js.native
  /**
    * One of desktop, mobile, or tablet depending on the type of device
    */
  var deviceCategory: js.UndefOr[String] = js.native
  /**
    *  The value of navigator.oscpu
    */
  var oscpu: js.UndefOr[String] = js.native
  /**
    * The value of navigator.platform
    */
  var platform: String = js.native
  /**
    * The value of navigator.plugins.length
    */
  var pluginsLength: Double = js.native
  /**
    *  The value of screen.height
    */
  var screenHeight: Double = js.native
  /**
    * The value of screen.width
    */
  var screenWidth: Double = js.native
  /**
    * The value of navigator.userAgent
    */
  var userAgent: String = js.native
  /**
    * The value of navigator.vendor
    */
  var vendor: String = js.native
  /**
    * The value of window.innerHeight
    */
  var viewportHeight: Double = js.native
  /**
    * The value of window.innerWidth
    */
  var viewportWidth: Double = js.native
}

object Data {
  @scala.inline
  def apply(
    appName: String,
    platform: String,
    pluginsLength: Double,
    screenHeight: Double,
    screenWidth: Double,
    userAgent: String,
    vendor: String,
    viewportHeight: Double,
    viewportWidth: Double
  ): Data = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pluginsLength = pluginsLength.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginsLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withCpuClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withOscpu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oscpu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOscpu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oscpu")(js.undefined)
        ret
    }
  }
  
}

