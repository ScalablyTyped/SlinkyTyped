package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flat extends js.Object {
  var flat: scala.Double = js.native
  var oneHop: scala.Double = js.native
  var tree: scala.Double = js.native
}

object Flat {
  @scala.inline
  def apply(flat: scala.Double, oneHop: scala.Double, tree: scala.Double): Flat = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], oneHop = oneHop.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat]
  }
  @scala.inline
  implicit class FlatOps[Self <: Flat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlat(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneHop(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneHop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

