package typingsSlinky.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tryghostContentApi.mod.PostOrPage
  - typingsSlinky.tryghostContentApi.mod.Author
  - typingsSlinky.tryghostContentApi.mod.Tag
  - typingsSlinky.tryghostContentApi.mod.Settings
*/
trait GhostData extends StObject
object GhostData {
  
  @scala.inline
  def Author(id: String, slug: String): typingsSlinky.tryghostContentApi.mod.Author = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tryghostContentApi.mod.Author]
  }
  
  @scala.inline
  def PostOrPage(id: String, slug: String): typingsSlinky.tryghostContentApi.mod.PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tryghostContentApi.mod.PostOrPage]
  }
  
  @scala.inline
  def Settings(): typingsSlinky.tryghostContentApi.mod.Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.tryghostContentApi.mod.Settings]
  }
  
  @scala.inline
  def Tag(id: String, slug: String): typingsSlinky.tryghostContentApi.mod.Tag = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tryghostContentApi.mod.Tag]
  }
}
