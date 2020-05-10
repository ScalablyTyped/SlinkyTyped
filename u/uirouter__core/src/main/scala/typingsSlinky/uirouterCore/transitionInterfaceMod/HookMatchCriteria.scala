package typingsSlinky.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookMatchCriteria
  extends /* key */ StringDictionary[js.UndefOr[HookMatchCriterion]] {
  /** A [[HookMatchCriterion]] to match any state that would be entering */
  var entering: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match any state that would be exiting */
  var exiting: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match the original (from) state */
  var from: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match any state that would be retained */
  var retained: js.UndefOr[HookMatchCriterion] = js.native
  /** A [[HookMatchCriterion]] to match the destination state */
  var to: js.UndefOr[HookMatchCriterion] = js.native
}

object HookMatchCriteria {
  @scala.inline
  def apply(): HookMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookMatchCriteria]
  }
  @scala.inline
  implicit class HookMatchCriteriaOps[Self <: HookMatchCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnteringFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entering")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEntering(value: HookMatchCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entering")(js.undefined)
        ret
    }
    @scala.inline
    def withExitingFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exiting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExiting(value: HookMatchCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exiting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exiting")(js.undefined)
        ret
    }
    @scala.inline
    def withFromFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFrom(value: HookMatchCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainedFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retained")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRetained(value: HookMatchCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retained")(js.undefined)
        ret
    }
    @scala.inline
    def withToFunction2(value: (/* x */ js.UndefOr[StateObject], /* y */ js.UndefOr[Transition]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTo(value: HookMatchCriterion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

