package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/comments", JSImport.Namespace)
@js.native
object serializersCommentsMod extends js.Object {
  
  @js.native
  class CommentSerializer ()
    extends typingsSlinky.typedoc.serializersCommentsCommentMod.CommentSerializer
  /* static members */
  @js.native
  object CommentSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class CommentTagSerializer ()
    extends typingsSlinky.typedoc.commentTagMod.CommentTagSerializer
  /* static members */
  @js.native
  object CommentTagSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
