package typingsSlinky.semanticUiSticky.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'supported'> */
@js.native
trait PickImplsupported extends js.Object {
  var supported: String = js.native
}

object PickImplsupported {
  @scala.inline
  def apply(supported: String): PickImplsupported = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsupported]
  }
  @scala.inline
  implicit class PickImplsupportedOps[Self <: PickImplsupported] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSupported(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

