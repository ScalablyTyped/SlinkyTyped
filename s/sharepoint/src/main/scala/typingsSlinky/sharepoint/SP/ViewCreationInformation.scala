package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCreationInformation extends ClientValueObject {
  def get_paged(): Boolean = js.native
  def get_personalView(): Boolean = js.native
  def get_query(): String = js.native
  def get_rowLimit(): Double = js.native
  def get_setAsDefaultView(): Boolean = js.native
  def get_title(): String = js.native
  def get_viewFields(): js.Array[String] = js.native
  def get_viewTypeKind(): ViewType = js.native
  def set_paged(value: Boolean): Unit = js.native
  def set_personalView(value: Boolean): Unit = js.native
  def set_query(value: String): Unit = js.native
  def set_rowLimit(value: Double): Unit = js.native
  def set_setAsDefaultView(value: Boolean): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_viewFields(value: js.Array[String]): Unit = js.native
  def set_viewTypeKind(value: ViewType): Unit = js.native
}

object ViewCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_paged: () => Boolean,
    get_personalView: () => Boolean,
    get_query: () => String,
    get_rowLimit: () => Double,
    get_setAsDefaultView: () => Boolean,
    get_title: () => String,
    get_typeId: () => String,
    get_viewFields: () => js.Array[String],
    get_viewTypeKind: () => ViewType,
    set_paged: Boolean => Unit,
    set_personalView: Boolean => Unit,
    set_query: String => Unit,
    set_rowLimit: Double => Unit,
    set_setAsDefaultView: Boolean => Unit,
    set_title: String => Unit,
    set_viewFields: js.Array[String] => Unit,
    set_viewTypeKind: ViewType => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ViewCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_paged = js.Any.fromFunction0(get_paged), get_personalView = js.Any.fromFunction0(get_personalView), get_query = js.Any.fromFunction0(get_query), get_rowLimit = js.Any.fromFunction0(get_rowLimit), get_setAsDefaultView = js.Any.fromFunction0(get_setAsDefaultView), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), get_viewFields = js.Any.fromFunction0(get_viewFields), get_viewTypeKind = js.Any.fromFunction0(get_viewTypeKind), set_paged = js.Any.fromFunction1(set_paged), set_personalView = js.Any.fromFunction1(set_personalView), set_query = js.Any.fromFunction1(set_query), set_rowLimit = js.Any.fromFunction1(set_rowLimit), set_setAsDefaultView = js.Any.fromFunction1(set_setAsDefaultView), set_title = js.Any.fromFunction1(set_title), set_viewFields = js.Any.fromFunction1(set_viewFields), set_viewTypeKind = js.Any.fromFunction1(set_viewTypeKind), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ViewCreationInformation]
  }
  @scala.inline
  implicit class ViewCreationInformationOps[Self <: ViewCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_paged(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_paged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_personalView(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_personalView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_query(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_rowLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_rowLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_setAsDefaultView(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_setAsDefaultView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_title(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_viewFields(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_viewFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_viewTypeKind(value: () => ViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_viewTypeKind")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_paged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_paged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_personalView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_personalView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_query(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_rowLimit(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_rowLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_setAsDefaultView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_setAsDefaultView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_title(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_viewFields(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_viewFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_viewTypeKind(value: ViewType => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_viewTypeKind")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

