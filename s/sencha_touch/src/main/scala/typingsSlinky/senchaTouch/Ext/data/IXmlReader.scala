package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlReader
  extends typingsSlinky.senchaTouch.Ext.data.reader.IReader {
  /** [Method] Normalizes the data object
  		* @param data Object The raw data object.
  		* @returns Object Returns the documentElement property of the data object if present, or the same object if not.
  		*/
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
}

object IXmlReader {
  @scala.inline
  def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  @scala.inline
  implicit class IXmlReaderOps[Self <: IXmlReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetData(value: /* data */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
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
  }
  
}

