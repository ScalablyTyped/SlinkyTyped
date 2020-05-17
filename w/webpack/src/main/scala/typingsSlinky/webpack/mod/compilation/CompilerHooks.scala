package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncParallelHook
import typingsSlinky.tapable.mod.AsyncSeriesHook
import typingsSlinky.tapable.mod.SyncBailHook
import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.webpack.anon.NormalModuleFactory
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilerHooks extends js.Object {
  var additionalPass: AsyncSeriesHook[_, _, _] = js.native
  var afterCompile: AsyncSeriesHook[Compilation, _, _] = js.native
  var afterEmit: AsyncSeriesHook[Compilation, _, _] = js.native
  var afterEnvironment: SyncHook[_, _, _] = js.native
  var afterPlugins: SyncHook[Compiler_, _, _] = js.native
  var afterResolvers: SyncHook[Compiler_, _, _] = js.native
  var beforeCompile: AsyncSeriesHook[js.Object, _, _] = js.native
  var beforeRun: AsyncSeriesHook[Compiler_, _, _] = js.native
  var compilation: SyncHook[Compilation, NormalModuleFactory, _] = js.native
  var compile: SyncHook[js.Object, _, _] = js.native
  var contextModuleFactory: SyncHook[ContextModuleFactory, _, _] = js.native
  var done: AsyncSeriesHook[Stats, _, _] = js.native
  var emit: AsyncSeriesHook[Compilation, _, _] = js.native
  var entryOption: SyncBailHook[_, _, _, _] = js.native
  var environment: SyncHook[_, _, _] = js.native
  var failed: SyncHook[js.Error, _, _] = js.native
  var invalid: SyncHook[String, js.Date, _] = js.native
  var make: AsyncParallelHook[Compilation, _, _] = js.native
  var normalModuleFactory: SyncHook[NormalModuleFactory_, _, _] = js.native
  var run: AsyncSeriesHook[Compiler_, _, _] = js.native
  var shouldEmit: SyncBailHook[Compilation, _, _, _] = js.native
  var thisCompilation: SyncHook[Compilation, NormalModuleFactory, _] = js.native
  var watchClose: SyncHook[_, _, _] = js.native
  var watchRun: AsyncSeriesHook[Compiler_, _, _] = js.native
}

object CompilerHooks {
  @scala.inline
  def apply(
    additionalPass: AsyncSeriesHook[_, _, _],
    afterCompile: AsyncSeriesHook[Compilation, _, _],
    afterEmit: AsyncSeriesHook[Compilation, _, _],
    afterEnvironment: SyncHook[_, _, _],
    afterPlugins: SyncHook[Compiler_, _, _],
    afterResolvers: SyncHook[Compiler_, _, _],
    beforeCompile: AsyncSeriesHook[js.Object, _, _],
    beforeRun: AsyncSeriesHook[Compiler_, _, _],
    compilation: SyncHook[Compilation, NormalModuleFactory, _],
    compile: SyncHook[js.Object, _, _],
    contextModuleFactory: SyncHook[ContextModuleFactory, _, _],
    done: AsyncSeriesHook[Stats, _, _],
    emit: AsyncSeriesHook[Compilation, _, _],
    entryOption: SyncBailHook[_, _, _, _],
    environment: SyncHook[_, _, _],
    failed: SyncHook[js.Error, _, _],
    invalid: SyncHook[String, js.Date, _],
    make: AsyncParallelHook[Compilation, _, _],
    normalModuleFactory: SyncHook[NormalModuleFactory_, _, _],
    run: AsyncSeriesHook[Compiler_, _, _],
    shouldEmit: SyncBailHook[Compilation, _, _, _],
    thisCompilation: SyncHook[Compilation, NormalModuleFactory, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler_, _, _]
  ): CompilerHooks = {
    val __obj = js.Dynamic.literal(additionalPass = additionalPass.asInstanceOf[js.Any], afterCompile = afterCompile.asInstanceOf[js.Any], afterEmit = afterEmit.asInstanceOf[js.Any], afterEnvironment = afterEnvironment.asInstanceOf[js.Any], afterPlugins = afterPlugins.asInstanceOf[js.Any], afterResolvers = afterResolvers.asInstanceOf[js.Any], beforeCompile = beforeCompile.asInstanceOf[js.Any], beforeRun = beforeRun.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], compile = compile.asInstanceOf[js.Any], contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], entryOption = entryOption.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], shouldEmit = shouldEmit.asInstanceOf[js.Any], thisCompilation = thisCompilation.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerHooks]
  }
  @scala.inline
  implicit class CompilerHooksOps[Self <: CompilerHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalPass(value: AsyncSeriesHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterCompile(value: AsyncSeriesHook[Compilation, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCompile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterEmit(value: AsyncSeriesHook[Compilation, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterEnvironment(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterPlugins(value: SyncHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterResolvers(value: SyncHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeCompile(value: AsyncSeriesHook[js.Object, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCompile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeRun(value: AsyncSeriesHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilation(value: SyncHook[Compilation, NormalModuleFactory, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompile(value: SyncHook[js.Object, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextModuleFactory(value: SyncHook[ContextModuleFactory, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: AsyncSeriesHook[Stats, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmit(value: AsyncSeriesHook[Compilation, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryOption(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed(value: SyncHook[js.Error, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: SyncHook[String, js.Date, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMake(value: AsyncParallelHook[Compilation, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalModuleFactory(value: SyncHook[NormalModuleFactory_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: AsyncSeriesHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldEmit(value: SyncBailHook[Compilation, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldEmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThisCompilation(value: SyncHook[Compilation, NormalModuleFactory, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thisCompilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchClose(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchRun(value: AsyncSeriesHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchRun")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

