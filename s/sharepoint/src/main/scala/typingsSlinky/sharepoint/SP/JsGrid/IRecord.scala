package typingsSlinky.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IRecord extends js.Object {
  /** True if this is an entry row */
  var bIsNewRow: Boolean = js.native
  /** Please use SetProp and GetProp */
  var properties: StringDictionary[IPropertyBase] = js.native
  /** Update the specified field with the specified value */
  def AddFieldValue(fieldKey: String, value: js.Any): Unit = js.native
  /** returns raw data value for the specified field */
  def GetDataValue(fieldKey: String): js.Any = js.native
  /** returns localized text value for the specified field */
  def GetLocalizedValue(fieldKey: String): String = js.native
  def GetProp(fieldKey: String): IPropertyBase = js.native
  /** returns true if data value for the specified field is available */
  def HasDataValue(fieldKey: String): Boolean = js.native
  /** returns true if localized text value for the specified field is available */
  def HasLocalizedValue(fieldKey: String): Boolean = js.native
  /** Removes value of the specified field.
    Does not refresh the view. */
  def RemoveFieldValue(fieldKey: String): Unit = js.native
  def SetProp(fieldKey: String, prop: IPropertyBase): Unit = js.native
  /** returns recordKey */
  def key(): Double = js.native
}

object IRecord {
  @scala.inline
  def apply(
    AddFieldValue: (String, js.Any) => Unit,
    GetDataValue: String => js.Any,
    GetLocalizedValue: String => String,
    GetProp: String => IPropertyBase,
    HasDataValue: String => Boolean,
    HasLocalizedValue: String => Boolean,
    RemoveFieldValue: String => Unit,
    SetProp: (String, IPropertyBase) => Unit,
    bIsNewRow: Boolean,
    key: () => Double,
    properties: StringDictionary[IPropertyBase]
  ): IRecord = {
    val __obj = js.Dynamic.literal(AddFieldValue = js.Any.fromFunction2(AddFieldValue), GetDataValue = js.Any.fromFunction1(GetDataValue), GetLocalizedValue = js.Any.fromFunction1(GetLocalizedValue), GetProp = js.Any.fromFunction1(GetProp), HasDataValue = js.Any.fromFunction1(HasDataValue), HasLocalizedValue = js.Any.fromFunction1(HasLocalizedValue), RemoveFieldValue = js.Any.fromFunction1(RemoveFieldValue), SetProp = js.Any.fromFunction2(SetProp), bIsNewRow = bIsNewRow.asInstanceOf[js.Any], key = js.Any.fromFunction0(key), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRecord]
  }
  @scala.inline
  implicit class IRecordOps[Self <: IRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFieldValue(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddFieldValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDataValue(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDataValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLocalizedValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLocalizedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetProp(value: String => IPropertyBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetProp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasDataValue(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasDataValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasLocalizedValue(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasLocalizedValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveFieldValue(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveFieldValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetProp(value: (String, IPropertyBase) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetProp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBIsNewRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bIsNewRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[IPropertyBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

