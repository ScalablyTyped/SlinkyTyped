package typingsSlinky.senchaTouch.Ext.chart.interactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemHighlight extends IAbstract {
  /** [Method] Placeholder method
  		* @param series Object
  		* @param item Object
  		* @param e Object
  		*/
  @JSName("onGesture")
  var onGesture_IItemHighlight: js.UndefOr[
    js.Function3[
      /* series */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IItemHighlight {
  @scala.inline
  def apply(): IItemHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItemHighlight]
  }
  @scala.inline
  implicit class IItemHighlightOps[Self <: IItemHighlight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnGesture(
      value: (/* series */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnGesture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGesture")(js.undefined)
        ret
    }
  }
  
}

