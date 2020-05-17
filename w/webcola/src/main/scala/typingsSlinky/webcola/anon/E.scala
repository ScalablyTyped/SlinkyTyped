package typingsSlinky.webcola.anon

import typingsSlinky.webcola.geomMod.VisibilityEdge
import typingsSlinky.webcola.geomMod.VisibilityVertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait E extends js.Object {
  var E: js.Array[VisibilityEdge] = js.native
  var V: js.Array[VisibilityVertex] = js.native
}

object E {
  @scala.inline
  def apply(E: js.Array[VisibilityEdge], V: js.Array[VisibilityVertex]): E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
  @scala.inline
  implicit class EOps[Self <: E] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withE(value: js.Array[VisibilityEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("E")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: js.Array[VisibilityVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("V")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

