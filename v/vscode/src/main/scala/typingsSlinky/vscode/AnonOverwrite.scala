package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOverwrite extends js.Object {
  var overwrite: Boolean = js.native
}

object AnonOverwrite {
  @scala.inline
  def apply(overwrite: Boolean): AnonOverwrite = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverwrite]
  }
  @scala.inline
  implicit class AnonOverwriteOps[Self <: AnonOverwrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

