package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SceneAnalysisEffect::SceneAnalyzed event. */
@js.native
trait SceneAnalyzedEventArgs extends js.Object {
  /** Gets the result frame from the scene analysis operation. */
  var resultFrame: SceneAnalysisEffectFrame = js.native
}

object SceneAnalyzedEventArgs {
  @scala.inline
  def apply(resultFrame: SceneAnalysisEffectFrame): SceneAnalyzedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneAnalyzedEventArgs]
  }
  @scala.inline
  implicit class SceneAnalyzedEventArgsOps[Self <: SceneAnalyzedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultFrame(value: SceneAnalysisEffectFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFrame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

