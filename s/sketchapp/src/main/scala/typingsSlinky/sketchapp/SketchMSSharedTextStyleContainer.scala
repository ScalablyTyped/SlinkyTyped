package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.sharedTextStyleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSSharedTextStyleContainer extends js.Object {
  var _class: sharedTextStyleContainer = js.native
  var objects: js.Array[_] = js.native
}

object SketchMSSharedTextStyleContainer {
  @scala.inline
  def apply(_class: sharedTextStyleContainer, objects: js.Array[_]): SketchMSSharedTextStyleContainer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSSharedTextStyleContainer]
  }
  @scala.inline
  implicit class SketchMSSharedTextStyleContainerOps[Self <: SketchMSSharedTextStyleContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: sharedTextStyleContainer): Self = {
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

