package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturningOptions extends js.Object {
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] = js.native
}

object ReturningOptions {
  @scala.inline
  def apply(): ReturningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturningOptions]
  }
  @scala.inline
  implicit class ReturningOptionsOps[Self <: ReturningOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReturning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returning")(js.undefined)
        ret
    }
  }
  
}

