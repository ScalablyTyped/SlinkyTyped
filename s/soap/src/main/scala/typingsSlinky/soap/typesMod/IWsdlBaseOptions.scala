package typingsSlinky.soap.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.soap.anon.Namespace
import typingsSlinky.soap.anon.Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWsdlBaseOptions extends js.Object {
  var attributesKey: js.UndefOr[String] = js.native
  /** escape special XML characters in SOAP message (e.g. &, >, < etc), default: true. */
  var escapeXML: js.UndefOr[Boolean] = js.native
  /** set proper headers for SOAP v1.2. */
  var forceSoap12Headers: js.UndefOr[Boolean] = js.native
  var handleNilAsNull: js.UndefOr[Boolean] = js.native
  var ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.native
  var ignoredNamespaces: js.UndefOr[Boolean | js.Array[String] | Namespaces] = js.native
  /** provides support for nonstandard array semantics. If true, JSON arrays of the form {list: [{elem: 1}, {elem: 2}]} are marshalled into xml as <list><elem>1</elem></list> <list><elem>2</elem></list>. If false, marshalls into <list> <elem>1</elem> <elem>2</elem> </list>. Default: true. */
  var namespaceArrayElements: js.UndefOr[Boolean] = js.native
  /** if your wsdl operations contains names with non identifier characters ([^a-z$_0-9]), replace them with _. Note: if using this option, clients using wsdls with two operations like soap:method and soap-method will be overwritten. Then, use bracket notation instead (client['soap:method']()). */
  var normalizeNames: js.UndefOr[Boolean] = js.native
  var overrideRootElement: js.UndefOr[Namespace] = js.native
  /** to preserve leading and trailing whitespace characters in text and cdata. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  /** return an Invalid XML SOAP fault on a bad request, default: false. */
  var returnFault: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var useEmptyTag: js.UndefOr[Boolean] = js.native
  var valueKey: js.UndefOr[String] = js.native
  /** custom HTTP headers to be sent on WSDL requests. */
  var wsdl_headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** custom options for the request module on WSDL requests. */
  var wsdl_options: js.UndefOr[StringDictionary[js.Any]] = js.native
  var xmlKey: js.UndefOr[String] = js.native
}

object IWsdlBaseOptions {
  @scala.inline
  def apply(): IWsdlBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWsdlBaseOptions]
  }
  @scala.inline
  implicit class IWsdlBaseOptionsOps[Self <: IWsdlBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributesKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributesKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributesKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeXML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeXML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeXML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeXML")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSoap12Headers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSoap12Headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSoap12Headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSoap12Headers")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleNilAsNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNilAsNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleNilAsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNilAsNull")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreBaseNameSpaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBaseNameSpaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreBaseNameSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBaseNameSpaces")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoredNamespaces(value: Boolean | js.Array[String] | Namespaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoredNamespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoredNamespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceArrayElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArrayElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceArrayElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceArrayElements")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideRootElement(value: Namespace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRootElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideRootElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRootElement")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFault")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEmptyTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmptyTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEmptyTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmptyTag")(js.undefined)
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
    def withWsdl_headers(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsdl_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsdl_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsdl_headers")(js.undefined)
        ret
    }
    @scala.inline
    def withWsdl_options(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsdl_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsdl_options: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsdl_options")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlKey")(js.undefined)
        ret
    }
  }
  
}

