package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.SELECT
import typingsSlinky.sparqljs.sparqljsStrings.bgp
import typingsSlinky.sparqljs.sparqljsStrings.bind
import typingsSlinky.sparqljs.sparqljsStrings.filter
import typingsSlinky.sparqljs.sparqljsStrings.graph
import typingsSlinky.sparqljs.sparqljsStrings.group
import typingsSlinky.sparqljs.sparqljsStrings.minus
import typingsSlinky.sparqljs.sparqljsStrings.optional
import typingsSlinky.sparqljs.sparqljsStrings.query
import typingsSlinky.sparqljs.sparqljsStrings.service
import typingsSlinky.sparqljs.sparqljsStrings.union
import typingsSlinky.sparqljs.sparqljsStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.BgpPattern
  - typingsSlinky.sparqljs.mod.BlockPattern
  - typingsSlinky.sparqljs.mod.FilterPattern
  - typingsSlinky.sparqljs.mod.BindPattern
  - typingsSlinky.sparqljs.mod.ValuesPattern
  - typingsSlinky.sparqljs.mod.SelectQuery
*/
trait Pattern extends StObject
object Pattern {
  
  @scala.inline
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): typingsSlinky.sparqljs.mod.BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.BgpPattern]
  }
  
  @scala.inline
  def BindPattern(expression: Expression, `type`: bind, variable: VariableTerm): typingsSlinky.sparqljs.mod.BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.BindPattern]
  }
  
  @scala.inline
  def FilterPattern(expression: Expression, `type`: filter): typingsSlinky.sparqljs.mod.FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.FilterPattern]
  }
  
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
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): typingsSlinky.sparqljs.mod.SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.SelectQuery]
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
  
  @scala.inline
  def ValuesPattern(`type`: values, values: js.Array[ValuePatternRow]): typingsSlinky.sparqljs.mod.ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.ValuesPattern]
  }
}
