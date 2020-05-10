package typingsSlinky.serveFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAge extends js.Object {
  /**
    * The cache-control max-age directive in ms, defaulting to 1 day. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[Double] = js.native
}

object AnonMaxAge {
  @scala.inline
  def apply(): AnonMaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAge]
  }
  @scala.inline
  implicit class AnonMaxAgeOps[Self <: AnonMaxAge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
  }
  
}

