package typingsSlinky.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ttl extends js.Object {
  var ttl: Double = js.native
}

object Ttl {
  @scala.inline
  def apply(ttl: Double): Ttl = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ttl]
  }
  @scala.inline
  implicit class TtlOps[Self <: Ttl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

