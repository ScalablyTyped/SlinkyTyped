package typingsSlinky.vis.mod

import typingsSlinky.vis.anon.Canvas
import typingsSlinky.vis.anon.Nodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  var edges: js.Array[String] = js.native
  var event: js.Array[String] = js.native
  var nodes: js.Array[String] = js.native
  var pointer: Canvas = js.native
  var previousSelection: js.UndefOr[Nodes] = js.native
}

object Properties {
  @scala.inline
  def apply(edges: js.Array[String], event: js.Array[String], nodes: js.Array[String], pointer: Canvas): Properties = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointer(value: Canvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSelection(value: Nodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSelection")(js.undefined)
        ret
    }
  }
  
}

