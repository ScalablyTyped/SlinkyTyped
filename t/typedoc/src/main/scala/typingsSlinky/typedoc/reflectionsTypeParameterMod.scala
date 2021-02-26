package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.abstractMod.TypeContainer
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typedoc.modelsTypesMod.TypeParameterType
import typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/type-parameter", "TypeParameterReflection")
  @js.native
  class TypeParameterReflection protected () extends TypeContainer {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: Reflection) = this()
    
    var default: js.UndefOr[Type] = js.native
    
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
  }
}
