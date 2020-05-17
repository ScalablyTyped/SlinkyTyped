package typingsSlinky.skmeans.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var centroids: Double = js.native
  var idxs: js.Array[Double] = js.native
  var it: Double = js.native
  var k: Double = js.native
  def test(x: Double): Unit = js.native
  def test(x: Double, point: js.Function2[/* x1 */ Double, /* x2 */ Double, Double]): Unit = js.native
}

