package typingsSlinky.taskGraphRunner.mod

import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts[Item, Result] extends js.Object {
  var force: js.UndefOr[Boolean] = js.native
  var graph: Map[Item, js.Array[Item]] = js.native
  def task(item: Item): Result = js.native
}

object Opts {
  @scala.inline
  def apply[Item, Result](graph: Map[Item, js.Array[Item]], task: Item => Result): Opts[Item, Result] = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], task = js.Any.fromFunction1(task))
    __obj.asInstanceOf[Opts[Item, Result]]
  }
  @scala.inline
  implicit class OptsOps[Self[item, result] <: Opts[item, result], Item, Result] (val x: Self[Item, Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Item, Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Item, Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Item, Result]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Item, Result]) with Other]
    @scala.inline
    def withGraph(value: Map[Item, js.Array[Item]]): Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask(value: Item => Result): Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self[Item, Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
  }
  
}

