package typingsSlinky.tablesorter.parsedDataMod

import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedData extends js.Object {
  /**
    * The jQuery-objects containing the cells of the rows.
    */
  @JSName("$cells")
  var $cells: js.Array[JQuery[HTMLElement]] = js.native
  /**
    * The parsed values of the rows.
    */
  var parsed: js.Array[_] = js.native
  /**
    * The raw values of the rows.
    */
  var raw: js.Array[String] = js.native
}

object ParsedData {
  @scala.inline
  def apply($cells: js.Array[JQuery[HTMLElement]], parsed: js.Array[_], raw: js.Array[String]): ParsedData = {
    val __obj = js.Dynamic.literal($cells = $cells.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedData]
  }
  @scala.inline
  implicit class ParsedDataOps[Self <: ParsedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$cells(value: js.Array[JQuery[HTMLElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsed(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRaw(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

