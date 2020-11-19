package typingsSlinky.wordpressApiFetch.anon

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.mod.Schema.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@wordpress/api-fetch.@wordpress/api-fetch.Schema.BaseStatus, @wordpress/api-fetch.@wordpress/api-fetch.Schema.ViewKeys.Status> */
@js.native
trait PickBaseStatusStatusEmbedded
  extends Status[js.Any] {
  
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  
  var _links: Record[String, js.Array[Dictk]] = js.native
  
  var name: String = js.native
  
  var public: Boolean = js.native
  
  var queryable: Boolean = js.native
  
  var slug: String = js.native
}
object PickBaseStatusStatusEmbedded {
  
  @scala.inline
  def apply(
    _links: Record[String, js.Array[Dictk]],
    name: String,
    public: Boolean,
    queryable: Boolean,
    slug: String
  ): PickBaseStatusStatusEmbedded = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickBaseStatusStatusEmbedded]
  }
  
  @scala.inline
  implicit class PickBaseStatusStatusEmbeddedOps[Self <: PickBaseStatusStatusEmbedded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_links(value: Record[String, js.Array[Dictk]]): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryable(value: Boolean): Self = this.set("queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = this.set("_embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_embedded: Self = this.set("_embedded", js.undefined)
  }
}
