package typingsSlinky.sparqljs.sparqljsMod

import typingsSlinky.sparqljs.sparqljsStrings.`!`
import typingsSlinky.sparqljs.sparqljsStrings.`+`
import typingsSlinky.sparqljs.sparqljsStrings.`/`
import typingsSlinky.sparqljs.sparqljsStrings.`_backtick^_backtick`
import typingsSlinky.sparqljs.sparqljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyPath extends js.Object {
  var items: js.Array[PropertyPath | Term]
  var pathType: typingsSlinky.sparqljs.sparqljsStrings.`|` | `/` | `_backtick^_backtick` | `+` | typingsSlinky.sparqljs.sparqljsStrings.`*` | `!`
  var `type`: path
}

object PropertyPath {
  @scala.inline
  def apply(
    items: js.Array[PropertyPath | Term],
    pathType: typingsSlinky.sparqljs.sparqljsStrings.`|` | `/` | `_backtick^_backtick` | `+` | typingsSlinky.sparqljs.sparqljsStrings.`*` | `!`,
    `type`: path
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPath]
  }
}

