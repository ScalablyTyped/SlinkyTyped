package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDesigner extends js.Object {
  var designer: Double = js.native
  var yaml: Double = js.native
}

object AnonDesigner {
  @scala.inline
  def apply(designer: Double, yaml: Double): AnonDesigner = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesigner]
  }
  @scala.inline
  implicit class AnonDesignerOps[Self <: AnonDesigner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesigner(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

