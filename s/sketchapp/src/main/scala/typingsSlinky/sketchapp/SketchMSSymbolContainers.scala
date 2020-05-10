package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.symbolContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSSymbolContainers extends js.Object {
  var _class: symbolContainer = js.native
  var objects: js.Array[_] = js.native
}

object SketchMSSymbolContainers {
  @scala.inline
  def apply(_class: symbolContainer, objects: js.Array[_]): SketchMSSymbolContainers = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSymbolContainers]
  }
  @scala.inline
  implicit class SketchMSSymbolContainersOps[Self <: SketchMSSymbolContainers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: symbolContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

