package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.Asterisk
import typingsSlinky.sparqljs.sparqljsStrings.Exclamationmark
import typingsSlinky.sparqljs.sparqljsStrings.Plussign
import typingsSlinky.sparqljs.sparqljsStrings.Slash
import typingsSlinky.sparqljs.sparqljsStrings.Verticalline
import typingsSlinky.sparqljs.sparqljsStrings.^
import typingsSlinky.sparqljs.sparqljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term] = js.native
  var pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark = js.native
  var `type`: path = js.native
}

object PropertyPath {
  @scala.inline
  def apply(
    items: js.Array[PropertyPath | Term],
    pathType: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark,
    `type`: path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
  @scala.inline
  implicit class PropertyPathOps[Self <: PropertyPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PropertyPath | Term]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathType(value: Verticalline | Slash | ^  | Plussign | Asterisk | Exclamationmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

