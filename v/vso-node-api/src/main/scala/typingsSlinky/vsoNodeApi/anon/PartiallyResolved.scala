package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartiallyResolved extends js.Object {
  var partiallyResolved: scala.Double = js.native
  var resolved: scala.Double = js.native
  var unresolved: scala.Double = js.native
}

object PartiallyResolved {
  @scala.inline
  def apply(partiallyResolved: scala.Double, resolved: scala.Double, unresolved: scala.Double): PartiallyResolved = {
    val __obj = js.Dynamic.literal(partiallyResolved = partiallyResolved.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartiallyResolved]
  }
  @scala.inline
  implicit class PartiallyResolvedOps[Self <: PartiallyResolved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPartiallyResolved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyResolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnresolved(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

