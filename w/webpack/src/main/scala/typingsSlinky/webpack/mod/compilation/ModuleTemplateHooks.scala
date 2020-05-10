package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleTemplateHooks extends js.Object {
  @JSName("package")
  var _package: SyncWaterfallHook[_, _, _] = js.native
  var content: SyncWaterfallHook[_, _, _] = js.native
  var hash: SyncHook[_, _, _] = js.native
  var module: SyncWaterfallHook[_, _, _] = js.native
  var render: SyncWaterfallHook[_, _, _] = js.native
}

object ModuleTemplateHooks {
  @scala.inline
  def apply(
    _package: SyncWaterfallHook[_, _, _],
    content: SyncWaterfallHook[_, _, _],
    hash: SyncHook[_, _, _],
    module: SyncWaterfallHook[_, _, _],
    render: SyncWaterfallHook[_, _, _]
  ): ModuleTemplateHooks = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleTemplateHooks]
  }
  @scala.inline
  implicit class ModuleTemplateHooksOps[Self <: ModuleTemplateHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

