package typingsSlinky.sharepoint.SP.JsGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait IPropertyBase extends js.Object {
  def Clone(): IPropertyBase = js.native
  def GetData(): js.Any = js.native
  def GetLocalized(): String = js.native
  def HasDataValue(): Boolean = js.native
  def HasLocalizedValue(): Boolean = js.native
  /** dataValue actually is cloned */
  def Update(dataValue: js.Any, localizedValue: String): Unit = js.native
}

object IPropertyBase {
  @scala.inline
  def apply(
    Clone: () => IPropertyBase,
    GetData: () => js.Any,
    GetLocalized: () => String,
    HasDataValue: () => Boolean,
    HasLocalizedValue: () => Boolean,
    Update: (js.Any, String) => Unit
  ): IPropertyBase = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetData = js.Any.fromFunction0(GetData), GetLocalized = js.Any.fromFunction0(GetLocalized), HasDataValue = js.Any.fromFunction0(HasDataValue), HasLocalizedValue = js.Any.fromFunction0(HasLocalizedValue), Update = js.Any.fromFunction2(Update))
    __obj.asInstanceOf[IPropertyBase]
  }
  @scala.inline
  implicit class IPropertyBaseOps[Self <: IPropertyBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IPropertyBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLocalized(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLocalized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasDataValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasDataValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLocalizedValue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasLocalizedValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

