package typingsSlinky.senchaTouch.Ext.draw.engine

import typingsSlinky.senchaTouch.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvas extends ISurface {
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the value of highPrecision
  		* @returns Boolean
  		*/
  var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[Boolean] = js.native
  /** [Method] Initialize the canvas element  */
  var initElement: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets the value of highPrecision
  		* @param highPrecision Boolean The new value.
  		*/
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.native
}

object ICanvas {
  @scala.inline
  def apply(): ICanvas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvas]
  }
  @scala.inline
  implicit class ICanvasOps[Self <: ICanvas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearTransform(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHighPrecision(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighPrecision")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withHighPrecision(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withInitElement(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighPrecision")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHighPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHighPrecision")(js.undefined)
        ret
    }
  }
  
}

