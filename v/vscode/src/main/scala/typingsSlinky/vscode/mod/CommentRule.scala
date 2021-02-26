package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentRule extends StObject {
  
  /**
    * The block comment character pair, like `/ * block comment *&#47;`
    */
  var blockComment: js.UndefOr[CharacterPair] = js.native
  
  /**
    * The line comment token, like `// this is a comment`
    */
  var lineComment: js.UndefOr[String] = js.native
}
object CommentRule {
  
  @scala.inline
  def apply(): CommentRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentRule]
  }
  
  @scala.inline
  implicit class CommentRuleMutableBuilder[Self <: CommentRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockComment(value: CharacterPair): Self = StObject.set(x, "blockComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockCommentUndefined: Self = StObject.set(x, "blockComment", js.undefined)
    
    @scala.inline
    def setLineComment(value: String): Self = StObject.set(x, "lineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCommentUndefined: Self = StObject.set(x, "lineComment", js.undefined)
  }
}
