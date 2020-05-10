package typingsSlinky.useMediaAntdQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMatchMedia extends js.Object {
  var matchMedia: String = js.native
  var maxWidth: Double = js.native
}

object AnonMatchMedia {
  @scala.inline
  def apply(matchMedia: String, maxWidth: Double): AnonMatchMedia = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatchMedia]
  }
  @scala.inline
  implicit class AnonMatchMediaOps[Self <: AnonMatchMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchMedia(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

