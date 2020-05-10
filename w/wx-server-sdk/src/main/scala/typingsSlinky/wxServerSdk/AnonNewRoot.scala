package typingsSlinky.wxServerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewRoot extends js.Object {
  var newRoot: js.Any = js.native
}

object AnonNewRoot {
  @scala.inline
  def apply(newRoot: js.Any): AnonNewRoot = {
    val __obj = js.Dynamic.literal(newRoot = newRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewRoot]
  }
  @scala.inline
  implicit class AnonNewRootOps[Self <: AnonNewRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newRoot")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

