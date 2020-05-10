package typingsSlinky.webpack.mod.debug

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilingPluginOptions extends js.Object {
  /** A relative path to a custom output file (json) */
  var outputPath: js.UndefOr[String] = js.native
}

object ProfilingPluginOptions {
  @scala.inline
  def apply(): ProfilingPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilingPluginOptions]
  }
  @scala.inline
  implicit class ProfilingPluginOptionsOps[Self <: ProfilingPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(js.undefined)
        ret
    }
  }
  
}

