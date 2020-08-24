package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.commentMetadataMod.CommentMetadataProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommentMetadata {
  @JSImport("semantic-ui-react", "CommentMetadata")
  @js.native
  object component extends js.Object
  
  def withProps(p: CommentMetadataProps): SharedBuilder_CommentMetadataProps9012462 = new SharedBuilder_CommentMetadataProps9012462(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CommentMetadata.type): SharedBuilder_CommentMetadataProps9012462 = new SharedBuilder_CommentMetadataProps9012462(js.Array(this.component, js.Dictionary.empty))()
}

