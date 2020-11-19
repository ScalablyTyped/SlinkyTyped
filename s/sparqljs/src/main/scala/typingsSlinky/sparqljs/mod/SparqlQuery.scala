package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.ASK
import typingsSlinky.sparqljs.sparqljsStrings.CONSTRUCT
import typingsSlinky.sparqljs.sparqljsStrings.DESCRIBE
import typingsSlinky.sparqljs.sparqljsStrings.SELECT
import typingsSlinky.sparqljs.sparqljsStrings.query
import typingsSlinky.sparqljs.sparqljsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.Query
  - typingsSlinky.sparqljs.mod.Update
*/
trait SparqlQuery extends js.Object
object SparqlQuery {
  
  @scala.inline
  def Update(prefixes: StringDictionary[String], `type`: update, updates: js.Array[UpdateOperation]): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  
  @scala.inline
  def ConstructQuery(prefixes: StringDictionary[String], queryType: CONSTRUCT, `type`: query): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  
  @scala.inline
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  
  @scala.inline
  def AskQuery(prefixes: StringDictionary[String], queryType: ASK, `type`: query): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  
  @scala.inline
  def DescribeQuery(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
}
