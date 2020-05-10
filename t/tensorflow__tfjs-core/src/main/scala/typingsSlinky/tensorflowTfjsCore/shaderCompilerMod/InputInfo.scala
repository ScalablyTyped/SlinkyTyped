package typingsSlinky.tensorflowTfjsCore.shaderCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputInfo extends js.Object {
  var name: String = js.native
  var shapeInfo: ShapeInfo = js.native
}

object InputInfo {
  @scala.inline
  def apply(name: String, shapeInfo: ShapeInfo): InputInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shapeInfo = shapeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputInfo]
  }
  @scala.inline
  implicit class InputInfoOps[Self <: InputInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeInfo(value: ShapeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

