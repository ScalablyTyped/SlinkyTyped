package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.graph
import typingsSlinky.sparqljs.sparqljsStrings.group
import typingsSlinky.sparqljs.sparqljsStrings.minus
import typingsSlinky.sparqljs.sparqljsStrings.optional
import typingsSlinky.sparqljs.sparqljsStrings.service
import typingsSlinky.sparqljs.sparqljsStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPattern extends Pattern {
  var patterns: js.Array[Pattern]
  var `type`: optional | union | group | minus | graph | service
}

object BlockPattern {
  @scala.inline
  def apply(patterns: js.Array[Pattern], `type`: optional | union | group | minus | graph | service): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
}

