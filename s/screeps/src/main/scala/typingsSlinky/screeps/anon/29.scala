package typingsSlinky.screeps.anon

import typingsSlinky.screeps.screepsStrings.XLHO2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `29` extends js.Object {
  var X: XLHO2 = js.native
}

object `29` {
  @scala.inline
  def apply(X: XLHO2): `29` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`29`]
  }
  @scala.inline
  implicit class `29Ops`[Self <: `29`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: XLHO2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

