package typingsSlinky.vegaLite.srcMarkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericMarkDef[M] extends StObject {
  
  /**
    * The mark type. This could a primitive mark type
    * (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
    * `"area"`, `"point"`, `"geoshape"`, `"rule"`, and `"text"`)
    * or a composite mark type (`"boxplot"`, `"errorband"`, `"errorbar"`).
    */
  var `type`: M = js.native
}
object GenericMarkDef {
  
  @scala.inline
  def apply[M](`type`: M): GenericMarkDef[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericMarkDef[M]]
  }
  
  @scala.inline
  implicit class GenericMarkDefMutableBuilder[Self <: GenericMarkDef[_], M] (val x: Self with GenericMarkDef[M]) extends AnyVal {
    
    @scala.inline
    def setType(value: M): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
