package typingsSlinky.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/comments", JSImport.Namespace)
@js.native
object commentsMod extends js.Object {
  
  @js.native
  class Comment ()
    extends typingsSlinky.typedoc.commentsCommentMod.Comment {
    def this(shortText: String) = this()
    def this(shortText: js.UndefOr[scala.Nothing], text: String) = this()
    def this(shortText: String, text: String) = this()
  }
  
  @js.native
  class CommentTag protected ()
    extends typingsSlinky.typedoc.tagMod.CommentTag {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: js.UndefOr[scala.Nothing], text: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
  }
}
