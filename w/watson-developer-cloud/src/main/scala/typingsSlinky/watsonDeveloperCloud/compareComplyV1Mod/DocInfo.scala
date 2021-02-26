package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the parsed input document. */
@js.native
trait DocInfo extends StObject {
  
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.native
  
  /** The full text of the parsed document in HTML format. */
  var html: js.UndefOr[String] = js.native
  
  /** The title of the parsed document. If the service did not detect a title, the value of this element is `null`. */
  var title: js.UndefOr[String] = js.native
}
object DocInfo {
  
  @scala.inline
  def apply(): DocInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocInfo]
  }
  
  @scala.inline
  implicit class DocInfoMutableBuilder[Self <: DocInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
