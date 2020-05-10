package typingsSlinky.senchaTouch.Ext.event

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDom extends js.Object {
  /** [Property] (Number) */
  var distance: js.UndefOr[Double] = js.native
  /** [Method] Gets the x coordinate of the event
  		* @returns Number
  		*/
  var getPageX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the y coordinate of the event
  		* @returns Number
  		*/
  var getPageY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Gets the target for the event
  		* @param selector String A simple selector to filter the target or look for an ancestor of the target
  		* @param maxDepth Number/Mixed The max depth to search as a number or element (defaults to 10 || document.body)
  		* @param returnEl Boolean true to return a Ext.Element object instead of DOM node.
  		* @returns HTMLElement
  		*/
  var getTarget: js.UndefOr[
    js.Function3[
      /* selector */ js.UndefOr[String], 
      /* maxDepth */ js.UndefOr[js.Any], 
      /* returnEl */ js.UndefOr[Boolean], 
      HTMLElement
    ]
  ] = js.native
  /** [Method] Returns the time of the event
  		* @returns Date
  		*/
  var getTime: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Gets the X and Y coordinates of the event
  		* @returns Array
  		*/
  var getXY: js.UndefOr[js.Function0[Array]] = js.native
  /** [Property] (Number) */
  var pageX: js.UndefOr[Double] = js.native
  /** [Property] (Number) */
  var pageY: js.UndefOr[Double] = js.native
  /** [Method] Prevents the browsers default handling of the event  */
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (HTMLElement) */
  var target: js.UndefOr[HTMLElement] = js.native
}

object IDom {
  @scala.inline
  def apply(): IDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDom]
  }
  @scala.inline
  implicit class IDomOps[Self <: IDom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPageX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPageY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTarget(
      value: (/* selector */ js.UndefOr[String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[Boolean]) => HTMLElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTime(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXY(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.undefined)
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(js.undefined)
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

