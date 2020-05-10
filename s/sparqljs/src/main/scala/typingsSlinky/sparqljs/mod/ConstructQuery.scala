package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.CONSTRUCT
import typingsSlinky.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructQuery
  extends Query
     with BaseQuery {
  var queryType: CONSTRUCT = js.native
  var template: js.UndefOr[js.Array[Triple]] = js.native
}

object ConstructQuery {
  @scala.inline
  def apply(prefixes: StringDictionary[String], queryType: CONSTRUCT, `type`: query): ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructQuery]
  }
  @scala.inline
  implicit class ConstructQueryOps[Self <: ConstructQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryType(value: CONSTRUCT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: js.Array[Triple]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

