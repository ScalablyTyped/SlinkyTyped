package typingsSlinky.sparqljs.mod

import typingsSlinky.sparqljs.sparqljsStrings.graph
import typingsSlinky.sparqljs.sparqljsStrings.group
import typingsSlinky.sparqljs.sparqljsStrings.minus
import typingsSlinky.sparqljs.sparqljsStrings.optional
import typingsSlinky.sparqljs.sparqljsStrings.service
import typingsSlinky.sparqljs.sparqljsStrings.union
import org.scalablytyped.runtime.StObject
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
  def GraphPattern(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): typingsSlinky.sparqljs.mod.GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.GraphPattern]
  }
  
  @scala.inline
  def GroupPattern(patterns: js.Array[Pattern], `type`: group): typingsSlinky.sparqljs.mod.GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.GroupPattern]
  }
  
  @scala.inline
  def MinusPattern(patterns: js.Array[Pattern], `type`: minus): typingsSlinky.sparqljs.mod.MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.MinusPattern]
  }
  
  @scala.inline
  def OptionalPattern(patterns: js.Array[Pattern], `type`: optional): typingsSlinky.sparqljs.mod.OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.OptionalPattern]
  }
  
  @scala.inline
  def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean, `type`: service): typingsSlinky.sparqljs.mod.ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.ServicePattern]
  }
  
  @scala.inline
  def UnionPattern(patterns: js.Array[Pattern], `type`: union): typingsSlinky.sparqljs.mod.UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.UnionPattern]
  }
}
