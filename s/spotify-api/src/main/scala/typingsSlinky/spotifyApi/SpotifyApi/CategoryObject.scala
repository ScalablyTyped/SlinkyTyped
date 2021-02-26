package typingsSlinky.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Category Object
  * [category object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CategoryObject extends StObject {
  
  var href: String = js.native
  
  var icons: js.Array[ImageObject] = js.native
  
  var id: String = js.native
  
  var name: String = js.native
}
object CategoryObject {
  
  @scala.inline
  def apply(href: String, icons: js.Array[ImageObject], id: String, name: String): CategoryObject = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryObject]
  }
  
  @scala.inline
  implicit class CategoryObjectMutableBuilder[Self <: CategoryObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: js.Array[ImageObject]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsVarargs(value: ImageObject*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
