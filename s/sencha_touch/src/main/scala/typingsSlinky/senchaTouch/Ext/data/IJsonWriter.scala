package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJsonWriter
  extends typingsSlinky.senchaTouch.Ext.data.writer.IWriter {
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of allowSingle
  		* @returns Boolean
  		*/
  var getAllowSingle: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of encode
  		* @returns Boolean
  		*/
  var getEncode: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of encodeRequest
  		* @returns Boolean
  		*/
  var getEncodeRequest: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of rootProperty
  		* @returns String
  		*/
  var getRootProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var rootProperty: js.UndefOr[String] = js.native
  /** [Method] Sets the value of allowSingle
  		* @param allowSingle Boolean The new value.
  		*/
  var setAllowSingle: js.UndefOr[js.Function1[/* allowSingle */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of encode
  		* @param encode Boolean The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of encodeRequest
  		* @param encodeRequest Boolean The new value.
  		*/
  var setEncodeRequest: js.UndefOr[js.Function1[/* encodeRequest */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of rootProperty
  		* @param rootProperty String The new value.
  		*/
  var setRootProperty: js.UndefOr[js.Function1[/* rootProperty */ js.UndefOr[String], Unit]] = js.native
}

object IJsonWriter {
  @scala.inline
  def apply(): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonWriter]
  }
  @scala.inline
  implicit class IJsonWriterOps[Self <: IJsonWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowSingle(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowSingle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEncode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEncodeRequest(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncodeRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEncodeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncodeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowSingle(value: /* allowSingle */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowSingle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowSingle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEncode(value: /* encode */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEncodeRequest(value: /* encodeRequest */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncodeRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEncodeRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEncodeRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootProperty(value: /* rootProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootProperty")(js.undefined)
        ret
    }
  }
  
}

