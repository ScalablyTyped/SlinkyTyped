package typingsSlinky.senchaTouch.Ext.data.reader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJson extends IReader {
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of useSimpleAccessors
  		* @returns Boolean
  		*/
  var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of useSimpleAccessors
  		* @param useSimpleAccessors Boolean The new value.
  		*/
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.native
}

object IJson {
  @scala.inline
  def apply(): IJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJson]
  }
  @scala.inline
  implicit class IJsonOps[Self <: IJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRecord(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUseSimpleAccessors(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseSimpleAccessors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUseSimpleAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUseSimpleAccessors")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUseSimpleAccessors(value: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseSimpleAccessors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUseSimpleAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUseSimpleAccessors")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSimpleAccessors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleAccessors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSimpleAccessors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSimpleAccessors")(js.undefined)
        ret
    }
  }
  
}

