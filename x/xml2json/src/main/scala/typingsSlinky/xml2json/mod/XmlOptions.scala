package typingsSlinky.xml2json.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlOptions extends js.Object {
  /**
    * Ignores all null values.
    */
  var ignoreNull: js.UndefOr[Boolean] = js.native
  /**
    * Sanitizes the following characters present in element values (default false):
    * @example
    * var chars =  {
    * '<': '&lt;',
    * '>': '&gt;',
    * '(': '&#40;',
    * ')': '&#41;',
    * '#': '&#35;',
    * '&': '&amp;',
    * '"': '&quot;',
    * "'": '&apos;'
    * };
    * @example
    */
  var sanitize: js.UndefOr[Boolean] = js.native
}

object XmlOptions {
  @scala.inline
  def apply(): XmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlOptions]
  }
  @scala.inline
  implicit class XmlOptionsOps[Self <: XmlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNull")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
  }
  
}

