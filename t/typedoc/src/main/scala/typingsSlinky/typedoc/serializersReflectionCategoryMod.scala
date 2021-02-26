package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflectionCategory
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionCategoryMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflection-category", "ReflectionCategorySerializer")
  @js.native
  class ReflectionCategorySerializer protected () extends SerializerComponent[ReflectionCategory] {
    def this(owner: Serializer) = this()
    
    def toObject(category: ReflectionCategory, obj: PartialReflectionCategory): typingsSlinky.typedoc.schemaMod.ReflectionCategory = js.native
  }
  /* static members */
  object ReflectionCategorySerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflection-category", "ReflectionCategorySerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflection-category", "ReflectionCategorySerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
