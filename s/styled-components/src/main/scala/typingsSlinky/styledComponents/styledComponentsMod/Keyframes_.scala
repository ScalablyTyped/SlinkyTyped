package typingsSlinky.styledComponents.styledComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyframes_ extends InterpolationValue {
  def getName(): String = js.native
}

object Keyframes_ {
  @scala.inline
  def apply(getName: () => String): Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[Keyframes_]
  }
  @scala.inline
  implicit class Keyframes_Ops[Self <: Keyframes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

