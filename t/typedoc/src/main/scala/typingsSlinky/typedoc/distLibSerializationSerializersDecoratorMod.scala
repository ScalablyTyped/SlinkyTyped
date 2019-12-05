package typingsSlinky.typedoc

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.typedoc.distLibModelsReflectionsAbstractMod.Decorator
import typingsSlinky.typedoc.distLibSerializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.distLibSerializationSerializersModelsDecoratorDashWrapperMod.DecoratorWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", JSImport.Namespace)
@js.native
object distLibSerializationSerializersDecoratorMod extends js.Object {
  @js.native
  class DecoratorContainerSerializer () extends SerializerComponent[DecoratorWrapper] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_DecoratorContainerSerializer: Instantiable1[/* decorator */ Decorator, DecoratorWrapper] = js.native
  }
  
  /* static members */
  @js.native
  object DecoratorContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

