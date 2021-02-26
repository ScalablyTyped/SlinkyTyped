package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLScalarTypeConfig extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.native
  
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  def serialize(value: js.Any): js.Any = js.native
}
object GraphQLScalarTypeConfig {
  
  @scala.inline
  def apply(name: String, serialize: js.Any => js.Any): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
  
  @scala.inline
  implicit class GraphQLScalarTypeConfigMutableBuilder[Self <: GraphQLScalarTypeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseLiteral(value: /* valueAST */ Value => _): Self = StObject.set(x, "parseLiteral", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseLiteralUndefined: Self = StObject.set(x, "parseLiteral", js.undefined)
    
    @scala.inline
    def setParseValue(value: /* value */ js.Any => _): Self = StObject.set(x, "parseValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseValueUndefined: Self = StObject.set(x, "parseValue", js.undefined)
    
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
