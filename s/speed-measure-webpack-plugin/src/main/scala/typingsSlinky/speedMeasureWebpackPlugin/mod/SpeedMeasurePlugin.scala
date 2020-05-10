package typingsSlinky.speedMeasureWebpackPlugin.mod

import typingsSlinky.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See how fast (or not) your plugins and loaders are, so you can optimise your builds
  */
@js.native
trait SpeedMeasurePlugin extends js.Object {
  def wrap(config: Configuration): Configuration = js.native
}

object SpeedMeasurePlugin {
  @scala.inline
  def apply(wrap: Configuration => Configuration): SpeedMeasurePlugin = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
    __obj.asInstanceOf[SpeedMeasurePlugin]
  }
  @scala.inline
  implicit class SpeedMeasurePluginOps[Self <: SpeedMeasurePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWrap(value: Configuration => Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

