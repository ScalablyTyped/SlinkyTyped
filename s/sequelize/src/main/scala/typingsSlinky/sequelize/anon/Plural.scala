package typingsSlinky.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plural extends StObject {
  
  var plural: String = js.native
  
  var singular: String = js.native
}
object Plural {
  
  @scala.inline
  def apply(plural: String, singular: String): Plural = {
    val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plural]
  }
  
  @scala.inline
  implicit class PluralMutableBuilder[Self <: Plural] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
  }
}
