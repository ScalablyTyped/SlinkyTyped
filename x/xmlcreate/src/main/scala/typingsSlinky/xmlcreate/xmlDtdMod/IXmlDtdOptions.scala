package typingsSlinky.xmlcreate.xmlDtdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDtdOptions extends js.Object {
  /**
    * The name of the DTD.
    */
  var name: String = js.native
  /**
    * The public identifier of the DTD, excluding quotation marks. If a public
    * identifier is provided, a system identifier must be provided as well.
    * By default, no public identifier is included.
    */
  var pubId: js.UndefOr[String] = js.native
  /**
    * The system identifier of the DTD, excluding quotation marks. By default,
    * no system identifier is included.
    */
  var sysId: js.UndefOr[String] = js.native
}

object IXmlDtdOptions {
  @scala.inline
  def apply(name: String): IXmlDtdOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlDtdOptions]
  }
  @scala.inline
  implicit class IXmlDtdOptionsOps[Self <: IXmlDtdOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubId")(js.undefined)
        ret
    }
    @scala.inline
    def withSysId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysId")(js.undefined)
        ret
    }
  }
  
}

