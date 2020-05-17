package typingsSlinky.semanticUiProgress.anon

import typingsSlinky.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.TextSettings._Impl, 'ratio'> */
@js.native
trait PickImplratio extends js.Object {
  var ratio: `false` | String = js.native
}

object PickImplratio {
  @scala.inline
  def apply(ratio: `false` | String): PickImplratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplratio]
  }
  @scala.inline
  implicit class PickImplratioOps[Self <: PickImplratio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRatio(value: `false` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

