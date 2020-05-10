package typingsSlinky.sipJs.libSessionMod.Session

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DtmfOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var interToneGap: js.UndefOr[Double] = js.native
}

object DtmfOptions {
  @scala.inline
  def apply(): DtmfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DtmfOptions]
  }
  @scala.inline
  implicit class DtmfOptionsOps[Self <: DtmfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInterToneGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interToneGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterToneGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interToneGap")(js.undefined)
        ret
    }
  }
  
}

