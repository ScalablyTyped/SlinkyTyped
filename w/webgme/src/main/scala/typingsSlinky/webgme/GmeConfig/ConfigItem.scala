package typingsSlinky.webgme.GmeConfig

import typingsSlinky.webgme.GmeCommon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigItem extends js.Object {
  // a detailed description fo the item
  var description: String = js.native
  // a human comprehensible name
  var displayName: String = js.native
  // a unique name for the configuration item
  var name: Name = js.native
  // can the value be changed?
  var readOnly: js.UndefOr[Boolean] = js.native
  // a regular expression limiting the values allowed.
  // e.g. '^[a-zA-Z]+$'
  var regex: js.UndefOr[js.RegExp] = js.native
  // a description of the regex grammar
  // e.g. 'Name can only contain English characters!'
  var regexMessage: js.UndefOr[String] = js.native
  // the value of the item: if valueItem is provided it must be one of those values.
  var value: String = js.native
  // an enumeration of the allowed values for the value field
  var valueItems: js.UndefOr[js.Array[String]] = js.native
  // the datatype of the value: 'string', 'integer', ...
  var valueType: String = js.native
}

object ConfigItem {
  @scala.inline
  def apply(description: String, displayName: String, name: Name, value: String, valueType: String): ConfigItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
  @scala.inline
  implicit class ConfigItemOps[Self <: ConfigItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValueItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueItems")(js.undefined)
        ret
    }
  }
  
}

