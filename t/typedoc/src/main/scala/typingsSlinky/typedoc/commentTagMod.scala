package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialCommentTag
import typingsSlinky.typedoc.modelsMod.CommentTag
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", JSImport.Namespace)
@js.native
object commentTagMod extends js.Object {
  @js.native
  class CommentTagSerializer () extends SerializerComponent[CommentTag] {
    def toObject(tag: CommentTag, obj: PartialCommentTag): typingsSlinky.typedoc.schemaMod.CommentTag = js.native
  }
  
  /* static members */
  @js.native
  object CommentTagSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

