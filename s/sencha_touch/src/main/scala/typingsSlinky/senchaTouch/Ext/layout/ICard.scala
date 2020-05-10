package typingsSlinky.senchaTouch.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICard extends IDefault {
  /** [Method]
  		* @param item Object
  		* @param isInner Object
  		* @param destroying Object
  		*/
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_ICard: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* isInner */ js.UndefOr[js.Any], 
      /* destroying */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object ICard {
  @scala.inline
  def apply(): ICard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICard]
  }
  @scala.inline
  implicit class ICardOps[Self <: ICard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnItemInnerStateChange(
      value: (/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], /* destroying */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInnerStateChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemInnerStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInnerStateChange")(js.undefined)
        ret
    }
  }
  
}

