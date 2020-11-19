package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections", JSImport.Namespace)
@js.native
object serializersReflectionsMod extends js.Object {
  
  @js.native
  class ContainerReflectionSerializer ()
    extends typingsSlinky.typedoc.reflectionsContainerMod.ContainerReflectionSerializer
  
  @js.native
  class DeclarationReflectionSerializer ()
    extends typingsSlinky.typedoc.serializersReflectionsDeclarationMod.DeclarationReflectionSerializer
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ParameterReflectionSerializer ()
    extends typingsSlinky.typedoc.serializersReflectionsParameterMod.ParameterReflectionSerializer
  
  @js.native
  class ProjectReflectionSerializer ()
    extends typingsSlinky.typedoc.reflectionsProjectMod.ProjectReflectionSerializer
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ReferenceReflectionSerializer ()
    extends typingsSlinky.typedoc.serializersReflectionsReferenceMod.ReferenceReflectionSerializer
  /* static members */
  @js.native
  object ReferenceReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ReflectionSerializer ()
    extends typingsSlinky.typedoc.reflectionsAbstractMod.ReflectionSerializer
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class SignatureReflectionSerializer ()
    extends typingsSlinky.typedoc.serializersReflectionsSignatureMod.SignatureReflectionSerializer
  
  @js.native
  class TypeParameterReflectionSerializer ()
    extends typingsSlinky.typedoc.serializersReflectionsTypeParameterMod.TypeParameterReflectionSerializer
}
