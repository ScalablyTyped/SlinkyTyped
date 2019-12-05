package typingsSlinky.snabbdom

import typingsSlinky.snabbdom.hooksMod.CreateHook
import typingsSlinky.snabbdom.hooksMod.DestroyHook
import typingsSlinky.snabbdom.hooksMod.PostHook
import typingsSlinky.snabbdom.hooksMod.PreHook
import typingsSlinky.snabbdom.hooksMod.RemoveHook
import typingsSlinky.snabbdom.hooksMod.UpdateHook
import typingsSlinky.snabbdom.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/modules/module", JSImport.Namespace)
@js.native
object modulesModuleMod extends js.Object {
  @js.native
  trait Module extends js.Object {
    @JSName("create")
    var create_Original: CreateHook = js.native
    @JSName("destroy")
    var destroy_Original: DestroyHook = js.native
    @JSName("post")
    var post_Original: PostHook = js.native
    @JSName("pre")
    var pre_Original: PreHook = js.native
    @JSName("remove")
    var remove_Original: RemoveHook = js.native
    @JSName("update")
    var update_Original: UpdateHook = js.native
    def create(emptyVNode: VNode, vNode: VNode): js.Any = js.native
    def destroy(vNode: VNode): js.Any = js.native
    def post(): js.Any = js.native
    def pre(): js.Any = js.native
    def remove(vNode: VNode, removeCallback: js.Function0[Unit]): js.Any = js.native
    def update(oldVNode: VNode, vNode: VNode): js.Any = js.native
  }
  
}

