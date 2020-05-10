package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConvertEllipseToCircle extends PluginConfig {
  /** convert ellipse with equal radius measures to circle */
  var convertEllipseToCircle: Boolean | js.Object = js.native
}

object PluginConvertEllipseToCircle {
  @scala.inline
  def apply(convertEllipseToCircle: Boolean | js.Object): PluginConvertEllipseToCircle = {
    val __obj = js.Dynamic.literal(convertEllipseToCircle = convertEllipseToCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertEllipseToCircle]
  }
  @scala.inline
  implicit class PluginConvertEllipseToCircleOps[Self <: PluginConvertEllipseToCircle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertEllipseToCircle(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertEllipseToCircle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

