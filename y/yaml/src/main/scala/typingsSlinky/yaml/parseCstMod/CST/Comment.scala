package typingsSlinky.yaml.parseCstMod.CST

import typingsSlinky.yaml.utilMod.Type.COMMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends Node {
  
  @JSName("anchor")
  val anchor_Comment: Null = js.native
  
  @JSName("comment")
  val comment_Comment: String = js.native
  
  @JSName("rawValue")
  val rawValue_Comment: Null = js.native
  
  @JSName("tag")
  val tag_Comment: Null = js.native
  
  @JSName("type")
  var type_Comment: COMMENT = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    anchor: Null,
    comment: String,
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: Null,
    tag: Null,
    `type`: COMMENT,
    valueRangeContainsNewline: Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawValue(value: Null): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: COMMENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
