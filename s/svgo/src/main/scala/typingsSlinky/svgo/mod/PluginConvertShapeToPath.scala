package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConvertShapeToPath extends PluginConfig {
  var convertShapeToPath: Boolean | js.Object = js.native
}

object PluginConvertShapeToPath {
  @scala.inline
  def apply(convertShapeToPath: Boolean | js.Object): PluginConvertShapeToPath = {
    val __obj = js.Dynamic.literal(convertShapeToPath = convertShapeToPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertShapeToPath]
  }
  @scala.inline
  implicit class PluginConvertShapeToPathOps[Self <: PluginConvertShapeToPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertShapeToPath(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertShapeToPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

