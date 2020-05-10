package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.hooksMod.CreateHook
import typingsSlinky.snabbdom.hooksMod.DestroyHook
import typingsSlinky.snabbdom.hooksMod.PostHook
import typingsSlinky.snabbdom.hooksMod.PreHook
import typingsSlinky.snabbdom.hooksMod.RemoveHook
import typingsSlinky.snabbdom.hooksMod.UpdateHook
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<snabbdom.snabbdom/modules/module.Module> */
@js.native
trait PartialModule extends js.Object {
  var create: js.UndefOr[CreateHook] = js.native
  var destroy: js.UndefOr[DestroyHook] = js.native
  var post: js.UndefOr[PostHook] = js.native
  var pre: js.UndefOr[PreHook] = js.native
  var remove: js.UndefOr[RemoveHook] = js.native
  var update: js.UndefOr[UpdateHook] = js.native
}

object PartialModule {
  @scala.inline
  def apply(): PartialModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModule]
  }
  @scala.inline
  implicit class PartialModuleOps[Self <: PartialModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* vNode */ VNode_ => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

