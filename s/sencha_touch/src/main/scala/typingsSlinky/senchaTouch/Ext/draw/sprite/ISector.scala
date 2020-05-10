package typingsSlinky.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISector extends IPath {
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var margin: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
  /** [Method] Update the path
  		* @param path Object
  		* @param attr Object
  		*/
  @JSName("updatePath")
  var updatePath_ISector: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
}

object ISector {
  @scala.inline
  def apply(): ISector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISector]
  }
  @scala.inline
  implicit class ISectorOps[Self <: ISector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRho(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRho")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRho(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRho")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.undefined)
        ret
    }
  }
  
}

