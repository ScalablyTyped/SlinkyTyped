package typingsSlinky.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Absolute extends js.Object {
  var absolute: Boolean = js.native
}

object Absolute {
  @scala.inline
  def apply(absolute: Boolean): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  @scala.inline
  implicit class AbsoluteOps[Self <: Absolute] (val x: Self) extends AnyVal {
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

