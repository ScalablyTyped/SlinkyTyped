package typingsSlinky.typedoc

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.typedoc.distLibModelsMod.CommentTag
import typingsSlinky.typedoc.distLibSerializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments/comment-tag", JSImport.Namespace)
@js.native
object distLibSerializationSerializersCommentsCommentDashTagMod extends js.Object {
  @js.native
  class CommentTagSerializer () extends SerializerComponent[CommentTag] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_CommentTagSerializer: Instantiable3[
        /* tagName */ String, 
        js.UndefOr[/* paramName */ String], 
        js.UndefOr[/* text */ String], 
        CommentTag
      ] = js.native
  }
  
  /* static members */
  @js.native
  object CommentTagSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

