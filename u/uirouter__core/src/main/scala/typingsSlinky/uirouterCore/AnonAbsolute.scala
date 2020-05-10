package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbsolute extends js.Object {
  var absolute: Boolean = js.native
}

object AnonAbsolute {
  @scala.inline
  def apply(absolute: Boolean): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
  @scala.inline
  implicit class AnonAbsoluteOps[Self <: AnonAbsolute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

