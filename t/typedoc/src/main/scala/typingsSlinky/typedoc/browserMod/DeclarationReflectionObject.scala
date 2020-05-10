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
@js.native
trait DeclarationReflectionObject extends js.Object {
  var categories: js.UndefOr[js.Array[ReflectionCategoryObject]] = js.native
  var children: js.Array[ReflectionObject] = js.native
  var comment: js.UndefOr[CommentObject] = js.native
  var decorates: js.UndefOr[js.Array[TypeObject]] = js.native
  var decorators: js.UndefOr[js.Array[DecoratorObject]] = js.native
  var defaultValue: String = js.native
  var extendedBy: js.UndefOr[js.Array[TypeObject]] = js.native
  var extendedTypes: js.UndefOr[js.Array[TypeObject]] = js.native
  var flags: ReflectionFlagsObject = js.native
  var getSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.native
  var groups: js.UndefOr[js.Array[ReflectionGroupObject]] = js.native
  var id: Double = js.native
  var implementationOf: js.UndefOr[TypeObject] = js.native
  var implementedBy: js.UndefOr[js.Array[TypeObject]] = js.native
  var implementedTypes: js.UndefOr[js.Array[TypeObject]] = js.native
  var indexSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.native
  var inheritedFrom: js.UndefOr[TypeObject] = js.native
  var kind: Double = js.native
  var kindString: String = js.native
  var name: String = js.native
  var originalName: js.UndefOr[String] = js.native
  var overwrites: js.UndefOr[TypeObject] = js.native
  var parameters: js.UndefOr[js.Array[ParameterReflectionObject]] = js.native
  var setSignature: js.UndefOr[js.Array[SignatureReflectionObject]] = js.native
  var signatures: js.UndefOr[js.Array[SignatureReflectionObject]] = js.native
  var sources: js.UndefOr[js.Array[SourceReferenceObject]] = js.native
  var `type`: js.UndefOr[TypeObject] = js.native
  var typeParameters: js.UndefOr[js.Array[TypeContainer]] = js.native
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
    name: String
  ): DeclarationReflectionObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflectionObject]
  }
  @scala.inline
  implicit class DeclarationReflectionObjectOps[Self <: DeclarationReflectionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[ReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: ReflectionFlagsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKindString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kindString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[ReflectionCategoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: CommentObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorates(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorates")(js.undefined)
        ret
    }
    @scala.inline
    def withDecorators(value: js.Array[DecoratorObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorators")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedBy(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedTypes(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSignature(value: js.Array[SignatureReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[ReflectionGroupObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementationOf(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementationOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationOf")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementedBy(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementedTypes(value: js.Array[TypeObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexSignature(value: js.Array[SignatureReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedFrom(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritedFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrites(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrites")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[ParameterReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSignature(value: js.Array[SignatureReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[SignatureReflectionObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[SourceReferenceObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: TypeObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameters(value: js.Array[TypeContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(js.undefined)
        ret
    }
  }
  
}

