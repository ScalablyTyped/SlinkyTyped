package typingsSlinky.styletronReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHydrating extends js.Object {
  var hydrating: Boolean = js.native
}

object AnonHydrating {
  @scala.inline
  def apply(hydrating: Boolean): AnonHydrating = {
    val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHydrating]
  }
  @scala.inline
  implicit class AnonHydratingOps[Self <: AnonHydrating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHydrating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrating")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

