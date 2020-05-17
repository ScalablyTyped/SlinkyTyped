package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDriver extends js.Object {
  var csv: js.Any = js.native
  var excel: String = js.native
  var html: js.Any = js.native
  var htmltable: js.Any = js.native
  var jsarray: js.Any = js.native
  var json: js.Any = js.native
  var xml: js.Any = js.native
}

object DataDriver {
  @scala.inline
  def apply(
    csv: js.Any,
    excel: String,
    html: js.Any,
    htmltable: js.Any,
    jsarray: js.Any,
    json: js.Any,
    xml: js.Any
  ): DataDriver = {
    val __obj = js.Dynamic.literal(csv = csv.asInstanceOf[js.Any], excel = excel.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmltable = htmltable.asInstanceOf[js.Any], jsarray = jsarray.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDriver]
  }
  @scala.inline
  implicit class DataDriverOps[Self <: DataDriver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCsv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmltable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmltable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsarray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsarray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXml(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

