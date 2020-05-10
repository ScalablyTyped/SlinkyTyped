package typingsSlinky.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICube extends IAbstract {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
}

object ICube {
  @scala.inline
  def apply(): ICube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICube]
  }
  @scala.inline
  implicit class ICubeOps[Self <: ICube] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOut(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOut")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOut(value: /* out */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOut")(js.undefined)
        ret
    }
  }
  
}

