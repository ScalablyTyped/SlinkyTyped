package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.encodeMod.LinearGradient
import typingsSlinky.vegaTypings.encodeMod.RadialGradient
import typingsSlinky.vegaTypings.encodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends _ColorValueRef {
  
  var value: LinearGradient | RadialGradient = js.native
}
object `0` {
  
  @scala.inline
  def apply(value: LinearGradient | RadialGradient): `0` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: LinearGradient | RadialGradient): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
