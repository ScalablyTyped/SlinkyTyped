package typingsSlinky.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.encodeMod.BaseValueRef[T]
  - typingsSlinky.vegaTypings.anon.Scale
  - typingsSlinky.vegaTypings.anon.FieldScale
  - typingsSlinky.vegaTypings.anon.Band
  - typingsSlinky.vegaTypings.anon.Range
*/
trait ScaledValueRef[T] extends StObject
object ScaledValueRef {
  
  @scala.inline
  def Band(band: Boolean | Double, scale: Field): typingsSlinky.vegaTypings.anon.Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Band]
  }
  
  @scala.inline
  def Field(field: typingsSlinky.vegaTypings.encodeMod.Field): typingsSlinky.vegaTypings.anon.Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Field]
  }
  
  @scala.inline
  def FieldScale(field: Field, scale: Field): typingsSlinky.vegaTypings.anon.FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.FieldScale]
  }
  
  @scala.inline
  def Range(range: Double | Boolean, scale: Field): typingsSlinky.vegaTypings.anon.Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Range]
  }
  
  @scala.inline
  def Scale(scale: Field): typingsSlinky.vegaTypings.anon.Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Scale]
  }
  
  @scala.inline
  def SignalRef(signal: String): typingsSlinky.vegaTypings.signalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.SignalRef]
  }
  
  @scala.inline
  def Value[T](): typingsSlinky.vegaTypings.anon.Value[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Value[T]]
  }
}
