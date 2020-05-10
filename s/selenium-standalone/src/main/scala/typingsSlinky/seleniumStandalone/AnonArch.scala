package typingsSlinky.seleniumStandalone

import typingsSlinky.seleniumStandalone.seleniumStandaloneStrings.ia32
import typingsSlinky.seleniumStandalone.seleniumStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArch extends js.Object {
  var arch: String | ia32 | x64 = js.native
  var baseURL: String = js.native
  var version: js.UndefOr[String] = js.native
}

object AnonArch {
  @scala.inline
  def apply(arch: String | ia32 | x64, baseURL: String): AnonArch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], baseURL = baseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArch]
  }
  @scala.inline
  implicit class AnonArchOps[Self <: AnonArch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String | ia32 | x64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

