package typingsSlinky.senchaTouch.Ext.viewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWP extends IDefault {
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.native
}

object IWP {
  @scala.inline
  def apply(): IWP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWP]
  }
  @scala.inline
  implicit class IWPOps[Self <: IWP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTranslatable(value: () => _): Self = {
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
    def withSetTranslatable(value: /* translatable */ js.UndefOr[js.Any] => Unit): Self = {
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

