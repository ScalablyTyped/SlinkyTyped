package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinitionQuery
  extends BaseQueryWithFile
     with Query {
  /** Specify the location of the expression. */
  var end: Double | Position = js.native
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  /**
    * Asks for the definition of something. This will try, for a variable or property,
    * to return the point at which it was defined. If that fails, or the chosen
    * expression is not an identifier or property reference, it will try to return
    * the definition site of the type the expression has. If no type is found, or the
    * type is not an object or function (other types don’t store their definition site),
    * it will fail to return useful information.
    */
  @JSName("type")
  var type_DefinitionQuery: definition = js.native
}

object DefinitionQuery {
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: definition): DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionQuery]
  }
  @scala.inline
  implicit class DefinitionQueryOps[Self <: DefinitionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: definition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double | Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

