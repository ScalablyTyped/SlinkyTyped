package typingsSlinky.uifabricMergeStyles.anon

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyleBaseArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classes extends js.Object {
  var classes: js.Array[String] = js.native
  var objects: IStyleBaseArray = js.native
}

object Classes {
  @scala.inline
  def apply(classes: js.Array[String], objects: IStyleBaseArray): Classes = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classes]
  }
  @scala.inline
  implicit class ClassesOps[Self <: Classes] (val x: Self) extends AnyVal {
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

