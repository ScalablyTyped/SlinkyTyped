package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildFirst extends js.Object {
  var childFirst: scala.Double = js.native
  var parentFirst: scala.Double = js.native
}

object ChildFirst {
  @scala.inline
  def apply(childFirst: scala.Double, parentFirst: scala.Double): ChildFirst = {
    val __obj = js.Dynamic.literal(childFirst = childFirst.asInstanceOf[js.Any], parentFirst = parentFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildFirst]
  }
  @scala.inline
  implicit class ChildFirstOps[Self <: ChildFirst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildFirst(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFirst(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentFirst")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

