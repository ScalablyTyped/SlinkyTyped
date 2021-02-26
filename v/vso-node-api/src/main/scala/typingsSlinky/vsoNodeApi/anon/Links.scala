package typingsSlinky.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Links extends StObject {
  
  var all: scala.Double = js.native
  
  var fields: scala.Double = js.native
  
  var links: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var relations: scala.Double = js.native
}
object Links {
  
  @scala.inline
  def apply(
    all: scala.Double,
    fields: scala.Double,
    links: scala.Double,
    none: scala.Double,
    relations: scala.Double
  ): Links = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: scala.Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: scala.Double): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: scala.Double): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
  }
}
