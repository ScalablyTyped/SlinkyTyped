package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import typingsSlinky.tapable.mod.HookMap
import typingsSlinky.tapable.mod.SyncBailHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalModuleFactoryHooks extends js.Object {
  var afterResolve: AsyncSeriesWaterfallHook[_, _, _] = js.native
  var beforeResolve: AsyncSeriesWaterfallHook[_, _, _] = js.native
  var createGenerator: HookMap[_, _, _] = js.native
  var createModule: SyncBailHook[_, _, _, _] = js.native
  var createParser: HookMap[_, _, _] = js.native
  var factory: SyncWaterfallHook[_, _, _] = js.native
  var generator: HookMap[_, _, _] = js.native
  var module: SyncWaterfallHook[_, _, _] = js.native
  var parser: HookMap[Parser, _, _] = js.native
  var resolver: SyncWaterfallHook[_, _, _] = js.native
}

object NormalModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: AsyncSeriesWaterfallHook[_, _, _],
    createGenerator: HookMap[_, _, _],
    createModule: SyncBailHook[_, _, _, _],
    createParser: HookMap[_, _, _],
    factory: SyncWaterfallHook[_, _, _],
    generator: HookMap[_, _, _],
    module: SyncWaterfallHook[_, _, _],
    parser: HookMap[Parser, _, _],
    resolver: SyncWaterfallHook[_, _, _]
  ): NormalModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve.asInstanceOf[js.Any], beforeResolve = beforeResolve.asInstanceOf[js.Any], createGenerator = createGenerator.asInstanceOf[js.Any], createModule = createModule.asInstanceOf[js.Any], createParser = createParser.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalModuleFactoryHooks]
  }
  @scala.inline
  implicit class NormalModuleFactoryHooksOps[Self <: NormalModuleFactoryHooks] (val x: Self) extends AnyVal {
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
    def withBeforeResolve(value: AsyncSeriesWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateGenerator(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createGenerator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateModule(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateParser(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactory(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerator(value: HookMap[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParser(value: HookMap[Parser, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolver(value: SyncWaterfallHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

