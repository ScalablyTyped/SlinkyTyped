package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.bgp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BgpPattern
  extends Pattern
     with Quads
     with _Expression {
  var triples: js.Array[Triple] = js.native
  var `type`: bgp = js.native
}

object BgpPattern {
  @scala.inline
  def apply(triples: js.Array[Triple], `type`: bgp): BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPattern]
  }
  @scala.inline
  implicit class BgpPatternOps[Self <: BgpPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriples(value: js.Array[Triple]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: bgp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

