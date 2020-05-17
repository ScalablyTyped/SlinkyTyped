package typingsSlinky.semanticUiProgress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.RandomSettings._Impl, 'max'> */
@js.native
trait PickImplmax extends js.Object {
  var max: Double = js.native
}

object PickImplmax {
  @scala.inline
  def apply(max: Double): PickImplmax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmax]
  }
  @scala.inline
  implicit class PickImplmaxOps[Self <: PickImplmax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

