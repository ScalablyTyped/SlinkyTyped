package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Copyright extends js.Object {
  var copyright: String = js.native
  var description: String = js.native
  var designer: String = js.native
  var designer_url: String = js.native
  var font_family_name: String = js.native
  var font_sub_family_name: String = js.native
  var full_font_name: String = js.native
  var license_description: String = js.native
  var license_url: String = js.native
  var manufacturer_name: String = js.native
  var postscript_name: String = js.native
  var trademark: String = js.native
  var unique_font_identifier: String = js.native
  var vendor_url: String = js.native
  var version_string: String = js.native
}

object Copyright {
  @scala.inline
  def apply(
    copyright: String,
    description: String,
    designer: String,
    designer_url: String,
    font_family_name: String,
    font_sub_family_name: String,
    full_font_name: String,
    license_description: String,
    license_url: String,
    manufacturer_name: String,
    postscript_name: String,
    trademark: String,
    unique_font_identifier: String,
    vendor_url: String,
    version_string: String
  ): Copyright = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], designer = designer.asInstanceOf[js.Any], designer_url = designer_url.asInstanceOf[js.Any], font_family_name = font_family_name.asInstanceOf[js.Any], font_sub_family_name = font_sub_family_name.asInstanceOf[js.Any], full_font_name = full_font_name.asInstanceOf[js.Any], license_description = license_description.asInstanceOf[js.Any], license_url = license_url.asInstanceOf[js.Any], manufacturer_name = manufacturer_name.asInstanceOf[js.Any], postscript_name = postscript_name.asInstanceOf[js.Any], trademark = trademark.asInstanceOf[js.Any], unique_font_identifier = unique_font_identifier.asInstanceOf[js.Any], vendor_url = vendor_url.asInstanceOf[js.Any], version_string = version_string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Copyright]
  }
  @scala.inline
  implicit class CopyrightOps[Self <: Copyright] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesigner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesigner_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designer_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_family_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_family_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont_sub_family_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font_sub_family_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFull_font_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full_font_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicense_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("license_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturer_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostscript_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postscript_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrademark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trademark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique_font_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique_font_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVendor_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendor_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion_string(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version_string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

