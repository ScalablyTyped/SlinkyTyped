package typingsSlinky.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDecryptionTransform extends js.Object {
  var XmlDecryptionTransform: String = js.native
  var XmlDsigBase64Transform: String = js.native
  var XmlDsigC14NTransform: String = js.native
  var XmlDsigC14NWithCommentsTransform: String = js.native
  var XmlDsigEnvelopedSignatureTransform: String = js.native
  var XmlDsigExcC14NTransform: String = js.native
  var XmlDsigExcC14NWithCommentsTransform: String = js.native
  var XmlDsigXPathTransform: String = js.native
  var XmlDsigXsltTransform: String = js.native
  var XmlLicenseTransform: String = js.native
}

object XmlDecryptionTransform {
  @scala.inline
  def apply(
    XmlDecryptionTransform: String,
    XmlDsigBase64Transform: String,
    XmlDsigC14NTransform: String,
    XmlDsigC14NWithCommentsTransform: String,
    XmlDsigEnvelopedSignatureTransform: String,
    XmlDsigExcC14NTransform: String,
    XmlDsigExcC14NWithCommentsTransform: String,
    XmlDsigXPathTransform: String,
    XmlDsigXsltTransform: String,
    XmlLicenseTransform: String
  ): XmlDecryptionTransform = {
    val __obj = js.Dynamic.literal(XmlDecryptionTransform = XmlDecryptionTransform.asInstanceOf[js.Any], XmlDsigBase64Transform = XmlDsigBase64Transform.asInstanceOf[js.Any], XmlDsigC14NTransform = XmlDsigC14NTransform.asInstanceOf[js.Any], XmlDsigC14NWithCommentsTransform = XmlDsigC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigEnvelopedSignatureTransform = XmlDsigEnvelopedSignatureTransform.asInstanceOf[js.Any], XmlDsigExcC14NTransform = XmlDsigExcC14NTransform.asInstanceOf[js.Any], XmlDsigExcC14NWithCommentsTransform = XmlDsigExcC14NWithCommentsTransform.asInstanceOf[js.Any], XmlDsigXPathTransform = XmlDsigXPathTransform.asInstanceOf[js.Any], XmlDsigXsltTransform = XmlDsigXsltTransform.asInstanceOf[js.Any], XmlLicenseTransform = XmlLicenseTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlDecryptionTransform]
  }
  @scala.inline
  implicit class XmlDecryptionTransformOps[Self <: XmlDecryptionTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXmlDecryptionTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDecryptionTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigBase64Transform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigBase64Transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigC14NTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigC14NTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigC14NWithCommentsTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigC14NWithCommentsTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigEnvelopedSignatureTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigEnvelopedSignatureTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigExcC14NTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigExcC14NTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigExcC14NWithCommentsTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigExcC14NWithCommentsTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigXPathTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigXPathTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlDsigXsltTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlDsigXsltTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlLicenseTransform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XmlLicenseTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

