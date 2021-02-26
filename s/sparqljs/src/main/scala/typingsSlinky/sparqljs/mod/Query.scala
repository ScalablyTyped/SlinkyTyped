package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.ASK
import typingsSlinky.sparqljs.sparqljsStrings.CONSTRUCT
import typingsSlinky.sparqljs.sparqljsStrings.DESCRIBE
import typingsSlinky.sparqljs.sparqljsStrings.SELECT
import typingsSlinky.sparqljs.sparqljsStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sparqljs.mod.SelectQuery
  - typingsSlinky.sparqljs.mod.ConstructQuery
  - typingsSlinky.sparqljs.mod.AskQuery
  - typingsSlinky.sparqljs.mod.DescribeQuery
*/
trait Query extends SparqlQuery
object Query {
  
  @scala.inline
  def AskQuery(prefixes: StringDictionary[String], queryType: ASK, `type`: query): typingsSlinky.sparqljs.mod.AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.AskQuery]
  }
  
  @scala.inline
  def ConstructQuery(prefixes: StringDictionary[String], queryType: CONSTRUCT, `type`: query): typingsSlinky.sparqljs.mod.ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.ConstructQuery]
  }
  
  @scala.inline
  def DescribeQuery(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): typingsSlinky.sparqljs.mod.DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.sparqljs.mod.DescribeQuery]
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
}
