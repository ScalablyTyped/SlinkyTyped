package typingsSlinky.webpack.mod

import typingsSlinky.webpack.mod.ICompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait ICompiler_ extends js.Object {
  def run(handler: Handler): Unit
  def watch(watchOptions: typingsSlinky.webpack.mod.ICompiler.WatchOptions, handler: Handler): Watching
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
}

