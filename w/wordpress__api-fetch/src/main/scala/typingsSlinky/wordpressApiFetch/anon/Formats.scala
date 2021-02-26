package typingsSlinky.wordpressApiFetch.anon

import typingsSlinky.wordpressApiFetch.mod.Schema.PostFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formats extends StObject {
  
  var formats: js.Array[PostFormat] = js.native
  
  var `post-thumbnails`: Boolean = js.native
  
  var `responsive-embeds`: Boolean = js.native
}
object Formats {
  
  @scala.inline
  def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): Formats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`.asInstanceOf[js.Any])
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsMutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormats(value: js.Array[PostFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsVarargs(value: PostFormat*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def `setPost-thumbnails`(value: Boolean): Self = StObject.set(x, "post-thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setResponsive-embeds`(value: Boolean): Self = StObject.set(x, "responsive-embeds", value.asInstanceOf[js.Any])
  }
}
