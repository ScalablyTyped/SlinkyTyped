package typingsSlinky.webpackServe.anon

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var compiler: Compiler_
  var stats: typingsSlinky.webpack.mod.Stats
}

object Stats {
  @scala.inline
  def apply(compiler: Compiler_, stats: typingsSlinky.webpack.mod.Stats): Stats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

