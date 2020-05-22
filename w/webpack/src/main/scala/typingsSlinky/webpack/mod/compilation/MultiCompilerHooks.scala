package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesHook
import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiCompilerHooks extends js.Object {
  var done: SyncHook[MultiStats, _, _]
  var invalid: SyncHook[String, js.Date, _]
  var run: AsyncSeriesHook[Compiler_, _, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler_, _, _]
}

object MultiCompilerHooks {
  @scala.inline
  def apply(
    done: SyncHook[MultiStats, _, _],
    invalid: SyncHook[String, js.Date, _],
    run: AsyncSeriesHook[Compiler_, _, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler_, _, _]
  ): MultiCompilerHooks = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiCompilerHooks]
  }
}

