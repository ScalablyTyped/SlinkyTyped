package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// utilities/Typeinfo.js
@js.native
trait TypeInfo extends StObject {
  
  def enter(node: Node): Unit = js.native
  
  def getArgument(): GraphQLArgument = js.native
  
  def getDirective(): GraphQLDirective = js.native
  
  def getFieldDef(): GraphQLFieldDefinition = js.native
  
  def getInputType(): GraphQLInputType = js.native
  
  def getParentType(): GraphQLCompositeType = js.native
  
  def getType(): GraphQLOutputType = js.native
  
  def leave(node: Node): Unit = js.native
}
object TypeInfo {
  
  @scala.inline
  def apply(
    enter: Node => Unit,
    getArgument: () => GraphQLArgument,
    getDirective: () => GraphQLDirective,
    getFieldDef: () => GraphQLFieldDefinition,
    getInputType: () => GraphQLInputType,
    getParentType: () => GraphQLCompositeType,
    getType: () => GraphQLOutputType,
    leave: Node => Unit
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), getArgument = js.Any.fromFunction0(getArgument), getDirective = js.Any.fromFunction0(getDirective), getFieldDef = js.Any.fromFunction0(getFieldDef), getInputType = js.Any.fromFunction0(getInputType), getParentType = js.Any.fromFunction0(getParentType), getType = js.Any.fromFunction0(getType), leave = js.Any.fromFunction1(leave))
    __obj.asInstanceOf[TypeInfo]
  }
  
  @scala.inline
  implicit class TypeInfoMutableBuilder[Self <: TypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: Node => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetArgument(value: () => GraphQLArgument): Self = StObject.set(x, "getArgument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDirective(value: () => GraphQLDirective): Self = StObject.set(x, "getDirective", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldDef(value: () => GraphQLFieldDefinition): Self = StObject.set(x, "getFieldDef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputType(value: () => GraphQLInputType): Self = StObject.set(x, "getInputType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentType(value: () => GraphQLCompositeType): Self = StObject.set(x, "getParentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => GraphQLOutputType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLeave(value: Node => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
  }
}
