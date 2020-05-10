package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDoing extends js.Object {
  var doing: Double = js.native
  var done: Double = js.native
  var followed: Double = js.native
}

object AnonDoing {
  @scala.inline
  def apply(doing: Double, done: Double, followed: Double): AnonDoing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoing]
  }
  @scala.inline
  implicit class AnonDoingOps[Self <: AnonDoing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

