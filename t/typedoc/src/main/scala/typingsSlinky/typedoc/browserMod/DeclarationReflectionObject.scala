package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.ReflectionContainer */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceContainer<typedoc.typedoc/dist/lib/serialization/browser.SourceReferenceObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.GroupsContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionGroupObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.CategoriesContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionCategoryObject>> */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.ContainerReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ReflectionObject> */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.DefaultValueContainer */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.TypeContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject>> */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.DeclarationReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionObject> */
trait DeclarationReflectionObject extends js.Object {
  var categories: js.UndefOr[js.Array[ReflectionCategoryObject]] = js.undefined
  var children: js.Array[ReflectionObject]
  var comment: js.UndefOr[CommentObject] = js.undefined
  var decorates: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorObject]] = js.undefined
  var defaultValue: String
  var extendedBy: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var extendedTypes: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var flags: ReflectionFlagsObject
  var getSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.undefined
  var groups: js.UndefOr[js.Array[ReflectionGroupObject]] = js.undefined
  var id: Double
  var implementationOf: js.UndefOr[TypeObject] = js.undefined
  var implementedBy: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var implementedTypes: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var indexSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.undefined
  var inheritedFrom: js.UndefOr[TypeObject] = js.undefined
  var kind: Double
  var kindString: String
  var name: String
  var originalName: js.UndefOr[String] = js.undefined
  var overwrites: js.UndefOr[TypeObject] = js.undefined
  var parameters: js.UndefOr[js.Array[ParameterReflectionObject]] = js.undefined
  var setSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.undefined
  var signatures: js.UndefOr[js.Array[SignatureReflectionObject]] = js.undefined
  var sources: js.UndefOr[js.Array[SourceReferenceObject]] = js.undefined
  var `type`: js.UndefOr[TypeObject] = js.undefined
  var typeParameters: js.UndefOr[js.Array[TypeContainer]] = js.undefined
}

object DeclarationReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    defaultValue: String,
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    categories: js.Array[ReflectionCategoryObject] = null,
    comment: CommentObject = null,
    decorates: js.Array[TypeObject] = null,
    decorators: js.Array[DecoratorObject] = null,
    extendedBy: js.Array[TypeObject] = null,
    extendedTypes: js.Array[TypeObject] = null,
    getSignature: js.Array[SignatureReflectionObject] = null,
    groups: js.Array[ReflectionGroupObject] = null,
    implementationOf: TypeObject = null,
    implementedBy: js.Array[TypeObject] = null,
    implementedTypes: js.Array[TypeObject] = null,
    indexSignature: js.Array[SignatureReflectionObject] = null,
    inheritedFrom: TypeObject = null,
    originalName: String = null,
    overwrites: TypeObject = null,
    parameters: js.Array[ParameterReflectionObject] = null,
    setSignature: js.Array[SignatureReflectionObject] = null,
    signatures: js.Array[SignatureReflectionObject] = null,
    sources: js.Array[SourceReferenceObject] = null,
    `type`: TypeObject = null,
    typeParameters: js.Array[TypeContainer] = null
  ): DeclarationReflectionObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (extendedBy != null) __obj.updateDynamic("extendedBy")(extendedBy.asInstanceOf[js.Any])
    if (extendedTypes != null) __obj.updateDynamic("extendedTypes")(extendedTypes.asInstanceOf[js.Any])
    if (getSignature != null) __obj.updateDynamic("getSignature")(getSignature.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (implementationOf != null) __obj.updateDynamic("implementationOf")(implementationOf.asInstanceOf[js.Any])
    if (implementedBy != null) __obj.updateDynamic("implementedBy")(implementedBy.asInstanceOf[js.Any])
    if (implementedTypes != null) __obj.updateDynamic("implementedTypes")(implementedTypes.asInstanceOf[js.Any])
    if (indexSignature != null) __obj.updateDynamic("indexSignature")(indexSignature.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (overwrites != null) __obj.updateDynamic("overwrites")(overwrites.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (setSignature != null) __obj.updateDynamic("setSignature")(setSignature.asInstanceOf[js.Any])
    if (signatures != null) __obj.updateDynamic("signatures")(signatures.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflectionObject]
  }
}

