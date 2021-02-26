package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseTag
  - typingsSlinky.wordpressApiFetch.anon.PickBaseTagTag
*/
trait Tag[T /* <: Context */] extends StObject
object Tag {
  
  @scala.inline
  def BaseTag(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): typingsSlinky.wordpressApiFetch.mod.Schema.BaseTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wordpressApiFetch.mod.Schema.BaseTag]
  }
  
  @scala.inline
  def PickBaseTagTag(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): typingsSlinky.wordpressApiFetch.anon.PickBaseTagTag = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wordpressApiFetch.anon.PickBaseTagTag]
  }
}
