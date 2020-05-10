package typingsSlinky.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginAddClassesToSVGElement extends PluginConfig {
  var addClassesToSVGElement: Boolean | js.Object = js.native
}

object PluginAddClassesToSVGElement {
  @scala.inline
  def apply(addClassesToSVGElement: Boolean | js.Object): PluginAddClassesToSVGElement = {
    val __obj = js.Dynamic.literal(addClassesToSVGElement = addClassesToSVGElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginAddClassesToSVGElement]
  }
  @scala.inline
  implicit class PluginAddClassesToSVGElementOps[Self <: PluginAddClassesToSVGElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClassesToSVGElement(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassesToSVGElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

