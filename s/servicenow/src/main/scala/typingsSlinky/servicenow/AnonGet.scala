package typingsSlinky.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def get(index: Double): String = js.native
  def size(): Double = js.native
}

object AnonGet {
  @scala.inline
  def apply(get: Double => String, size: () => Double): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[AnonGet]
  }
  @scala.inline
  implicit class AnonGetOps[Self <: AnonGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

