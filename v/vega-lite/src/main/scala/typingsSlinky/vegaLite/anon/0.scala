package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.Conditional
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] extends StObject {
  
  var condition: Conditional[TypedFieldDef[F, _, Boolean | BinParams | binned | Null]] = js.native
}
object `0` {
  
  @scala.inline
  def apply[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](condition: Conditional[TypedFieldDef[F, _, Boolean | BinParams | binned | Null]]): `0`[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[F]]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`[_], F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] (val x: Self with `0`[F]) extends AnyVal {
    
    @scala.inline
    def setCondition(value: Conditional[TypedFieldDef[F, _, Boolean | BinParams | binned | Null]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
