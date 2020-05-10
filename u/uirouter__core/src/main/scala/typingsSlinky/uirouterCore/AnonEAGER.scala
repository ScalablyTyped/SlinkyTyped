package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEAGER extends js.Object {
  var EAGER: String = js.native
  var LAZY: String = js.native
}

object AnonEAGER {
  @scala.inline
  def apply(EAGER: String, LAZY: String): AnonEAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEAGER]
  }
  @scala.inline
  implicit class AnonEAGEROps[Self <: AnonEAGER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEAGER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAGER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAZY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAZY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

