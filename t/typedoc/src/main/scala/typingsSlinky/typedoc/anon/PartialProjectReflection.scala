package typingsSlinky.typedoc.anon

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.commentsCommentMod.Comment
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.modelsTypesMod.Type
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.schemaMod.ReflectionFlags
import typingsSlinky.typedoc.schemaMod._ModelToObject
import typingsSlinky.typedoc.serializersMod.DecoratorWrapper
import typingsSlinky.typedoc.serializersMod.SourceReferenceWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ProjectReflection> */
@js.native
trait PartialProjectReflection extends StObject {
  
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]
  ] = js.native
  
  var children: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var comment: js.UndefOr[ModelToObject[js.UndefOr[Comment]] | Comment] = js.native
  
  var decorates: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.native
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.native
  
  var flags: js.UndefOr[ReflectionFlags] = js.native
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var groups: js.UndefOr[ModelToObject[js.UndefOr[js.Array[ReflectionGroup]]] | js.Array[ReflectionGroup]] = js.native
  
  var id: js.UndefOr[ModelToObject[Double] | Double] = js.native
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.native
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  
  var name: js.UndefOr[ModelToObject[String] | String] = js.native
  
  var originalName: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var signatures: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
  
  var sources: js.UndefOr[ModelToObject[js.Array[SourceReferenceWrapper]]] = js.native
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[Reflection]]] = js.native
}
object PartialProjectReflection {
  
  @scala.inline
  def apply(): PartialProjectReflection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProjectReflection]
  }
  
  @scala.inline
  implicit class PartialProjectReflectionMutableBuilder[Self <: PartialProjectReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (ReflectionCategory | _ModelToObject[js.Any])*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: ModelToObject[js.UndefOr[Comment]] | Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "comment", js.Array(value :_*))
    
    @scala.inline
    def setDecorates(value: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]): Self = StObject.set(x, "decorates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    
    @scala.inline
    def setDecoratesVarargs(value: (Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "decorates", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "getSignature", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: ModelToObject[js.UndefOr[js.Array[ReflectionGroup]]] | js.Array[ReflectionGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: (ReflectionGroup | _ModelToObject[js.Any])*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "indexSignature", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kindString", js.Array(value :_*))
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "setSignature", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: ModelToObject[js.Array[SourceReferenceWrapper]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[Reflection]]): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[Reflection]*): Self = StObject.set(x, "typeParameter", js.Array(value :_*))
  }
}
