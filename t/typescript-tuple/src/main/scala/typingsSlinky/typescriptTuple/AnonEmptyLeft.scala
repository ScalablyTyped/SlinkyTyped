package typingsSlinky.typescriptTuple

import typingsSlinky.typescriptTuple.utilsMod.Prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends js.Object {
  var emptyLeft: Right = js.native
  var infiniteLeft: AnonERROR = js.native
  var multiLeft: js.Any = js.native
  var singleLeft: Prepend[Right, _] = js.native
}

object AnonEmptyLeft {
  @scala.inline
  def apply[Right, Left](emptyLeft: Right, infiniteLeft: AnonERROR, multiLeft: js.Any, singleLeft: Prepend[Right, _]): AnonEmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyLeft[Right, Left]]
  }
  @scala.inline
  implicit class AnonEmptyLeftOps[Self[right, left] <: AnonEmptyLeft[right, left], Right, Left] (val x: Self[Right, Left]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Right, Left] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Right, Left]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Right, Left]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Right, Left]) with Other]
    @scala.inline
    def withEmptyLeft(value: Right): Self[Right, Left] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfiniteLeft(value: AnonERROR): Self[Right, Left] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infiniteLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLeft(value: js.Any): Self[Right, Left] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleLeft(value: Prepend[Right, _]): Self[Right, Left] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleLeft")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

