package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildFirst extends js.Object {
  var childFirst: Double = js.native
  var parentFirst: Double = js.native
}

object AnonChildFirst {
  @scala.inline
  def apply(childFirst: Double, parentFirst: Double): AnonChildFirst = {
    val __obj = js.Dynamic.literal(childFirst = childFirst.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildFirst]
  }
  @scala.inline
  implicit class AnonChildFirstOps[Self <: AnonChildFirst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFirst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

