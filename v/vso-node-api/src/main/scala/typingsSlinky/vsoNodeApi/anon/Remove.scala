package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remove extends js.Object {
  var create: scala.Double = js.native
  var remove: scala.Double = js.native
}

object Remove {
  @scala.inline
  def apply(create: scala.Double, remove: scala.Double): Remove = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remove]
  }
  @scala.inline
  implicit class RemoveOps[Self <: Remove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

