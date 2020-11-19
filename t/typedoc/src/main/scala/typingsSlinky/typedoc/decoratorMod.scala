package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialDecorator
import typingsSlinky.typedoc.decoratorWrapperMod.DecoratorWrapper
import typingsSlinky.typedoc.schemaMod.Decorator
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", JSImport.Namespace)
@js.native
object decoratorMod extends js.Object {
  
  @js.native
  class DecoratorContainerSerializer () extends SerializerComponent[DecoratorWrapper] {
    
    def toObject(hasDecorator: DecoratorWrapper, obj: PartialDecorator): Decorator = js.native
  }
  /* static members */
  @js.native
  object DecoratorContainerSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
