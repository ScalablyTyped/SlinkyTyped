package typingsSlinky.senchaTouch.Ext.event.recognizer

import typingsSlinky.senchaTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecognizer extends IIdentifiable {
  /** [Method] Returns the value of callbackScope
  		* @returns Object
  		*/
  var getCallbackScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IRecognizer: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of onFailed
  		* @returns Object
  		*/
  var getOnFailed: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of onRecognized
  		* @returns Object
  		*/
  var getOnRecognized: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of callbackScope
  		* @param callbackScope Object The new value.
  		*/
  var setCallbackScope: js.UndefOr[js.Function1[/* callbackScope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onFailed
  		* @param onFailed Object The new value.
  		*/
  var setOnFailed: js.UndefOr[js.Function1[/* onFailed */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onRecognized
  		* @param onRecognized Object The new value.
  		*/
  var setOnRecognized: js.UndefOr[js.Function1[/* onRecognized */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRecognizer {
  @scala.inline
  def apply(): IRecognizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecognizer]
  }
  @scala.inline
  implicit class IRecognizerOps[Self <: IRecognizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCallbackScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnFailed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnFailed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnRecognized(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnRecognized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnRecognized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnRecognized")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCallbackScope(value: /* callbackScope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallbackScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCallbackScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCallbackScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnFailed(value: /* onFailed */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnRecognized(value: /* onRecognized */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnRecognized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnRecognized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnRecognized")(js.undefined)
        ret
    }
  }
  
}

