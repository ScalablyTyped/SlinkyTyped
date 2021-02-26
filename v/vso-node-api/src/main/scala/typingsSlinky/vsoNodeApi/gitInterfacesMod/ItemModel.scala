package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemModel extends StObject {
  
  var _links: js.Any = js.native
  
  var contentMetadata: FileContentMetadata = js.native
  
  var isFolder: Boolean = js.native
  
  var isSymLink: Boolean = js.native
  
  var path: String = js.native
  
  var url: String = js.native
}
object ItemModel {
  
  @scala.inline
  def apply(
    _links: js.Any,
    contentMetadata: FileContentMetadata,
    isFolder: Boolean,
    isSymLink: Boolean,
    path: String,
    url: String
  ): ItemModel = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemModel]
  }
  
  @scala.inline
  implicit class ItemModelMutableBuilder[Self <: ItemModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentMetadata(value: FileContentMetadata): Self = StObject.set(x, "contentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSymLink(value: Boolean): Self = StObject.set(x, "isSymLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
