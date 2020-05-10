package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPartiallyResolved extends js.Object {
  var partiallyResolved: Double = js.native
  var resolved: Double = js.native
  var unresolved: Double = js.native
}

object AnonPartiallyResolved {
  @scala.inline
  def apply(partiallyResolved: Double, resolved: Double, unresolved: Double): AnonPartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartiallyResolved]
  }
  @scala.inline
  implicit class AnonPartiallyResolvedOps[Self <: AnonPartiallyResolved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartiallyResolved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnresolved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

