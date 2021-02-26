package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldOrDatumDef extends StObject {
  
  var fieldOrDatumDef: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = js.native
  
  var scaleType: typingsSlinky.vegaLite.scaleMod.ScaleType = js.native
  
  var size: js.UndefOr[SignalRef] = js.native
  
  var values: js.UndefOr[(js.Array[Boolean | DateTime | Double | String]) | SignalRef] = js.native
}
object FieldOrDatumDef {
  
  @scala.inline
  def apply(
    fieldOrDatumDef: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    scaleType: typingsSlinky.vegaLite.scaleMod.ScaleType
  ): FieldOrDatumDef = {
    val __obj = js.Dynamic.literal(fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrDatumDef]
  }
  
  @scala.inline
  implicit class FieldOrDatumDefMutableBuilder[Self <: FieldOrDatumDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOrDatumDef(
      value: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleType(value: typingsSlinky.vegaLite.scaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setValues(value: (js.Array[Boolean | DateTime | Double | String]) | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
