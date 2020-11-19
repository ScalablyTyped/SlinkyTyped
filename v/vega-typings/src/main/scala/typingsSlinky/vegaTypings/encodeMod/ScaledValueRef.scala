package typingsSlinky.vegaTypings.encodeMod

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
trait ScaledValueRef[T] extends js.Object
object ScaledValueRef {
  
  @scala.inline
  def Band[T](band: Boolean | Double, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def Scale[T](scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def Range[T](range: Double | Boolean, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def FieldScale[T](field: Field, scale: Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def Field[T](field: typingsSlinky.vegaTypings.encodeMod.Field): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def SignalRef[T](signal: String): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
  
  @scala.inline
  def Value[T](): ScaledValueRef[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaledValueRef[T]]
  }
}
