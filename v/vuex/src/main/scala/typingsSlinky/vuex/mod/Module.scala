package typingsSlinky.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module[S, R] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, R]] = js.native
  var getters: js.UndefOr[GetterTree[S, R]] = js.native
  var modules: js.UndefOr[ModuleTree[R]] = js.native
  var mutations: js.UndefOr[MutationTree[S]] = js.native
  var namespaced: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[S | js.Function0[S]] = js.native
}

object Module {
  @scala.inline
  def apply[S, R](): Module[S, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Module[S, R]]
  }
  @scala.inline
  implicit class ModuleOps[Self[s, r] <: Module[s, r], S, R] (val x: Self[S, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, R]) with Other]
    @scala.inline
    def withActions(value: ActionTree[S, R]): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetters(value: GetterTree[S, R]): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: ModuleTree[R]): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withMutations(value: MutationTree[S]): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutations: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaced(value: Boolean): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaced: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaced")(js.undefined)
        ret
    }
    @scala.inline
    def withStateFunction0(value: () => S): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withState(value: S | js.Function0[S]): Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[S, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

