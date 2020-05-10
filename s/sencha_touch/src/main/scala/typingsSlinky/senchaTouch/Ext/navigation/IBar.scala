package typingsSlinky.senchaTouch.Ext.navigation

import typingsSlinky.senchaTouch.Ext.ITitleBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends ITitleBar {
  /** [Config Option] (Boolean) */
  var androidAnimation: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IBar: js.UndefOr[String] = js.native
  /** [Method] Returns the value of androidAnimation
  		* @returns Boolean
  		*/
  var getAndroidAnimation: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of androidAnimation
  		* @param androidAnimation Boolean The new value.
  		*/
  var setAndroidAnimation: js.UndefOr[js.Function1[/* androidAnimation */ js.UndefOr[Boolean], Unit]] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAndroidAnimation(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAndroidAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAndroidAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAndroidAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAndroidAnimation(value: /* androidAnimation */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAndroidAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAndroidAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAndroidAnimation")(js.undefined)
        ret
    }
  }
  
}

