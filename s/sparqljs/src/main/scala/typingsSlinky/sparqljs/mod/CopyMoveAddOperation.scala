package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.add
import typingsSlinky.sparqljs.sparqljsStrings.copy
import typingsSlinky.sparqljs.sparqljsStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyMoveAddOperation extends ManagementOperation {
  var destination: GraphOrDefault = js.native
  var silent: Boolean = js.native
  var source: GraphOrDefault = js.native
  var `type`: copy | move | add = js.native
}

object CopyMoveAddOperation {
  @scala.inline
  def apply(destination: GraphOrDefault, silent: Boolean, source: GraphOrDefault, `type`: copy | move | add): CopyMoveAddOperation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMoveAddOperation]
  }
  @scala.inline
  implicit class CopyMoveAddOperationOps[Self <: CopyMoveAddOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: GraphOrDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: GraphOrDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: copy | move | add): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

