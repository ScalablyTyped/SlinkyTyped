package typingsSlinky.xmlcreate.xmlDeclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDeclOptions extends js.Object {
  /**
    * The encoding attribute to be included in the declaration. If defined,
    * this value must be a valid encoding. By default, no encoding attribute
    * is included.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * The value of the standalone attribute to be included in the declaration.
    * If defined, this value must be "yes" or "no". By default, no standalone
    * attribute is included.
    */
  var standalone: js.UndefOr[String] = js.native
  /**
    * The XML version to be included in the declaration. If defined, this
    * value must be a valid XML version number. Defaults to "1.0".
    */
  var version: js.UndefOr[String] = js.native
}

object IXmlDeclOptions {
  @scala.inline
  def apply(): IXmlDeclOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlDeclOptions]
  }
  @scala.inline
  implicit class IXmlDeclOptionsOps[Self <: IXmlDeclOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

