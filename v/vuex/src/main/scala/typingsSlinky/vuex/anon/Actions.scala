package typingsSlinky.vuex.anon

import typingsSlinky.vuex.mod.ActionTree
import typingsSlinky.vuex.mod.GetterTree
import typingsSlinky.vuex.mod.ModuleTree
import typingsSlinky.vuex.mod.MutationTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.native
  var getters: js.UndefOr[GetterTree[S, S]] = js.native
  var modules: js.UndefOr[ModuleTree[S]] = js.native
  var mutations: js.UndefOr[MutationTree[S]] = js.native
}

object Actions {
  @scala.inline
  def apply[S](): Actions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions[S]]
  }
  @scala.inline
  implicit class ActionsOps[Self[s] <: Actions[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withActions(value: ActionTree[S, S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetters(value: GetterTree[S, S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withModules(value: ModuleTree[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModules: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(js.undefined)
        ret
    }
    @scala.inline
    def withMutations(value: MutationTree[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutations: Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutations")(js.undefined)
        ret
    }
  }
  
}

