package typingsSlinky.uiRouterExtras.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Previous state
  */
@js.native
trait IPreviousState extends js.Object {
  var params: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
  ] = js.native
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any = js.native
}

object IPreviousState {
  @scala.inline
  def apply(
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
  ): IPreviousState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreviousState]
  }
  @scala.inline
  implicit class IPreviousStateOps[Self <: IPreviousState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

