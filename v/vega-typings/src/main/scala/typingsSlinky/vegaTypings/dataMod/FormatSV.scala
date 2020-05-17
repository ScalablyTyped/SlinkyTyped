package typingsSlinky.vegaTypings.dataMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.csv
import typingsSlinky.vegaTypings.vegaTypingsStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatSV extends Format {
  var header: js.UndefOr[js.Array[String]] = js.native
  var parse: js.UndefOr[Parse] = js.native
  var `type`: csv | tsv = js.native
}

object FormatSV {
  @scala.inline
  def apply(`type`: csv | tsv): FormatSV = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSV]
  }
  @scala.inline
  implicit class FormatSVOps[Self <: FormatSV] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: csv | tsv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: Parse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
  }
  
}

