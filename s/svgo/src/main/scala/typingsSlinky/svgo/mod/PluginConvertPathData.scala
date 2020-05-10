package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginConvertPathData extends PluginConfig {
  var convertPathData: Boolean | js.Object = js.native
}

object PluginConvertPathData {
  @scala.inline
  def apply(convertPathData: Boolean | js.Object): PluginConvertPathData = {
    val __obj = js.Dynamic.literal(convertPathData = convertPathData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertPathData]
  }
  @scala.inline
  implicit class PluginConvertPathDataOps[Self <: PluginConvertPathData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertPathData(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertPathData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

