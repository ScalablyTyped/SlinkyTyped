package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.dataMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parse extends Format {
  var parse: typingsSlinky.vegaTypings.dataMod.Parse = js.native
}

object Parse {
  @scala.inline
  def apply(parse: typingsSlinky.vegaTypings.dataMod.Parse): Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  @scala.inline
  implicit class ParseOps[Self <: Parse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: typingsSlinky.vegaTypings.dataMod.Parse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

