package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldScale
  extends ScaledValueRef[js.Any] {
  
  var field: typingsSlinky.vegaTypings.encodeMod.Field = js.native
  
  var scale: typingsSlinky.vegaTypings.encodeMod.Field = js.native
}
object FieldScale {
  
  @scala.inline
  def apply(field: typingsSlinky.vegaTypings.encodeMod.Field, scale: typingsSlinky.vegaTypings.encodeMod.Field): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
  
  @scala.inline
  implicit class FieldScaleMutableBuilder[Self <: FieldScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: typingsSlinky.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
