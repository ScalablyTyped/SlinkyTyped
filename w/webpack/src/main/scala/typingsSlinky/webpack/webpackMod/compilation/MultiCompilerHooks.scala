package typingsSlinky.webpack.webpackMod.compilation

import typingsSlinky.tapable.tapableMod.AsyncSeriesHook
import typingsSlinky.tapable.tapableMod.SyncHook
import typingsSlinky.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiCompilerHooks extends js.Object {
  var done: SyncHook[MultiStats, _, _]
  var invalid: SyncHook[String, js.Date, _]
  var run: AsyncSeriesHook[Compiler, _, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler, _, _]
}

object MultiCompilerHooks {
  @scala.inline
  def apply(
    done: SyncHook[MultiStats, _, _],
    invalid: SyncHook[String, js.Date, _],
    run: AsyncSeriesHook[Compiler, _, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler, _, _]
  ): MultiCompilerHooks = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiCompilerHooks]
  }
}

