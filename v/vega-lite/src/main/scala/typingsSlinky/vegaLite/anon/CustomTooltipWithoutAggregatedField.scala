package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTooltipWithoutAggregatedField[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] extends StObject {
  
  var customTooltipWithoutAggregatedField: js.UndefOr[
    StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
  ] = js.native
  
  var filteredEncoding: typingsSlinky.vegaLite.encodingMod.Encoding[F] = js.native
}
object CustomTooltipWithoutAggregatedField {
  
  @scala.inline
  def apply[F /* <: typingsSlinky.vegaLite.channeldefMod.Field */](filteredEncoding: typingsSlinky.vegaLite.encodingMod.Encoding[F]): CustomTooltipWithoutAggregatedField[F] = {
    val __obj = js.Dynamic.literal(filteredEncoding = filteredEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  }
  
  @scala.inline
  implicit class CustomTooltipWithoutAggregatedFieldMutableBuilder[Self <: CustomTooltipWithoutAggregatedField[_], F /* <: typingsSlinky.vegaLite.channeldefMod.Field */] (val x: Self with CustomTooltipWithoutAggregatedField[F]) extends AnyVal {
    
    @scala.inline
    def setCustomTooltipWithoutAggregatedField(
      value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
    ): Self = StObject.set(x, "customTooltipWithoutAggregatedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTooltipWithoutAggregatedFieldUndefined: Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.undefined)
    
    @scala.inline
    def setCustomTooltipWithoutAggregatedFieldVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.Array(value :_*))
    
    @scala.inline
    def setFilteredEncoding(value: typingsSlinky.vegaLite.encodingMod.Encoding[F]): Self = StObject.set(x, "filteredEncoding", value.asInstanceOf[js.Any])
  }
}
