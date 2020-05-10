package typingsSlinky.semanticUiProgress

import typingsSlinky.semanticUiProgress.SemanticUI.Progress.RandomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.ProgressSettings._Impl, 'random'> */
@js.native
trait PickImplrandom extends js.Object {
  var random: RandomSettings = js.native
}

object PickImplrandom {
  @scala.inline
  def apply(random: RandomSettings): PickImplrandom = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrandom]
  }
  @scala.inline
  implicit class PickImplrandomOps[Self <: PickImplrandom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRandom(value: RandomSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("random")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

