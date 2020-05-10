package typingsSlinky.shipitCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task_ extends js.Object {
  var blocking: Boolean = js.native
  var dep: js.Array[String] = js.native
  var name: String = js.native
  def fn(): Unit = js.native
}

object Task_ {
  @scala.inline
  def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task_ = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task_]
  }
  @scala.inline
  implicit class Task_Ops[Self <: Task_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDep(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

