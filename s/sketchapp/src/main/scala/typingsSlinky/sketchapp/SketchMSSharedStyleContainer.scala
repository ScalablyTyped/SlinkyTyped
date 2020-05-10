package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.sharedStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSSharedStyleContainer extends js.Object {
  var _class: sharedStyleContainer = js.native
  var objects: js.Array[SketchMSSharedStyle] = js.native
}

object SketchMSSharedStyleContainer {
  @scala.inline
  def apply(_class: sharedStyleContainer, objects: js.Array[SketchMSSharedStyle]): SketchMSSharedStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedStyleContainer]
  }
  @scala.inline
  implicit class SketchMSSharedStyleContainerOps[Self <: SketchMSSharedStyleContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: sharedStyleContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[SketchMSSharedStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

