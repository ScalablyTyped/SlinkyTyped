package typingsSlinky.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueAlign extends StObject {
  
  var value: typingsSlinky.vegaTypings.encodeMod.Align = js.native
}
object ValueAlign {
  
  @scala.inline
  def apply(value: typingsSlinky.vegaTypings.encodeMod.Align): ValueAlign = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAlign]
  }
  
  @scala.inline
  implicit class ValueAlignMutableBuilder[Self <: ValueAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: typingsSlinky.vegaTypings.encodeMod.Align): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
