package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdAscending extends js.Object {
  var idAscending: Double = js.native
  var idDescending: Double = js.native
  var nameAscending: Double = js.native
  var nameDescending: Double = js.native
}

object AnonIdAscending {
  @scala.inline
  def apply(idAscending: Double, idDescending: Double, nameAscending: Double, nameDescending: Double): AnonIdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdAscending]
  }
  @scala.inline
  implicit class AnonIdAscendingOps[Self <: AnonIdAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameAscending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameDescending(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameDescending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

