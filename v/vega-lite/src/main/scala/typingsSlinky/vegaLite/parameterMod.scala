package typingsSlinky.vegaLite

import typingsSlinky.vegaTypings.bindMod.Binding
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.signalMod.InitSignal
import typingsSlinky.vegaTypings.signalMod.NewSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parameterMod {
  
  @JSImport("vega-lite/build/src/parameter", "assembleParameterSignals")
  @js.native
  def assembleParameterSignals(params: js.Array[Parameter]): js.Array[NewSignal | InitSignal] = js.native
  
  @js.native
  trait Parameter extends StObject {
    
    /**
      * Binds the parameter to an external input element such as a slider, selection list or radio button group.
      */
    var bind: js.UndefOr[Binding] = js.native
    
    /**
      * A text description of the parameter, useful for inline documentation.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * An expression for the value of the parameter. This expression may include other parameters, in which case the parameter will automatically update in response to upstream parameter changes.
      */
    var expr: js.UndefOr[Expr] = js.native
    
    /**
      * Required. A unique name for the parameter. Parameter names should be valid JavaScript identifiers: they should contain only alphanumeric characters (or “$”, or “_”) and may not start with a digit. Reserved keywords that may not be used as parameter names are "datum", "event", "item", and "parent".
      */
    var name: String = js.native
    
    /**
      * The initial value of the parameter.
      *
      * __Default value:__ `undefined`
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object Parameter {
    
    @scala.inline
    def apply(name: String): Parameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
