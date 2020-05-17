package typingsSlinky.venn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Setid extends js.Object {
  var setid: String = js.native
}

object Setid {
  @scala.inline
  def apply(setid: String): Setid = {
    val __obj = js.Dynamic.literal(setid = setid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setid]
  }
  @scala.inline
  implicit class SetidOps[Self <: Setid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

