package typingsSlinky.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOs extends js.Object {
  var os: String = js.native
  var os_ver: String = js.native
  var platform: String = js.native
  var platform_ver: String = js.native
}

object AnonOs {
  @scala.inline
  def apply(os: String, os_ver: String, platform: String, platform_ver: String): AnonOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any], os_ver = os_ver.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platform_ver = platform_ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOs]
  }
  @scala.inline
  implicit class AnonOsOps[Self <: AnonOs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs_ver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os_ver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform_ver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform_ver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

