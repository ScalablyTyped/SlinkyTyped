package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialComment
import typingsSlinky.typedoc.modelsMod.Comment
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", JSImport.Namespace)
@js.native
object serializersCommentsCommentMod extends js.Object {
  @js.native
  class CommentSerializer () extends SerializerComponent[Comment] {
    def toObject(comment: Comment, obj: PartialComment): typingsSlinky.typedoc.schemaMod.Comment = js.native
  }
  
  /* static members */
  @js.native
  object CommentSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

