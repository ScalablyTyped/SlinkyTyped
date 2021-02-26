package typingsSlinky.umbraco.umbraco.services

import typingsSlinky.umbraco.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search content
  */
@js.native
trait ISearchContent extends StObject {
  
  var editorPath: String = js.native
  
  var id: Double = js.native
  
  var menuUrl: String = js.native
  
  var metaData: Url = js.native
  
  var subTitle: String = js.native
}
object ISearchContent {
  
  @scala.inline
  def apply(editorPath: String, id: Double, menuUrl: String, metaData: Url, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchContent]
  }
  
  @scala.inline
  implicit class ISearchContentMutableBuilder[Self <: ISearchContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditorPath(value: String): Self = StObject.set(x, "editorPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUrl(value: String): Self = StObject.set(x, "menuUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: Url): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
  }
}
