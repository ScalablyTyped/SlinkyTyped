package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.Asterisk
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.BgpPattern
  - typingsSlinky.sparqljs.mod.BlockPattern
  - typingsSlinky.sparqljs.mod.GraphPattern
  - typingsSlinky.sparqljs.mod.ServicePattern
  - typingsSlinky.sparqljs.mod.FilterPattern
  - typingsSlinky.sparqljs.mod.BindPattern
  - typingsSlinky.sparqljs.mod.ValuesPattern
  - typingsSlinky.sparqljs.mod.SelectQuery
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  def BindPattern(expression: Expression, `type`: bind, variable: Term): Pattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): Pattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def ServicePattern(name: Term, patterns: js.Array[Pattern], silent: Boolean, `type`: service): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def FilterPattern(expression: Expression, `type`: filter): Pattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def ValuesPattern(`type`: values, values: js.Array[ValuePatternRow]): Pattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BlockPattern(patterns: js.Array[Pattern], `type`: optional | union | group | minus | graph | service): Pattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def GraphPattern(name: Term, patterns: js.Array[Pattern], `type`: graph): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Asterisk | Variable]
  ): Pattern = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

