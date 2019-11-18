package typingsSlinky.three

import typingsSlinky.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  var slices: Double
  var stacks: Double
  def func(u: Double, v: Double, dest: Vector3): Unit
}

object Anon_Dest {
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Unit, slices: Double, stacks: Double): Anon_Dest = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dest]
  }
}

