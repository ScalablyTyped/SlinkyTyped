package typingsSlinky.senchaTouch.Ext.data.writer

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXml extends IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.native
  /** [Method] Returns the value of defaultDocumentRoot
  		* @returns String
  		*/
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of documentRoot
  		* @returns String
  		*/
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of header
  		* @returns String
  		*/
  var getHeader: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Method] Sets the value of defaultDocumentRoot
  		* @param defaultDocumentRoot String The new value.
  		*/
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of documentRoot
  		* @param documentRoot String The new value.
  		*/
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of header
  		* @param header String The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  /** [Method]
  		* @param request Object
  		* @param data Array
  		* @returns Object
  		*/
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array], _]] = js.native
}

object IXml {
  @scala.inline
  def apply(): IXml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXml]
  }
  @scala.inline
  implicit class IXmlOps[Self <: IXml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultDocumentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDocumentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultDocumentRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDocumentRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDocumentRoot(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeader(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.undefined)
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
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
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
    def withSetDefaultDocumentRoot(value: /* defaultDocumentRoot */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDocumentRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDocumentRoot(value: /* documentRoot */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocumentRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDocumentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDocumentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeader(value: /* header */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.undefined)
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
    def withWriteRecords(value: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRecords")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWriteRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeRecords")(js.undefined)
        ret
    }
  }
  
}

