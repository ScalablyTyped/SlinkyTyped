package typingsSlinky.senchaTouch.Ext.carousel

import typingsSlinky.senchaTouch.Ext.IDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItem extends IDecorator {
  /** [Method] Returns the value of translatable
  		* @returns Boolean
  		*/
  var getTranslatable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of translatable
  		* @param translatable Boolean The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Boolean], Unit]] = js.native
}

object IItem {
  @scala.inline
  def apply(): IItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IItem]
  }
  @scala.inline
  implicit class IItemOps[Self <: IItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTranslatable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTranslatable(value: /* translatable */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.undefined)
        ret
    }
  }
  
}

