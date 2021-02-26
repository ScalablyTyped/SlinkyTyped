package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.typeormStrings.dirty_read
import typingsSlinky.typeorm.typeormStrings.pessimistic_partial_write
import typingsSlinky.typeorm.typeormStrings.pessimistic_read
import typingsSlinky.typeorm.typeormStrings.pessimistic_write
import typingsSlinky.typeorm.typeormStrings.pessimistic_write_or_fail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var mode: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail = js.native
}
object `2` {
  
  @scala.inline
  def apply(
    mode: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail
  ): `2` = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(
      value: pessimistic_read | pessimistic_write | dirty_read | pessimistic_partial_write | pessimistic_write_or_fail
    ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
