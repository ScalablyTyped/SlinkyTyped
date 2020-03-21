package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.abstractMod.TypeContainer
import typingsSlinky.typedoc.modelsTypesMod.TypeParameterType
import typingsSlinky.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/type-parameter", JSImport.Namespace)
@js.native
object reflectionsTypeParameterMod extends js.Object {
  @js.native
  class TypeParameterReflection protected () extends TypeContainer {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: Reflection) = this()
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
  }
  
}

