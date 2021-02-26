package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialDecorator
import typingsSlinky.typedoc.decoratorWrapperMod.DecoratorWrapper
import typingsSlinky.typedoc.schemaMod.Decorator
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
  @js.native
  class DecoratorContainerSerializer protected () extends SerializerComponent[DecoratorWrapper] {
    def this(owner: Serializer) = this()
    
    def toObject(hasDecorator: DecoratorWrapper, obj: PartialDecorator): Decorator = js.native
  }
  /* static members */
  object DecoratorContainerSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/decorator", "DecoratorContainerSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
