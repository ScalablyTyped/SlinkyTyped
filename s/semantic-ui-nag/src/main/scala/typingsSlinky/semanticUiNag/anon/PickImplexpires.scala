package typingsSlinky.semanticUiNag.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'expires'> */
@js.native
trait PickImplexpires extends js.Object {
  var expires: Double = js.native
}

object PickImplexpires {
  @scala.inline
  def apply(expires: Double): PickImplexpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexpires]
  }
  @scala.inline
  implicit class PickImplexpiresOps[Self <: PickImplexpires] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

