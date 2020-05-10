package typingsSlinky.senchaTouch.Ext.device.geolocation

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Config Option] (Boolean) */
  var allowHighAccuracy: js.UndefOr[Boolean] = js.native
  /** [Method] If you are currently watching for the current position this will stop that task  */
  var clearWatch: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var frequency: js.UndefOr[Double] = js.native
  /** [Method] Returns the value of allowHighAccuracy
  		* @returns Boolean
  		*/
  var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Attempts to get the current position of this device
  		* @param config Object An object which contains the following config options:
  		*/
  var getCurrentPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns the value of frequency
  		* @returns Number
  		*/
  var getFrequency: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of maximumAge
  		* @returns Number
  		*/
  var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of timeout
  		* @returns Number
  		*/
  var getTimeout: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var maximumAge: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of allowHighAccuracy
  		* @param allowHighAccuracy Boolean The new value.
  		*/
  var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of frequency
  		* @param frequency Number The new value.
  		*/
  var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maximumAge
  		* @param maximumAge Number The new value.
  		*/
  var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of timeout
  		* @param timeout Number The new value.
  		*/
  var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
  		* @param config Object An object which contains the following config options:
  		*/
  var watchPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHighAccuracy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHighAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withClearWatch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWatch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowHighAccuracy(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowHighAccuracy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFrequency(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrequency")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMaximumAge(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximumAge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTimeout(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowHighAccuracy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowHighAccuracy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowHighAccuracy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrequency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximumAge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMaximumAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaximumAge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWatchPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchPosition")(js.undefined)
        ret
    }
  }
  
}

