package typingsSlinky.vsoNodeApi.gitInterfacesMod

import typingsSlinky.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
  /**
    * Links to other related objects.
    */
  var _links: js.Any = js.native
  
  /**
    * The author of the comment.
    */
  var author: IdentityRef = js.native
  
  /**
    * The comment type at the time of creation.
    */
  var commentType: CommentType = js.native
  
  /**
    * The comment content.
    */
  var content: String = js.native
  
  /**
    * The comment ID. IDs start at 1 and are unique to a pull request.
    */
  var id: Double = js.native
  
  /**
    * Whether or not this comment was soft-deleted.
    */
  var isDeleted: Boolean = js.native
  
  /**
    * The date the comment's content was last updated.
    */
  var lastContentUpdatedDate: js.Date = js.native
  
  /**
    * The date the comment was last updated.
    */
  var lastUpdatedDate: js.Date = js.native
  
  /**
    * The ID of the parent comment. This is used for replies.
    */
  var parentCommentId: Double = js.native
  
  /**
    * The date the comment was first published.
    */
  var publishedDate: js.Date = js.native
  
  /**
    * A list of the users who have liked this comment.
    */
  var usersLiked: js.Array[IdentityRef] = js.native
}
object Comment {
  
  @scala.inline
  def apply(
    _links: js.Any,
    author: IdentityRef,
    commentType: CommentType,
    content: String,
    id: Double,
    isDeleted: Boolean,
    lastContentUpdatedDate: js.Date,
    lastUpdatedDate: js.Date,
    parentCommentId: Double,
    publishedDate: js.Date,
    usersLiked: js.Array[IdentityRef]
  ): Comment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], commentType = commentType.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastContentUpdatedDate = lastContentUpdatedDate.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], parentCommentId = parentCommentId.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], usersLiked = usersLiked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: IdentityRef): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentType(value: CommentType): Self = StObject.set(x, "commentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastContentUpdatedDate(value: js.Date): Self = StObject.set(x, "lastContentUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommentId(value: Double): Self = StObject.set(x, "parentCommentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersLiked(value: js.Array[IdentityRef]): Self = StObject.set(x, "usersLiked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersLikedVarargs(value: IdentityRef*): Self = StObject.set(x, "usersLiked", js.Array(value :_*))
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
