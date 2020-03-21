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
trait ProjectReflectionObject extends js.Object {
  var categories: js.UndefOr[js.Array[ReflectionCategoryObject]] = js.undefined
  var children: js.Array[ReflectionObject]
  var comment: js.UndefOr[CommentObject] = js.undefined
  var decorates: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorObject]] = js.undefined
  var flags: ReflectionFlagsObject
  var groups: js.UndefOr[js.Array[ReflectionGroupObject]] = js.undefined
  var id: Double
  var kind: Double
  var kindString: String
  var name: String
  var originalName: js.UndefOr[String] = js.undefined
  var sources: js.UndefOr[js.Array[SourceReferenceObject]] = js.undefined
}

object ProjectReflectionObject {
  @scala.inline
  def apply(
    children: js.Array[ReflectionObject],
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    categories: js.Array[ReflectionCategoryObject] = null,
    comment: CommentObject = null,
    decorates: js.Array[TypeObject] = null,
    decorators: js.Array[DecoratorObject] = null,
    groups: js.Array[ReflectionGroupObject] = null,
    originalName: String = null,
    sources: js.Array[SourceReferenceObject] = null
  ): ProjectReflectionObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectReflectionObject]
  }
}

