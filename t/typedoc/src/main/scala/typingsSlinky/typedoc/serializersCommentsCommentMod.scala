package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialComment
import typingsSlinky.typedoc.modelsMod.Comment
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersCommentsCommentMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", "CommentSerializer")
  @js.native
  class CommentSerializer protected () extends SerializerComponent[Comment] {
    def this(owner: Serializer) = this()
    
    def toObject(comment: Comment, obj: PartialComment): typingsSlinky.typedoc.schemaMod.Comment = js.native
  }
  /* static members */
  object CommentSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", "CommentSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment", "CommentSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
