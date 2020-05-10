package typingsSlinky.sigmajs.SigmaJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeLibrary extends js.Object {
  def enumerate(): js.Any = js.native
}

object ShapeLibrary {
  @scala.inline
  def apply(enumerate: () => js.Any): ShapeLibrary = {
    val __obj = js.Dynamic.literal(enumerate = js.Any.fromFunction0(enumerate))
    __obj.asInstanceOf[ShapeLibrary]
  }
  @scala.inline
  implicit class ShapeLibraryOps[Self <: ShapeLibrary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumerate(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

