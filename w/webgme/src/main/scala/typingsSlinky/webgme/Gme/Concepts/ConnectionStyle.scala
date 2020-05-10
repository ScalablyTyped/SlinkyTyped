package typingsSlinky.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionStyle extends js.Object {
  var endArrow: String = js.native
  var startArrow: String = js.native
}

object ConnectionStyle {
  @scala.inline
  def apply(endArrow: String, startArrow: String): ConnectionStyle = {
    val __obj = js.Dynamic.literal(endArrow = endArrow.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStyle]
  }
  @scala.inline
  implicit class ConnectionStyleOps[Self <: ConnectionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

