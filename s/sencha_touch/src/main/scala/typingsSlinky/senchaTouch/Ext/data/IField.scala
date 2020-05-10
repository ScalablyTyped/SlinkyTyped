package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IBase {
  /** [Config Option] (Boolean) */
  var allowNull: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var convert: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var dateFormat: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of allowNull
  		* @returns Boolean
  		*/
  var getAllowNull: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of bubbleEvents
  		* @returns String
  		*/
  var getBubbleEvents: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of convert
  		* @returns Function
  		*/
  var getConvert: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of dateFormat
  		* @returns String
  		*/
  var getDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of decode
  		* @returns Object
  		*/
  var getDecode: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of defaultValue
  		* @returns Object
  		*/
  var getDefaultValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of encode
  		* @returns Object
  		*/
  var getEncode: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of mapping
  		* @returns String/Number
  		*/
  var getMapping: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of persist
  		* @returns Boolean
  		*/
  var getPersist: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of sortDir
  		* @returns String
  		*/
  var getSortDir: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of sortType
  		* @returns Function
  		*/
  var getSortType: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of type
  		* @returns String/Object
  		*/
  var getType: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/Number) */
  var mapping: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var persist: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of allowNull
  		* @param allowNull Boolean The new value.
  		*/
  var setAllowNull: js.UndefOr[js.Function1[/* allowNull */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String The new value.
  		*/
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of convert
  		* @param convert Function The new value.
  		*/
  var setConvert: js.UndefOr[js.Function1[/* convert */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of dateFormat
  		* @param dateFormat String The new value.
  		*/
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of decode
  		* @param decode Object The new value.
  		*/
  var setDecode: js.UndefOr[js.Function1[/* decode */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of defaultValue
  		* @param defaultValue Object The new value.
  		*/
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of encode
  		* @param encode Object The new value.
  		*/
  var setEncode: js.UndefOr[js.Function1[/* encode */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of mapping
  		* @param mapping String/Number The new value.
  		*/
  var setMapping: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of persist
  		* @param persist Boolean The new value.
  		*/
  var setPersist: js.UndefOr[js.Function1[/* persist */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of sortDir
  		* @param sortDir String The new value.
  		*/
  var setSortDir: js.UndefOr[js.Function1[/* sortDir */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sortType
  		* @param sortType Function The new value.
  		*/
  var setSortType: js.UndefOr[js.Function1[/* sortType */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of type
  		* @param type String/Object The new value.
  		*/
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var sortDir: js.UndefOr[String] = js.native
  /** [Config Option] (Function) */
  var sortType: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String/Object) */
  var `type`: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var useNull: js.UndefOr[Boolean] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNull")(js.undefined)
        ret
    }
    @scala.inline
    def withConvert(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllowNull(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowNull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllowNull")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBubbleEvents(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConvert(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConvert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConvert")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDateFormat(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDecode(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEncode(value: () => _): Self = {
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
    def withGetMapping(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMapping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPersist(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersist")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortDir(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortDir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortDir")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortType(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortType")(js.undefined)
        ret
    }
    @scala.inline
    def withGetType(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getType")(js.undefined)
        ret
    }
    @scala.inline
    def withMapping(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapping")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPersist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAllowNull(value: /* allowNull */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowNull")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAllowNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAllowNull")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSetConvert(value: /* convert */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConvert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetConvert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setConvert")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDateFormat(value: /* dateFormat */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDecode(value: /* decode */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDecode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDecode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultValue(value: /* defaultValue */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEncode(value: /* encode */ js.UndefOr[js.Any] => Unit): Self = {
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
    def withSetMapping(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPersist(value: /* persist */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPersist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPersist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPersist")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSortDir(value: /* sortDir */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortDir")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSortDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSortType(value: /* sortType */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSortType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSortType")(js.undefined)
        ret
    }
    @scala.inline
    def withSetType(value: /* type */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setType")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSortType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNull")(js.undefined)
        ret
    }
  }
  
}

