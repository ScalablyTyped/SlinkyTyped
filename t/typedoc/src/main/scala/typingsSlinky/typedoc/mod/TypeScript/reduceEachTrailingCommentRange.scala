package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.CommentKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.reduceEachTrailingCommentRange")
@js.native
object reduceEachTrailingCommentRange extends js.Object {
  
  def apply[T, U](
    text: String,
    pos: Double,
    cb: js.Function6[
      /* pos */ Double, 
      /* end */ Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ Boolean, 
      /* state */ T, 
      /* memo */ U, 
      U
    ],
    state: T,
    initial: U
  ): js.UndefOr[U] = js.native
}
