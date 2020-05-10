package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextModuleFactoryHooks extends js.Object {
  var afterResolve: AsyncSeriesWaterfallHook[_, _, _] = js.native
  var alternatives: AsyncSeriesWaterfallHook[_, _, _] = js.native
  var beforeResolve: AsyncSeriesWaterfallHook[_, _, _] = js.native
  var contextModuleFiles: SyncWaterfallHook[_, _, _] = js.native
}

object ContextModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: AsyncSeriesWaterfallHook[_, _, _],
    alternatives: AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: AsyncSeriesWaterfallHook[_, _, _],
    contextModuleFiles: SyncWaterfallHook[_, _, _]
  ): ContextModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve.asInstanceOf[js.Any], alternatives = alternatives.asInstanceOf[js.Any], beforeResolve = beforeResolve.asInstanceOf[js.Any], contextModuleFiles = contextModuleFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleFactoryHooks]
  }
  @scala.inline
  implicit class ContextModuleFactoryHooksOps[Self <: ContextModuleFactoryHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterResolve(value: AsyncSeriesWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlternatives(value: AsyncSeriesWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeResolve(value: AsyncSeriesWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextModuleFiles(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextModuleFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

