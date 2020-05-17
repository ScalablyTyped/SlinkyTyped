package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowed extends js.Object {
  var allowed: Boolean = js.native
}

object Allowed {
  @scala.inline
  def apply(allowed: Boolean): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  @scala.inline
  implicit class AllowedOps[Self <: Allowed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

