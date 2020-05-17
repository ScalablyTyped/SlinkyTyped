package typingsSlinky.webgme.GmeUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canon extends js.Object {
  def parse(thing: js.Any): String = js.native
  def stringify(thing: js.Any): String = js.native
}

object Canon {
  @scala.inline
  def apply(parse: js.Any => String, stringify: js.Any => String): Canon = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Canon]
  }
  @scala.inline
  implicit class CanonOps[Self <: Canon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParse(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringify(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

