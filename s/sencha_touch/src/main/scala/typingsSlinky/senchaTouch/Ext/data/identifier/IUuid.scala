package typingsSlinky.senchaTouch.Ext.data.identifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUuid extends ISimple {
  /** [Method] Returns the value of id
  		* @returns Object
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of version
  		* @returns Number
  		*/
  var getVersion: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Object) */
  var id: js.UndefOr[js.Any] = js.native
  /** [Method] Reconfigures this generator given new config properties
  		* @param config Object
  		*/
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of id
  		* @param id Object The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of version
  		* @param version Number The new value.
  		*/
  var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[Double], Unit]] = js.native
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.native
}

object IUuid {
  @scala.inline
  def apply(): IUuid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUuid]
  }
  @scala.inline
  implicit class IUuidOps[Self <: IUuid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => _): Self = {
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
    def withGetVersion(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withReconfigure(value: /* config */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReconfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconfigure")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withSetId(value: /* id */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetVersion(value: /* version */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

