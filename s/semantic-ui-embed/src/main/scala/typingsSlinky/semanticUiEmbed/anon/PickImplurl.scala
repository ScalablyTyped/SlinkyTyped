package typingsSlinky.semanticUiEmbed.anon

import typingsSlinky.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'url'> */
@js.native
trait PickImplurl extends StObject {
  
  var url: `false` | String = js.native
}
object PickImplurl {
  
  @scala.inline
  def apply(url: `false` | String): PickImplurl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurl]
  }
  
  @scala.inline
  implicit class PickImplurlMutableBuilder[Self <: PickImplurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: `false` | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
