package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesHook
import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiCompilerHooks extends js.Object {
  var done: SyncHook[MultiStats, _, _] = js.native
  var invalid: SyncHook[String, js.Date, _] = js.native
  var run: AsyncSeriesHook[Compiler_, _, _] = js.native
  var watchClose: SyncHook[_, _, _] = js.native
  var watchRun: AsyncSeriesHook[Compiler_, _, _] = js.native
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
  @scala.inline
  implicit class MultiCompilerHooksOps[Self <: MultiCompilerHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDone(value: SyncHook[MultiStats, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid(value: SyncHook[String, js.Date, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: AsyncSeriesHook[Compiler_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
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

