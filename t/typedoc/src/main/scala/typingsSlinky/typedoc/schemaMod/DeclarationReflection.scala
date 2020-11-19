package typingsSlinky.typedoc.schemaMod

import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.serializersMod.DecoratorWrapper
import typingsSlinky.typedoc.serializersMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.ContainerReflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.DeclarationReflection, 'type' | 'defaultValue' | 'overwrites' | 'inheritedFrom' | 'extendedTypes' | 'extendedBy' | 'implementedTypes' | 'implementedBy' | 'implementationOf'> */
@js.native
trait DeclarationReflection
  extends __ModelToObject[js.Any] {
  
  var categories: js.UndefOr[
    (ModelToObject[
      js.UndefOr[js.Array[typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory]]
    ]) | js.Array[typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory]
  ] = js.native
  
  var children: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var comment: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.commentsCommentMod.Comment]] | typingsSlinky.typedoc.commentsCommentMod.Comment
  ] = js.native
  
  var decorates: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var decorators: js.UndefOr[ModelToObject[js.Array[DecoratorWrapper]]] = js.native
  
  var defaultValue: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  
  var extendedBy: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var extendedTypes: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var flags: ReflectionFlags = js.native
  
  var getSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var groups: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup]]] | js.Array[typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup]
  ] = js.native
  
  var id: ModelToObject[Double] | Double = js.native
  
  var implementationOf: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
  
  var implementedBy: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var implementedTypes: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
  ] = js.native
  
  var indexSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var inheritedFrom: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
  
  var kind: ModelToObject[ReflectionKind] | ReflectionKind = js.native
  
  var kindString: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  
  var name: ModelToObject[String] | String = js.native
  
  var originalName: js.UndefOr[String] = js.native
  
  var overwrites: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
  
  var parameters: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var setSignature: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var signatures: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
  
  var sources: js.UndefOr[ModelToObject[js.Array[SourceReferenceWrapper]]] = js.native
  
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
  ] = js.native
  
  var typeParameter: js.UndefOr[js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]] = js.native
}
object DeclarationReflection {
  
  @scala.inline
  def apply(
    flags: ReflectionFlags,
    id: ModelToObject[Double] | Double,
    kind: ModelToObject[ReflectionKind] | ReflectionKind,
    name: ModelToObject[String] | String
  ): DeclarationReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflection]
  }
  
  @scala.inline
  implicit class DeclarationReflectionOps[Self <: DeclarationReflection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlags(value: ReflectionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = this.set("id", js.Array(value :_*))
    
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = this.set("kind", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: (typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory | _ModelToObject[js.Any])*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(
      value: (ModelToObject[
          js.UndefOr[js.Array[typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory]]
        ]) | js.Array[typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory]
    ): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: _ModelToObject[js.Any]*): Self = this.set("comment", js.Array(value :_*))
    
    @scala.inline
    def setComment(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.commentsCommentMod.Comment]] | typingsSlinky.typedoc.commentsCommentMod.Comment
    ): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDecoratesVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = this.set("decorates", js.Array(value :_*))
    
    @scala.inline
    def setDecorates(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = this.set("decorates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorates: Self = this.set("decorates", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("decorators", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: ModelToObject[js.Array[DecoratorWrapper]]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: _ModelToObject[js.Any]*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: ModelToObject[js.UndefOr[String]] | String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setExtendedByVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = this.set("extendedBy", js.Array(value :_*))
    
    @scala.inline
    def setExtendedBy(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = this.set("extendedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedBy: Self = this.set("extendedBy", js.undefined)
    
    @scala.inline
    def setExtendedTypesVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = this.set("extendedTypes", js.Array(value :_*))
    
    @scala.inline
    def setExtendedTypes(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = this.set("extendedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedTypes: Self = this.set("extendedTypes", js.undefined)
    
    @scala.inline
    def setGetSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("getSignature", js.Array(value :_*))
    
    @scala.inline
    def setGetSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("getSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetSignature: Self = this.set("getSignature", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: (typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup | _ModelToObject[js.Any])*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup]]] | js.Array[typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup]
    ): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setImplementationOfVarargs(value: _ModelToObject[js.Any]*): Self = this.set("implementationOf", js.Array(value :_*))
    
    @scala.inline
    def setImplementationOf(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = this.set("implementationOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementationOf: Self = this.set("implementationOf", js.undefined)
    
    @scala.inline
    def setImplementedByVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = this.set("implementedBy", js.Array(value :_*))
    
    @scala.inline
    def setImplementedBy(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = this.set("implementedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementedBy: Self = this.set("implementedBy", js.undefined)
    
    @scala.inline
    def setImplementedTypesVarargs(value: (typingsSlinky.typedoc.modelsTypesMod.Type | _ModelToObject[js.Any])*): Self = this.set("implementedTypes", js.Array(value :_*))
    
    @scala.inline
    def setImplementedTypes(
      value: ModelToObject[js.UndefOr[js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]]] | js.Array[typingsSlinky.typedoc.modelsTypesMod.Type]
    ): Self = this.set("implementedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementedTypes: Self = this.set("implementedTypes", js.undefined)
    
    @scala.inline
    def setIndexSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("indexSignature", js.Array(value :_*))
    
    @scala.inline
    def setIndexSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("indexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexSignature: Self = this.set("indexSignature", js.undefined)
    
    @scala.inline
    def setInheritedFromVarargs(value: _ModelToObject[js.Any]*): Self = this.set("inheritedFrom", js.Array(value :_*))
    
    @scala.inline
    def setInheritedFrom(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritedFrom: Self = this.set("inheritedFrom", js.undefined)
    
    @scala.inline
    def setKindStringVarargs(value: _ModelToObject[js.Any]*): Self = this.set("kindString", js.Array(value :_*))
    
    @scala.inline
    def setKindString(value: ModelToObject[js.UndefOr[String]] | String): Self = this.set("kindString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKindString: Self = this.set("kindString", js.undefined)
    
    @scala.inline
    def setOriginalName(value: String): Self = this.set("originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalName: Self = this.set("originalName", js.undefined)
    
    @scala.inline
    def setOverwritesVarargs(value: _ModelToObject[js.Any]*): Self = this.set("overwrites", js.Array(value :_*))
    
    @scala.inline
    def setOverwrites(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = this.set("overwrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrites: Self = this.set("overwrites", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSetSignatureVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("setSignature", js.Array(value :_*))
    
    @scala.inline
    def setSetSignature(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("setSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetSignature: Self = this.set("setSignature", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("signatures", js.Array(value :_*))
    
    @scala.inline
    def setSignatures(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatures: Self = this.set("signatures", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: _ModelToObject[js.Any]*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: ModelToObject[js.Array[SourceReferenceWrapper]]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: ModelToObject[js.UndefOr[typingsSlinky.typedoc.modelsTypesMod.Type]] | typingsSlinky.typedoc.modelsTypesMod.Type
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeParameterVarargs(value: ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]*): Self = this.set("typeParameter", js.Array(value :_*))
    
    @scala.inline
    def setTypeParameter(value: js.Array[ModelToObject[typingsSlinky.typedoc.modelsMod.Reflection]]): Self = this.set("typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeParameter: Self = this.set("typeParameter", js.undefined)
  }
}
