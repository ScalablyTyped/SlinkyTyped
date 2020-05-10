package typingsSlinky.webpack.mod

import typingsSlinky.webpack.mod.ICompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait ICompiler_ extends js.Object {
  def run(handler: Handler): Unit = js.native
  def watch(watchOptions: typingsSlinky.webpack.mod.ICompiler.WatchOptions, handler: Handler): Watching = js.native
}

object ICompiler_ {
  @scala.inline
  def apply(
    run: Handler => Unit,
    watch: (typingsSlinky.webpack.mod.ICompiler.WatchOptions, Handler) => Watching
  ): ICompiler_ = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), watch = js.Any.fromFunction2(watch))
    __obj.asInstanceOf[ICompiler_]
  }
  @scala.inline
  implicit class ICompiler_Ops[Self <: ICompiler_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: Handler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: (typingsSlinky.webpack.mod.ICompiler.WatchOptions, Handler) => Watching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

