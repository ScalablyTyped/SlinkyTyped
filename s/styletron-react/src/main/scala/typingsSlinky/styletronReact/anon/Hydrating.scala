package typingsSlinky.styletronReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hydrating extends js.Object {
  var hydrating: Boolean = js.native
}

object Hydrating {
  @scala.inline
  def apply(hydrating: Boolean): Hydrating = {
    val __obj = js.Dynamic.literal(hydrating = hydrating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hydrating]
  }
  @scala.inline
  implicit class HydratingOps[Self <: Hydrating] (val x: Self) extends AnyVal {
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

