package typingsSlinky.vegaTypings.scaleMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.sqrt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqrtScale
  extends NumericScale
     with Scale {
  
  @JSName("type")
  var type_SqrtScale: sqrt = js.native
}
object SqrtScale {
  
  @scala.inline
  def apply(name: String, `type`: sqrt): SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqrtScale]
  }
  
  @scala.inline
  implicit class SqrtScaleMutableBuilder[Self <: SqrtScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sqrt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
