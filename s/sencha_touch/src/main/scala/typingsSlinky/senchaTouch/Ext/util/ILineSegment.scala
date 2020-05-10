package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineSegment extends IBase {
  /** [Method] Returns the point where two lines intersect
  		* @param lineSegment Ext.util.LineSegment The line to intersect with.
  		* @returns Ext.util.Point
  		*/
  var intersects: js.UndefOr[js.Function1[/* lineSegment */ js.UndefOr[this.type], IPoint]] = js.native
  /** [Method] Returns string representation of the line
  		* @returns String For example Point[12,8] Point[0,0]
  		*/
  @JSName("toString")
  var toString_FILineSegment: js.UndefOr[js.Function0[String]] = js.native
}

object ILineSegment {
  @scala.inline
  def apply(): ILineSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineSegment]
  }
  @scala.inline
  implicit class ILineSegmentOps[Self <: ILineSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntersects(value: /* lineSegment */ js.UndefOr[ILineSegment] => IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIntersects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
  }
  
}

