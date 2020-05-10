package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMask extends IComponent {
  /** [Method] Returns the value of transparent
  		* @returns Boolean
  		*/
  var getTransparent: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of transparent
  		* @param transparent Boolean The new value.
  		*/
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
}

object IMask {
  @scala.inline
  def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  @scala.inline
  implicit class IMaskOps[Self <: IMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTransparent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransparent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransparent(value: /* transparent */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransparent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransparent")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
  }
  
}

