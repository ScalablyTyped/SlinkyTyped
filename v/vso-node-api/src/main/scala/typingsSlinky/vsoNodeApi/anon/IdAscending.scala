package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdAscending extends js.Object {
  var idAscending: scala.Double = js.native
  var idDescending: scala.Double = js.native
  var nameAscending: scala.Double = js.native
  var nameDescending: scala.Double = js.native
}

object IdAscending {
  @scala.inline
  def apply(
    idAscending: scala.Double,
    idDescending: scala.Double,
    nameAscending: scala.Double,
    nameDescending: scala.Double
  ): IdAscending = {
    val __obj = js.Dynamic.literal(idAscending = idAscending.asInstanceOf[js.Any], idDescending = idDescending.asInstanceOf[js.Any], nameAscending = nameAscending.asInstanceOf[js.Any], nameDescending = nameDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAscending]
  }
  @scala.inline
  implicit class IdAscendingOps[Self <: IdAscending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDescending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameAscending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameDescending(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameDescending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

