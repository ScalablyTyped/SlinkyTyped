package typingsSlinky.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sparqljs.sparqljsStrings.ASK
import typingsSlinky.sparqljs.sparqljsStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AskQuery
  extends Query
     with BaseQuery {
  
  var queryType: ASK = js.native
}
object AskQuery {
  
  @scala.inline
  def apply(prefixes: StringDictionary[String], queryType: ASK, `type`: query): AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AskQuery]
  }
  
  @scala.inline
  implicit class AskQueryMutableBuilder[Self <: AskQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryType(value: ASK): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
  }
}
