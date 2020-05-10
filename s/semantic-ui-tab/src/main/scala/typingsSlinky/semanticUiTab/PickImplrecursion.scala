package typingsSlinky.semanticUiTab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'recursion'> */
@js.native
trait PickImplrecursion extends js.Object {
  var recursion: String = js.native
}

object PickImplrecursion {
  @scala.inline
  def apply(recursion: String): PickImplrecursion = {
    val __obj = js.Dynamic.literal(recursion = recursion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrecursion]
  }
  @scala.inline
  implicit class PickImplrecursionOps[Self <: PickImplrecursion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecursion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

