package typingsSlinky.uirouterCore.transitionInterfaceMod

import typingsSlinky.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionHookOptions extends js.Object {
  var bind: js.UndefOr[js.Any] = js.native
  var current: js.UndefOr[js.Function0[Transition]] = js.native
  var hookType: js.UndefOr[String] = js.native
  var stateHook: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[js.Any] = js.native
  var traceData: js.UndefOr[js.Any] = js.native
  var transition: js.UndefOr[Transition] = js.native
}

object TransitionHookOptions {
  @scala.inline
  def apply(): TransitionHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionHookOptions]
  }
  @scala.inline
  implicit class TransitionHookOptionsOps[Self <: TransitionHookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent(value: () => Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withHookType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHookType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookType")(js.undefined)
        ret
    }
    @scala.inline
    def withStateHook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHook")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceData")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: Transition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

