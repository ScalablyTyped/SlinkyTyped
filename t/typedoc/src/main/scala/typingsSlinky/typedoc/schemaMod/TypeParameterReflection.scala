package typingsSlinky.typedoc.schemaMod

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.serializersMod.DecoratorWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterReflection, 'type'> */
@js.native
trait TypeParameterReflection
  extends __ModelToObject[js.Any] {
  
  var children: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var comment: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.commentsCommentMod.Comment]] | typingsSlinky.typedoc.commentsCommentMod.Comment
  ] = js.native
  
  var decorates: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.native
  
  var flags: ReflectionFlags = js.native
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var id: ModelToObject[Double] | Double = js.native
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var kind: ModelToObject[ReflectionKind] | ReflectionKind = js.native
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  
  var name: ModelToObject[String] | String = js.native
  
  var originalName: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var signatures: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
}
object TypeParameterReflection {
  
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): TypeParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterReflection]
  }
  
  @scala.inline
  implicit class TypeParameterReflectionMutableBuilder[Self <: TypeParameterReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setComment(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.commentsCommentMod.Comment]] | typingsSlinky.typedoc.commentsCommentMod.Comment
    ): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "comment", js.Array(value :_*))
    
    @scala.inline
    def setDecorates(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = StObject.set(x, "decorates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratesUndefined: Self = StObject.set(x, "decorates", js.undefined)
    
    @scala.inline
    def setDecoratesVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "decorates", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "getSignature", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "id", js.Array(value :_*))
    
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "indexSignature", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kindString", js.Array(value :_*))
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "setSignature", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = StObject.set(x, "typeParameter", js.Array(value :_*))
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
