package typingsSlinky.tensorflowTfjsCore.environmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagRegistryEntry extends js.Object {
  var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.native
  def evaluationFn(): FlagValue = js.native
}

object FlagRegistryEntry {
  @scala.inline
  def apply(evaluationFn: () => FlagValue): FlagRegistryEntry = {
    val __obj = js.Dynamic.literal(evaluationFn = js.Any.fromFunction0(evaluationFn))
    __obj.asInstanceOf[FlagRegistryEntry]
  }
  @scala.inline
  implicit class FlagRegistryEntryOps[Self <: FlagRegistryEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationFn(value: () => FlagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationFn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetHook(value: /* value */ FlagValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHook")(js.undefined)
        ret
    }
  }
  
}

