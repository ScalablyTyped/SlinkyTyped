package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Encoding API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
  */
@js.native
trait Encoding extends js.Object {
  /**
    * Applies attribute encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlAttributeEncode(arg: String): String = js.native
  /**
    * Applies XML encoding to a string.
    * @param arg String to be encoded.
    * @returns Encoded string.
    */
  def xmlEncode(arg: String): String = js.native
}

object Encoding {
  @scala.inline
  def apply(xmlAttributeEncode: String => String, xmlEncode: String => String): Encoding = {
    val __obj = js.Dynamic.literal(xmlAttributeEncode = js.Any.fromFunction1(xmlAttributeEncode), xmlEncode = js.Any.fromFunction1(xmlEncode))
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmlAttributeEncode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlAttributeEncode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXmlEncode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlEncode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

