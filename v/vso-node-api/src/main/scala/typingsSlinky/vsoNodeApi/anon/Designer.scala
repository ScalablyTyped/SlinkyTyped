package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Designer extends js.Object {
  var designer: scala.Double = js.native
  var yaml: scala.Double = js.native
}

object Designer {
  @scala.inline
  def apply(designer: scala.Double, yaml: scala.Double): Designer = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Designer]
  }
  @scala.inline
  implicit class DesignerOps[Self <: Designer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesigner(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaml(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

