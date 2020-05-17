package typingsSlinky.semanticUiShape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-shape.SemanticUI.Shape.SelectorSettings._Impl, 'sides'> */
@js.native
trait PickImplsides extends js.Object {
  var sides: String = js.native
}

object PickImplsides {
  @scala.inline
  def apply(sides: String): PickImplsides = {
    val __obj = js.Dynamic.literal(sides = sides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsides]
  }
  @scala.inline
  implicit class PickImplsidesOps[Self <: PickImplsides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSides(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

