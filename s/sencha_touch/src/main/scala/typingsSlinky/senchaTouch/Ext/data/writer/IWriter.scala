package typingsSlinky.senchaTouch.Ext.data.writer

import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriter extends IBase {
  /** [Method] Returns the value of nameProperty
  		* @returns String
  		*/
  var getNameProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Formats the data for each record before sending it to the server
  		* @param record Object The record that we are writing to the server.
  		* @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
  		*/
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of writeAllFields
  		* @returns Boolean
  		*/
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.native
  /** [Method] Sets the value of nameProperty
  		* @param nameProperty String The new value.
  		*/
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of writeAllFields
  		* @param writeAllFields Boolean The new value.
  		*/
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Prepares a Proxy s Ext data Request object
  		* @param request Ext.data.Request The request object.
  		* @returns Ext.data.Request The modified request object.
  		*/
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.native
}

object IWriter {
  @scala.inline
  def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  @scala.inline
  implicit class IWriterOps[Self <: IWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNameProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNameProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNameProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNameProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRecordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRecordData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWriteAllFields(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriteAllFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWriteAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriteAllFields")(js.undefined)
        ret
    }
    @scala.inline
    def withNameProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNameProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNameProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNameProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriteAllFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWriteAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriteAllFields")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteAllFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAllFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteAllFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAllFields")(js.undefined)
        ret
    }
  }
  
}

