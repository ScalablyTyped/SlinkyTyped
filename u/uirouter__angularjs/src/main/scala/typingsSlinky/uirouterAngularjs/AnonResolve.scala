package typingsSlinky.uirouterAngularjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolve extends js.Object {
  def resolve(): js.Any = js.native
}

object AnonResolve {
  @scala.inline
  def apply(resolve: () => js.Any): AnonResolve = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[AnonResolve]
  }
  @scala.inline
  implicit class AnonResolveOps[Self <: AnonResolve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolve(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

