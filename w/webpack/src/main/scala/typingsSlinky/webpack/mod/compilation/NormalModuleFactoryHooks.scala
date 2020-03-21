package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesWaterfallHook
import typingsSlinky.tapable.mod.HookMap
import typingsSlinky.tapable.mod.SyncBailHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import typingsSlinky.webpack.mod.compilation.normalModuleFactory.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalModuleFactoryHooks extends js.Object {
  var afterResolve: AsyncSeriesWaterfallHook[_, _, _]
  var beforeResolve: AsyncSeriesWaterfallHook[_, _, _]
  var createGenerator: HookMap[_, _, _]
  var createModule: SyncBailHook[_, _, _, _]
  var createParser: HookMap[_, _, _]
  var factory: SyncWaterfallHook[_, _, _]
  var generator: HookMap[_, _, _]
  var module: SyncWaterfallHook[_, _, _]
  var parser: HookMap[Parser, _, _]
  var resolver: SyncWaterfallHook[_, _, _]
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
}

