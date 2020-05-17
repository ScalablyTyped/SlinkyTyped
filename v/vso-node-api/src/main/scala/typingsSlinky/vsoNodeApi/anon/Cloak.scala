package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloak extends js.Object {
  var cloak: scala.Double = js.native
  var map: scala.Double = js.native
}

object Cloak {
  @scala.inline
  def apply(cloak: scala.Double, map: scala.Double): Cloak = {
    val __obj = js.Dynamic.literal(cloak = cloak.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloak]
  }
  @scala.inline
  implicit class CloakOps[Self <: Cloak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloak(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

