package typingsSlinky.typedoc

import typingsSlinky.typedoc.abstractMod.Reflection
import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.abstractMod.TypeContainer
import typingsSlinky.typedoc.containerMod.ContainerReflection
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typedoc.reflectionsParameterMod.ParameterReflection
import typingsSlinky.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsSignatureMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedoc.abstractMod.Reflection because Already inherited
  - typingsSlinky.typedoc.abstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters */ @JSImport("typedoc/dist/lib/models/reflections/signature", "SignatureReflection")
  @js.native
  class SignatureReflection protected () extends TypeContainer {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: Reflection) = this()
    
    def getParameterTypes(): js.Array[Type] = js.native
    
    var implementationOf: js.UndefOr[Type] = js.native
    
    var inheritedFrom: js.UndefOr[Type] = js.native
    
    var overwrites: js.UndefOr[Type] = js.native
    
    var parameters: js.UndefOr[js.Array[ParameterReflection]] = js.native
    
    @JSName("parent")
    var parent_SignatureReflection: js.UndefOr[ContainerReflection] = js.native
    
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
  }
}
