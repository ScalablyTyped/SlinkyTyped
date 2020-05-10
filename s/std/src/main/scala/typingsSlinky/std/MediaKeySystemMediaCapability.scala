package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeySystemMediaCapability extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.native
  var robustness: js.UndefOr[java.lang.String] = js.native
}

object MediaKeySystemMediaCapability {
  @scala.inline
  def apply(): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
  @scala.inline
  implicit class MediaKeySystemMediaCapabilityOps[Self <: MediaKeySystemMediaCapability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withRobustness(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robustness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRobustness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robustness")(js.undefined)
        ret
    }
  }
  
}

