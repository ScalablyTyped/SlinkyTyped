package typingsSlinky.webpackServe.mod

import typingsSlinky.webpackServe.AnonCompiler
import typingsSlinky.webpackServe.AnonCompilerStats
import typingsSlinky.webpackServe.AnonOptions
import typingsSlinky.webpackServe.AnonStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var `build-finished`: AnonStats = js.native
  var `build-started`: AnonCompiler = js.native
  var `compiler-error`: AnonCompilerStats = js.native
  var `compiler-warning`: AnonCompilerStats = js.native
  var listening: AnonOptions = js.native
}

object EventMap {
  @scala.inline
  def apply(
    `build-finished`: AnonStats,
    `build-started`: AnonCompiler,
    `compiler-error`: AnonCompilerStats,
    `compiler-warning`: AnonCompilerStats,
    listening: AnonOptions
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
    def `withBuild-finished`(value: AnonStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBuild-started`(value: AnonCompiler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build-started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCompiler-error`(value: AnonCompilerStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCompiler-warning`(value: AnonCompilerStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiler-warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListening(value: AnonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listening")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

