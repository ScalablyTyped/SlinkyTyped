package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Dictk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wordpressApiFetch.mod.Schema.BaseCategory
  - typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategoryCount
  - typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategory
*/
trait Category[T /* <: Context */] extends StObject
object Category {
  
  @scala.inline
  def BaseCategory(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind
  ): typingsSlinky.wordpressApiFetch.mod.Schema.BaseCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wordpressApiFetch.mod.Schema.BaseCategory]
  }
  
  @scala.inline
  def PickBaseCategoryCategory(
    _links: Record[String, js.Array[Dictk]],
    id: Double,
    link: String,
    name: String,
    slug: String,
    taxonomy: TaxonomyKind
  ): typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategory]
  }
  
  @scala.inline
  def PickBaseCategoryCategoryCount(
    _links: Record[String, js.Array[Dictk]],
    count: Double,
    description: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    name: String,
    parent: Double,
    slug: String,
    taxonomy: TaxonomyKind
  ): typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategoryCount = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], taxonomy = taxonomy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.wordpressApiFetch.anon.PickBaseCategoryCategoryCount]
  }
}
