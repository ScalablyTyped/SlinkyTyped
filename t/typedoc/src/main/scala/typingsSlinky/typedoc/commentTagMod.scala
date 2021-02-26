package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialCommentTag
import typingsSlinky.typedoc.modelsMod.CommentTag
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentTagMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
  @js.native
  class CommentTagSerializer protected () extends SerializerComponent[CommentTag] {
    def this(owner: Serializer) = this()
    
    def toObject(tag: CommentTag, obj: PartialCommentTag): typingsSlinky.typedoc.schemaMod.CommentTag = js.native
  }
  /* static members */
  object CommentTagSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", "CommentTagSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
