package typingsSlinky.uifabricMergeStyles

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyleBaseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClasses extends js.Object {
  var classes: js.Array[String] = js.native
  var objects: IStyleBaseArray = js.native
}

object AnonClasses {
  @scala.inline
  def apply(classes: js.Array[String], objects: IStyleBaseArray): AnonClasses = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClasses]
  }
  @scala.inline
  implicit class AnonClassesOps[Self <: AnonClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: IStyleBaseArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

