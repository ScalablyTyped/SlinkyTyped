package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  var create: Boolean = js.native
  var overwrite: Boolean = js.native
}

object AnonCreate {
  @scala.inline
  def apply(create: Boolean, overwrite: Boolean): AnonCreate = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
  @scala.inline
  implicit class AnonCreateOps[Self <: AnonCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

