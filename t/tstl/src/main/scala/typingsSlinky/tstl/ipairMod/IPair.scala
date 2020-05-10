package typingsSlinky.tstl.ipairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPair[First, Second] extends js.Object {
  /**
    * The first element.
    */
  var first: First = js.native
  /**
    * The second element.
    */
  var second: Second = js.native
}

object IPair {
  @scala.inline
  def apply[First, Second](first: First, second: Second): IPair[First, Second] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPair[First, Second]]
  }
  @scala.inline
  implicit class IPairOps[Self[first, second] <: IPair[first, second], First, Second] (val x: Self[First, Second]) extends AnyVal {
    @scala.inline
    def duplicate: Self[First, Second] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[First, Second]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[First, Second]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[First, Second]) with Other]
    @scala.inline
    def withFirst(value: First): Self[First, Second] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: Second): Self[First, Second] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

