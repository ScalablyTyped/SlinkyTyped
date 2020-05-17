package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Previous extends js.Object {
  var none: scala.Double = js.native
  var previous: scala.Double = js.native
  var useRename: scala.Double = js.native
}

object Previous {
  @scala.inline
  def apply(none: scala.Double, previous: scala.Double, useRename: scala.Double): Previous = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
  @scala.inline
  implicit class PreviousOps[Self <: Previous] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRename(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

