package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractRange extends js.Object {
  /**
    * Returns true if range is collapsed, and false otherwise.
    */
  val collapsed: scala.Boolean = js.native
  /**
    * Returns range's end node.
    */
  val endContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's end offset.
    */
  val endOffset: Double = js.native
  /**
    * Returns range's start node.
    */
  val startContainer: org.scalajs.dom.raw.Node = js.native
  /**
    * Returns range's start offset.
    */
  val startOffset: Double = js.native
}

object AbstractRange {
  @scala.inline
  def apply(
    collapsed: scala.Boolean,
    endContainer: org.scalajs.dom.raw.Node,
    endOffset: Double,
    startContainer: org.scalajs.dom.raw.Node,
    startOffset: Double
  ): AbstractRange = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractRange]
  }
  @scala.inline
  implicit class AbstractRangeOps[Self <: AbstractRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndContainer(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartContainer(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

