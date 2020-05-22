package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.ReflectionContainer */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.SignatureReflectionContainer<typedoc.typedoc/dist/lib/serialization/browser.ParameterReflectionObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.TypeContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.TypeParameterContainer> */
trait SignatureReflectionObject extends js.Object {
  var comment: js.UndefOr[CommentObject] = js.undefined
  var decorates: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorObject]] = js.undefined
  var flags: ReflectionFlagsObject
  var id: Double
  var implementationOf: js.UndefOr[TypeObject] = js.undefined
  var inheritedFrom: js.UndefOr[TypeObject] = js.undefined
  var kind: Double
  var kindString: String
  var name: String
  var originalName: js.UndefOr[String] = js.undefined
  var overwrites: js.UndefOr[TypeObject] = js.undefined
  var parameters: js.UndefOr[js.Array[ParameterReflectionObject]] = js.undefined
  var `type`: js.UndefOr[TypeObject] = js.undefined
  var typeParameters: js.UndefOr[js.Array[TypeContainer]] = js.undefined
}

object SignatureReflectionObject {
  @scala.inline
  def apply(
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    comment: CommentObject = null,
    decorates: js.Array[TypeObject] = null,
    decorators: js.Array[DecoratorObject] = null,
    implementationOf: TypeObject = null,
    inheritedFrom: TypeObject = null,
    originalName: String = null,
    overwrites: TypeObject = null,
    parameters: js.Array[ParameterReflectionObject] = null,
    `type`: TypeObject = null,
    typeParameters: js.Array[TypeContainer] = null
  ): SignatureReflectionObject = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (implementationOf != null) __obj.updateDynamic("implementationOf")(implementationOf.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (overwrites != null) __obj.updateDynamic("overwrites")(overwrites.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureReflectionObject]
  }
}

