package typingsSlinky.webpackServe.anon

import typingsSlinky.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var compiler: Compiler_ = js.native
  var stats: typingsSlinky.webpack.mod.Stats = js.native
}

object Stats {
  @scala.inline
  def apply(compiler: Compiler_, stats: typingsSlinky.webpack.mod.Stats): Stats = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompiler(value: Compiler_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: typingsSlinky.webpack.mod.Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

