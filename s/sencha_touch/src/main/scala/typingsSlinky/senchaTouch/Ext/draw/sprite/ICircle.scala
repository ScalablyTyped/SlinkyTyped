package typingsSlinky.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICircle extends IPath {
  /** [Config Option] (Number) */
  var cx: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var cy: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var r: js.UndefOr[Double] = js.native
  /** [Method] Update the path
  		* @param path Object
  		* @param attr Object
  		*/
  @JSName("updatePath")
  var updatePath_ICircle: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICircle {
  @scala.inline
  def apply(): ICircle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICircle]
  }
  @scala.inline
  implicit class ICircleOps[Self <: ICircle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(js.undefined)
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(js.undefined)
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(js.undefined)
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

