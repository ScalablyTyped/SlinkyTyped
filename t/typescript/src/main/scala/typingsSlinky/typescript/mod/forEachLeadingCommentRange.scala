package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "forEachLeadingCommentRange")
@js.native
object forEachLeadingCommentRange extends js.Object {
  
  def apply[U](
    text: java.lang.String,
    pos: Double,
    cb: js.Function4[
      /* pos */ Double, 
      /* end */ Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def apply[T, U](
    text: java.lang.String,
    pos: Double,
    cb: js.Function5[
      /* pos */ Double, 
      /* end */ Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
}
