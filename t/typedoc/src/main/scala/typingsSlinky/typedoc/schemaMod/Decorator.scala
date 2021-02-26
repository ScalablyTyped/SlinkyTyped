package typingsSlinky.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Decorator, 'name' | 'type' | 'arguments'> */
@js.native
trait Decorator
  extends __ModelToObject[js.Any] {
  
  var arguments: js.UndefOr[ModelToObject[js.UndefOr[_]] | js.Any] = js.native
  
  var name: ModelToObject[String] | String = js.native
  
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
}
object Decorator {
  
  @scala.inline
  def apply(name: ModelToObject[String] | String): Decorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
  
  @scala.inline
  implicit class DecoratorMutableBuilder[Self <: Decorator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: ModelToObject[js.UndefOr[_]] | js.Any): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
