package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILimitedCache extends IBase {
  /** [Method] Clear all the objects  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var feeder: js.UndefOr[js.Any] = js.native
  /** [Method] Get a cached object
  		* @param id String
  		* @param args Mixed... Arguments appended to feeder.
  		* @returns Object
  		*/
  var get: js.UndefOr[js.Function2[/* id */ String, /* repeated */ js.Any, _]] = js.native
  /** [Method] Returns the value of feeder
  		* @returns Function
  		*/
  var getFeeder: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of limit
  		* @returns Number
  		*/
  var getLimit: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var limit: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of feeder
  		* @param feeder Function The new value.
  		* @returns Number
  		*/
  var setFeeder: js.UndefOr[js.Function1[/* feeder */ js.UndefOr[js.Any], Double]] = js.native
  /** [Method] Sets the value of limit
  		* @param limit Number The new value.
  		*/
  var setLimit: js.UndefOr[js.Function1[/* limit */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}

object ILimitedCache {
  @scala.inline
  def apply(): ILimitedCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILimitedCache]
  }
  @scala.inline
  implicit class ILimitedCacheOps[Self <: ILimitedCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withFeeder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feeder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeeder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feeder")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* id */ String, /* repeated */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFeeder(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeeder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFeeder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeeder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFeeder(value: /* feeder */ js.UndefOr[js.Any] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFeeder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFeeder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFeeder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLimit(value: /* limit */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
  }
  
}

