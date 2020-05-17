package typingsSlinky.smartFoxServer.SFS2X.Entities.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vec3D extends js.Object {
  /** @type {number} Returns the position along the X axis. */
  var px: Double = js.native
  /** @type {number} Returns the position along the Y axis. */
  var py: Double = js.native
  /** @type {number} Returns the position along the Z axis. */
  var pz: Double = js.native
  /**
    * Indicates whether the position is expressed using floating point values or not.
    * @return {boolean} Returns: true if the position is expressed using floating point values.
    */
  def isFloat(): Boolean = js.native
}

object Vec3D {
  @scala.inline
  def apply(isFloat: () => Boolean, px: Double, py: Double, pz: Double): Vec3D = {
    val __obj = js.Dynamic.literal(isFloat = js.Any.fromFunction0(isFloat), px = px.asInstanceOf[js.Any], py = py.asInstanceOf[js.Any], pz = pz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec3D]
  }
  @scala.inline
  implicit class Vec3DOps[Self <: Vec3D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFloat(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("py")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPz(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pz")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

