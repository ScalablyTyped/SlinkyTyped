package typingsSlinky.sharp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  var create: typingsSlinky.sharp.mod.Create = js.native
}

object Create {
  @scala.inline
  def apply(create: typingsSlinky.sharp.mod.Create): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  @scala.inline
  implicit class CreateOps[Self <: Create] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: typingsSlinky.sharp.mod.Create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

