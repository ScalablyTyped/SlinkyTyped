package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Undelete extends js.Object {
  var add: scala.Double = js.native
  var delete: scala.Double = js.native
  var undelete: scala.Double = js.native
  var update: scala.Double = js.native
}

object Undelete {
  @scala.inline
  def apply(add: scala.Double, delete: scala.Double, undelete: scala.Double, update: scala.Double): Undelete = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], undelete = undelete.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Undelete]
  }
  @scala.inline
  implicit class UndeleteOps[Self <: Undelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndelete(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

