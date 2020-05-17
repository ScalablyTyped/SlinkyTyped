package typingsSlinky.webpackServe.mod

import typingsSlinky.webpackServe.anon.Compiler
import typingsSlinky.webpackServe.anon.CompilerStats
import typingsSlinky.webpackServe.anon.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var `build-finished`: Stats = js.native
  var `build-started`: Compiler = js.native
  var `compiler-error`: CompilerStats = js.native
  var `compiler-warning`: CompilerStats = js.native
  var listening: typingsSlinky.webpackServe.anon.Options = js.native
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: Stats,
    `build-started`: Compiler,
    `compiler-error`: CompilerStats,
    `compiler-warning`: CompilerStats,
    listening: typingsSlinky.webpackServe.anon.Options
  ): EventMap = {
    val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
    __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBuild-finished`(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBuild-started`(value: Compiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCompiler-error`(value: CompilerStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCompiler-warning`(value: CompilerStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListening(value: typingsSlinky.webpackServe.anon.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listening")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

