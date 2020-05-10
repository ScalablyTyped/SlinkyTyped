package typingsSlinky.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRulerOptions extends js.Object {
  var balloonAutoPan: js.UndefOr[Boolean] = js.native
}

object IRulerOptions {
  @scala.inline
  def apply(): IRulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRulerOptions]
  }
  @scala.inline
  implicit class IRulerOptionsOps[Self <: IRulerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalloonAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonAutoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBalloonAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balloonAutoPan")(js.undefined)
        ret
    }
  }
  
}

