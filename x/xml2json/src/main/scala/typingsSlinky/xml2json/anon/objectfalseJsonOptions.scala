package typingsSlinky.xml2json.anon

import typingsSlinky.xml2json.xml2jsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  object ? :false} & xml2json.xml2json.JsonOptions */
@js.native
trait objectfalseJsonOptions extends js.Object {
  /**
    * Changes the default textNode property from $t to _t when option is set to true.
    * Alternatively a string can be specified which will override $t to what ever the string is.
    */
  var alternateTextNode: js.UndefOr[Boolean] = js.native
  /**
    * XML child nodes are always treated as arrays.
    * You can specify a selective array of nodes for this to apply to instead of the whole document.
    */
  var arrayNotation: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Makes type coercion.
    * i.e.: numbers and booleans present in attributes and element values are converted from string to its correspondent data types.
    * Coerce can be optionally defined as an object with specific methods of coercion based on attribute name or tag name, with fallback to default coercion.
    */
  var coerce: js.UndefOr[Boolean] = js.native
  var `object`: js.UndefOr[`false`] = js.native
  /**
    * Returns a Javascript object instead of a JSON string.
    */
  // object?: boolean; // This is now overloaded in the toJson method
  /**
    * Makes the JSON reversible to XML.
    * xml2json tranforms CDATA content to JSON, but it doesn't generate a reversible structure.
    */
  var reversible: js.UndefOr[Boolean] = js.native
  /**
    * Sanitizes the following characters present in element values (default true):
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
  /**
    * Removes leading and trailing whitespaces as well as line terminators in element values.
    * Defaults to true.
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object objectfalseJsonOptions {
  @scala.inline
  def apply(): objectfalseJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[objectfalseJsonOptions]
  }
  @scala.inline
  implicit class objectfalseJsonOptionsOps[Self <: objectfalseJsonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateTextNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateTextNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateTextNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateTextNode")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayNotation(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCoerce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coerce")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withReversible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversible")(js.undefined)
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
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

