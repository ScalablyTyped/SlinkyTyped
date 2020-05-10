package typingsSlinky.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOneWayOptions extends js.Object {
  var emptyBody: js.UndefOr[Boolean] = js.native
  var responseCode: js.UndefOr[Double] = js.native
}

object IOneWayOptions {
  @scala.inline
  def apply(): IOneWayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneWayOptions]
  }
  @scala.inline
  implicit class IOneWayOptionsOps[Self <: IOneWayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyBody")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
  }
  
}

