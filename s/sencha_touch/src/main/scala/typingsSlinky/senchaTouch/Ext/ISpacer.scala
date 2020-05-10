package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpacer extends IComponent {
  /** [Method] Sets the value of width
  		* @param width Number The new value.
  		*/
  @JSName("setWidth")
  var setWidth_ISpacer: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  @JSName("width")
  var width_ISpacer: js.UndefOr[Double] = js.native
}

object ISpacer {
  @scala.inline
  def apply(): ISpacer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpacer]
  }
  @scala.inline
  implicit class ISpacerOps[Self <: ISpacer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

