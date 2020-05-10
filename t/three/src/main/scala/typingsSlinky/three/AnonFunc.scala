package typingsSlinky.three

import typingsSlinky.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFunc extends js.Object {
  var slices: Double = js.native
  var stacks: Double = js.native
  def func(u: Double, v: Double, dest: Vector3): Unit = js.native
}

object AnonFunc {
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Unit, slices: Double, stacks: Double): AnonFunc = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunc]
  }
  @scala.inline
  implicit class AnonFuncOps[Self <: AnonFunc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunc(value: (Double, Double, Vector3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSlices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStacks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

