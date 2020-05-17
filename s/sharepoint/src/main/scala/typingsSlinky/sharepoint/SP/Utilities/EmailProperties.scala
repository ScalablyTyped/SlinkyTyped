package typingsSlinky.sharepoint.SP.Utilities

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailProperties extends ClientValueObject {
  def get_additionalHeaders(): js.Any = js.native
  def get_bCC(): js.Array[String] = js.native
  def get_body(): String = js.native
  def get_cC(): js.Array[String] = js.native
  def get_from(): String = js.native
  def get_subject(): String = js.native
  def get_to(): js.Array[String] = js.native
  def set_additionalHeaders(value: js.Any): Unit = js.native
  def set_bCC(value: js.Array[String]): Unit = js.native
  def set_body(value: String): Unit = js.native
  def set_cC(value: js.Array[String]): Unit = js.native
  def set_from(value: String): Unit = js.native
  def set_subject(value: String): Unit = js.native
  def set_to(value: js.Array[String]): Unit = js.native
}

object EmailProperties {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_additionalHeaders: () => js.Any,
    get_bCC: () => js.Array[String],
    get_body: () => String,
    get_cC: () => js.Array[String],
    get_from: () => String,
    get_subject: () => String,
    get_to: () => js.Array[String],
    get_typeId: () => String,
    set_additionalHeaders: js.Any => Unit,
    set_bCC: js.Array[String] => Unit,
    set_body: String => Unit,
    set_cC: js.Array[String] => Unit,
    set_from: String => Unit,
    set_subject: String => Unit,
    set_to: js.Array[String] => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): EmailProperties = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_additionalHeaders = js.Any.fromFunction0(get_additionalHeaders), get_bCC = js.Any.fromFunction0(get_bCC), get_body = js.Any.fromFunction0(get_body), get_cC = js.Any.fromFunction0(get_cC), get_from = js.Any.fromFunction0(get_from), get_subject = js.Any.fromFunction0(get_subject), get_to = js.Any.fromFunction0(get_to), get_typeId = js.Any.fromFunction0(get_typeId), set_additionalHeaders = js.Any.fromFunction1(set_additionalHeaders), set_bCC = js.Any.fromFunction1(set_bCC), set_body = js.Any.fromFunction1(set_body), set_cC = js.Any.fromFunction1(set_cC), set_from = js.Any.fromFunction1(set_from), set_subject = js.Any.fromFunction1(set_subject), set_to = js.Any.fromFunction1(set_to), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[EmailProperties]
  }
  @scala.inline
  implicit class EmailPropertiesOps[Self <: EmailProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_additionalHeaders(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_additionalHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_bCC(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_bCC")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_body(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_body")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_cC(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_cC")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_from(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_from")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_subject(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_subject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_to(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_to")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_additionalHeaders(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_additionalHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_bCC(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_bCC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_body(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_body")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_cC(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_cC")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_from(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_subject(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_subject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_to(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_to")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

