package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.graph
import typingsSlinky.sparqljs.sparqljsStrings.group
import typingsSlinky.sparqljs.sparqljsStrings.minus
import typingsSlinky.sparqljs.sparqljsStrings.optional
import typingsSlinky.sparqljs.sparqljsStrings.service
import typingsSlinky.sparqljs.sparqljsStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.OptionalPattern
  - typingsSlinky.sparqljs.mod.UnionPattern
  - typingsSlinky.sparqljs.mod.GroupPattern
  - typingsSlinky.sparqljs.mod.GraphPattern
  - typingsSlinky.sparqljs.mod.MinusPattern
  - typingsSlinky.sparqljs.mod.ServicePattern
*/
trait BlockPattern extends Pattern
object BlockPattern {
  
  @scala.inline
  def OptionalPattern(patterns: js.Array[Pattern], `type`: optional): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  
  @scala.inline
  def MinusPattern(patterns: js.Array[Pattern], `type`: minus): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  
  @scala.inline
  def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean, `type`: service): BlockPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  
  @scala.inline
  def UnionPattern(patterns: js.Array[Pattern], `type`: union): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  
  @scala.inline
  def GraphPattern(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): BlockPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
  
  @scala.inline
  def GroupPattern(patterns: js.Array[Pattern], `type`: group): BlockPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPattern]
  }
}
