package typingsSlinky.xmltojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attrKey: js.UndefOr[String] = js.native
  var attrsAsObject: js.UndefOr[Boolean] = js.native
  var cdataKey: js.UndefOr[String] = js.native
  var childrenAsArray: js.UndefOr[Boolean] = js.native
  var grokAttr: js.UndefOr[Boolean] = js.native
  var grokText: js.UndefOr[Boolean] = js.native
  var mergeCDATA: js.UndefOr[Boolean] = js.native
  var namespaceKey: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var stripAttrPrefix: js.UndefOr[Boolean] = js.native
  var stripElemPrefix: js.UndefOr[Boolean] = js.native
  var textKey: js.UndefOr[String] = js.native
  var valueKey: js.UndefOr[String] = js.native
  var xmlns: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrsAsObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsAsObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrsAsObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrsAsObject")(js.undefined)
        ret
    }
    @scala.inline
    def withCdataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdataKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdataKey")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenAsArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenAsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenAsArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenAsArray")(js.undefined)
        ret
    }
    @scala.inline
    def withGrokAttr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokAttr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrokAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withGrokText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrokText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grokText")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCDATA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCDATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCDATA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCDATA")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withStripAttrPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripAttrPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripAttrPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripAttrPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStripElemPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripElemPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripElemPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripElemPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTextKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textKey")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlns")(js.undefined)
        ret
    }
  }
  
}

