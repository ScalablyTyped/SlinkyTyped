package typingsSlinky.webcola.layoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link[NodeRefType] extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var source: NodeRefType = js.native
  var target: NodeRefType = js.native
  var weight: js.UndefOr[Double] = js.native
}

object Link {
  @scala.inline
  def apply[NodeRefType](source: NodeRefType, target: NodeRefType): Link[NodeRefType] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link[NodeRefType]]
  }
  @scala.inline
  implicit class LinkOps[Self[nodereftype] <: Link[nodereftype], NodeRefType] (val x: Self[NodeRefType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[NodeRefType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[NodeRefType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[NodeRefType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[NodeRefType] with Other]
    @scala.inline
    def withSource(value: NodeRefType): Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: NodeRefType): Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self[NodeRefType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

