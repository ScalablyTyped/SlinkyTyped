package typingsSlinky.webpackStream

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.webpack.mod.debug.ProfilingPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdebug extends js.Object {
  /**
    * Generate Chrome profile file which includes timings of plugins execution. Outputs `events.json` file by
    * default. It is possible to provide custom file path using `outputPath` option.
    *
    * In order to view the profile file:
    * * Run webpack with ProfilingPlugin.
    * * Go to Chrome, open the Profile Tab.
    * * Drag and drop generated file (events.json by default) into the profiler.
    *
    * It will then display timeline stats and calls per plugin!
    */
  var ProfilingPlugin: Instantiable0[typingsSlinky.webpack.mod.debug.ProfilingPlugin] = js.native
}

object Typeofdebug {
  @scala.inline
  def apply(ProfilingPlugin: Instantiable0[ProfilingPlugin]): Typeofdebug = {
    val __obj = js.Dynamic.literal(ProfilingPlugin = ProfilingPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofdebug]
  }
  @scala.inline
  implicit class TypeofdebugOps[Self <: Typeofdebug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfilingPlugin(value: Instantiable0[ProfilingPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProfilingPlugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

