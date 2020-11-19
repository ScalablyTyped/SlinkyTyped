package typingsSlinky.typedoc.reflectionsDeclarationMod

import typingsSlinky.typedoc.containerMod.ContainerReflection
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typedoc.reflectionsSignatureMod.SignatureReflection
import typingsSlinky.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typedoc.abstractMod.Reflection because Already inherited
- typingsSlinky.typedoc.abstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters
- typingsSlinky.typedoc.abstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type`
- typingsSlinky.typedoc.abstractMod.DefaultValueContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined defaultValue */ @JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
@js.native
class DeclarationReflection () extends ContainerReflection {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var extendedBy: js.UndefOr[js.Array[Type]] = js.native
  
  var extendedTypes: js.UndefOr[js.Array[Type]] = js.native
  
  def getAllSignatures(): js.Array[SignatureReflection] = js.native
  
  var getSignature: js.UndefOr[SignatureReflection] = js.native
  
  var implementationOf: js.UndefOr[Type] = js.native
  
  var implementedBy: js.UndefOr[js.Array[Type]] = js.native
  
  var implementedTypes: js.UndefOr[js.Array[Type]] = js.native
  
  var indexSignature: js.UndefOr[SignatureReflection] = js.native
  
  var inheritedFrom: js.UndefOr[Type] = js.native
  
  var overwrites: js.UndefOr[Type] = js.native
  
  var setSignature: js.UndefOr[SignatureReflection] = js.native
  
  var signatures: js.UndefOr[js.Array[SignatureReflection]] = js.native
  
  var `type`: js.UndefOr[Type] = js.native
  
  var typeHierarchy: js.UndefOr[DeclarationHierarchy] = js.native
  
  var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
}
