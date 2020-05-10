package typingsSlinky.soap.elementsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWsdlXmlns extends /* prop */ StringDictionary[String | Unit] {
  var __tns__ : js.UndefOr[String] = js.native
  var soap: js.UndefOr[String] = js.native
  var tns: js.UndefOr[String] = js.native
  var wsam: js.UndefOr[String] = js.native
  var wsp: js.UndefOr[String] = js.native
  var wsu: js.UndefOr[String] = js.native
  var xsd: js.UndefOr[String] = js.native
}

object IWsdlXmlns {
  @scala.inline
  def apply(): IWsdlXmlns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWsdlXmlns]
  }
  @scala.inline
  implicit class IWsdlXmlnsOps[Self <: IWsdlXmlns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__tns__(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__tns__")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__tns__ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__tns__")(js.undefined)
        ret
    }
    @scala.inline
    def withSoap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soap")(js.undefined)
        ret
    }
    @scala.inline
    def withTns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tns")(js.undefined)
        ret
    }
    @scala.inline
    def withWsam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsam")(js.undefined)
        ret
    }
    @scala.inline
    def withWsp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsp")(js.undefined)
        ret
    }
    @scala.inline
    def withWsu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWsu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wsu")(js.undefined)
        ret
    }
    @scala.inline
    def withXsd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsd")(js.undefined)
        ret
    }
  }
  
}

