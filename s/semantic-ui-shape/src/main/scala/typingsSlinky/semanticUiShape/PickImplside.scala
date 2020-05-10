package typingsSlinky.semanticUiShape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.ErrorSettings._Impl, 'side'> */
@js.native
trait PickImplside extends js.Object {
  var side: String = js.native
}

object PickImplside {
  @scala.inline
  def apply(side: String): PickImplside = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplside]
  }
  @scala.inline
  implicit class PickImplsideOps[Self <: PickImplside] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

