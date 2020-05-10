package typingsSlinky.storybookReadme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMd extends js.Object {
  var md: String = js.native
}

object AnonMd {
  @scala.inline
  def apply(md: String): AnonMd = {
    val __obj = js.Dynamic.literal(md = md.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMd]
  }
  @scala.inline
  implicit class AnonMdOps[Self <: AnonMd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

