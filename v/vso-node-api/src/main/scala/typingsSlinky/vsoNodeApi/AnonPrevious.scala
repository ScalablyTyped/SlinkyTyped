package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrevious extends js.Object {
  var none: Double = js.native
  var previous: Double = js.native
  var useRename: Double = js.native
}

object AnonPrevious {
  @scala.inline
  def apply(none: Double, previous: Double, useRename: Double): AnonPrevious = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevious]
  }
  @scala.inline
  implicit class AnonPreviousOps[Self <: AnonPrevious] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRename(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

