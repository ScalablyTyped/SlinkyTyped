package typingsSlinky.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tryghostContentApi.mod.PostOrPage
  - typingsSlinky.tryghostContentApi.mod.Author
  - typingsSlinky.tryghostContentApi.mod.Tag
  - typingsSlinky.tryghostContentApi.mod.Settings
*/
trait GhostData extends js.Object

object GhostData {
  @scala.inline
  def PostOrPage(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Author(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Tag(id: String, slug: String): GhostData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostData]
  }
  @scala.inline
  def Settings(): GhostData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GhostData]
  }
}

