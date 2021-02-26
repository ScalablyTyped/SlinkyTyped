package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaLiteStrings.datum
import typingsSlinky.vegaLite.vegaLiteStrings.datumDotdatum
import typingsSlinky.vegaLite.vegaLiteStrings.parent
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expr extends StObject {
  
  var config: typingsSlinky.vegaLite.srcConfigMod.Config[ExprRef | SignalRef] = js.native
  
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var fieldOrDatumDef: (typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = js.native
  
  var format: String | Dict[_] = js.native
  
  var formatType: String = js.native
  
  var normalizeStack: js.UndefOr[Boolean] = js.native
}
object Expr {
  
  @scala.inline
  def apply(
    config: typingsSlinky.vegaLite.srcConfigMod.Config[ExprRef | SignalRef],
    fieldOrDatumDef: (typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    format: String | Dict[_],
    formatType: String
  ): Expr = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  
  @scala.inline
  implicit class ExprMutableBuilder[Self <: Expr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: typingsSlinky.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOrDatumDef(
      value: (typingsSlinky.vegaLite.channeldefMod.FieldDef[String, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Dict[_]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
  }
}
