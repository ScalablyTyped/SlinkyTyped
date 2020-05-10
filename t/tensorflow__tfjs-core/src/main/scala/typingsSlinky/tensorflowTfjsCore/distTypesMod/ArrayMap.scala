package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayMap extends js.Object {
  var R0: Double = js.native
  var R1: js.Array[Double] = js.native
  var R2: js.Array[js.Array[Double]] = js.native
  var R3: js.Array[js.Array[js.Array[Double]]] = js.native
  var R4: js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
  var R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]] = js.native
  var R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]] = js.native
}

object ArrayMap {
  @scala.inline
  def apply(
    R0: Double,
    R1: js.Array[Double],
    R2: js.Array[js.Array[Double]],
    R3: js.Array[js.Array[js.Array[Double]]],
    R4: js.Array[js.Array[js.Array[js.Array[Double]]]],
    R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]],
    R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
  ): ArrayMap = {
    val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayMap]
  }
  @scala.inline
  implicit class ArrayMapOps[Self <: ArrayMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withR0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR1(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR2(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR3(value: js.Array[js.Array[js.Array[Double]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR4(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR5(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR6(value: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R6")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

