package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/browser.ReflectionContainer */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.CommentContainer<typedoc.typedoc/dist/lib/serialization/browser.CommentObject>> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratesContainer> */
/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/browser.DecoratorsContainer<typedoc.typedoc/dist/lib/serialization/browser.DecoratorObject>> */
trait ReflectionObject extends js.Object {
  var comment: js.UndefOr[CommentObject] = js.undefined
  var decorates: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorObject]] = js.undefined
  var flags: ReflectionFlagsObject
  var id: Double
  var kind: Double
  var kindString: String
  var name: String
  var originalName: js.UndefOr[String] = js.undefined
}

object ReflectionObject {
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
    originalName: String = null
  ): ReflectionObject = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (decorates != null) __obj.updateDynamic("decorates")(decorates.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionObject]
  }
}

