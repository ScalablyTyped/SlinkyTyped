package typingsSlinky.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExt extends js.Object {
  var ext: TwitchExt = js.native
}

object AnonExt {
  @scala.inline
  def apply(ext: TwitchExt): AnonExt = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExt]
  }
  @scala.inline
  implicit class AnonExtOps[Self <: AnonExt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: TwitchExt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

