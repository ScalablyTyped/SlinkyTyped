package typingsSlinky.senchaTouch.Ext.fx.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlideIn extends IAbstract {
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.native
  /** [Method] Returns the value of isElementBoxFit
  		* @returns Boolean
  		*/
  var getIsElementBoxFit: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of offset
  		* @returns Number
  		*/
  var getOffset: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of useCssTransform
  		* @returns Boolean
  		*/
  var getUseCssTransform: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Number) */
  var offset: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of containerBox
  		* @param containerBox String The new value.
  		*/
  var setContainerBox: js.UndefOr[js.Function1[/* containerBox */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of elementBox
  		* @param elementBox String The new value.
  		*/
  var setElementBox: js.UndefOr[js.Function1[/* elementBox */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of isElementBoxFit
  		* @param isElementBoxFit Boolean The new value.
  		*/
  var setIsElementBoxFit: js.UndefOr[js.Function1[/* isElementBoxFit */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of offset
  		* @param offset Number The new value.
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of useCssTransform
  		* @param useCssTransform Boolean The new value.
  		*/
  var setUseCssTransform: js.UndefOr[js.Function1[/* useCssTransform */ js.UndefOr[Boolean], Unit]] = js.native
}

object ISlideIn {
  @scala.inline
  def apply(): ISlideIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlideIn]
  }
  @scala.inline
  implicit class ISlideInOps[Self <: ISlideIn] (val x: Self) extends AnyVal {
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
    def withGetIsElementBoxFit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsElementBoxFit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIsElementBoxFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsElementBoxFit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOffset(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffset")(js.undefined)
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
    def withGetUseCssTransform(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCssTransform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseCssTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseCssTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withSetContainerBox(value: /* containerBox */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainerBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetContainerBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainerBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSetElementBox(value: /* elementBox */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElementBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetElementBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElementBox")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIsElementBoxFit(value: /* isElementBoxFit */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsElementBoxFit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIsElementBoxFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsElementBoxFit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOffset(value: /* offset */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.undefined)
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
    @scala.inline
    def withSetUseCssTransform(value: /* useCssTransform */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCssTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseCssTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseCssTransform")(js.undefined)
        ret
    }
  }
  
}

