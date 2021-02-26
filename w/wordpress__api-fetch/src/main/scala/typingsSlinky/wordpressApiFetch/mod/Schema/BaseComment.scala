package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Dictk
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.approved
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.hold
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.spam
import typingsSlinky.wordpressApiFetch.wordpressApiFetchStrings.trash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseComment[T /* <: Context */] extends BaseResponse {
  
  var author: Double = js.native
  
  var author_avatar_urls: Record[Double, String] = js.native
  
  var author_email: String = js.native
  
  var author_ip: String = js.native
  
  var author_name: String = js.native
  
  var author_url: String = js.native
  
  var author_user_agent: String = js.native
  
  var content: Contextual[T, js.Object, js.Object] = js.native
  
  var date: String = js.native
  
  var date_gmt: String = js.native
  
  var id: Double = js.native
  
  var link: String = js.native
  
  var meta: js.Array[_] = js.native
  
  var parent: Double = js.native
  
  var post: Double = js.native
  
  var status: approved | hold | spam | trash = js.native
  
  var `type`: String = js.native
}
object BaseComment {
  
  @scala.inline
  def apply[T /* <: Context */](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    author_avatar_urls: Record[Double, String],
    author_email: String,
    author_ip: String,
    author_name: String,
    author_url: String,
    author_user_agent: String,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_avatar_urls = author_avatar_urls.asInstanceOf[js.Any], author_email = author_email.asInstanceOf[js.Any], author_ip = author_ip.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], author_user_agent = author_user_agent.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment[T]]
  }
  
  @scala.inline
  implicit class BaseCommentMutableBuilder[Self <: BaseComment[_], T /* <: Context */] (val x: Self with BaseComment[T]) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_avatar_urls(value: Record[Double, String]): Self = StObject.set(x, "author_avatar_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_email(value: String): Self = StObject.set(x, "author_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_ip(value: String): Self = StObject.set(x, "author_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_user_agent(value: String): Self = StObject.set(x, "author_user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Contextual[T, js.Object, js.Object]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_gmt(value: String): Self = StObject.set(x, "date_gmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Array[_]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaVarargs(value: js.Any*): Self = StObject.set(x, "meta", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost(value: Double): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: approved | hold | spam | trash): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
