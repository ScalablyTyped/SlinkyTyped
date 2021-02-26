package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Normalized
import typingsSlinky.vegaLite.binMod.Bin
import typingsSlinky.vegaLite.channeldefMod.FieldDefBase
import typingsSlinky.vegaLite.channeldefMod.FieldTitleFormatter
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.specMod.TopLevelSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaUtil.mod.LoggerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileMod {
  
  @JSImport("vega-lite/build/src/compile/compile", "compile")
  @js.native
  def compile(inputSpec: TopLevelSpec): Normalized = js.native
  @JSImport("vega-lite/build/src/compile/compile", "compile")
  @js.native
  def compile(inputSpec: TopLevelSpec, opt: CompileOptions): Normalized = js.native
  
  @js.native
  trait CompileOptions extends StObject {
    
    /**
      * Sets a Vega-Lite configuration.
      */
    var config: js.UndefOr[Config[ExprRef | SignalRef]] = js.native
    
    /**
      * Sets a field title formatter.
      */
    var fieldTitle: js.UndefOr[FieldTitleFormatter] = js.native
    
    /**
      * Sets a custom logger.
      */
    var logger: js.UndefOr[LoggerInterface] = js.native
  }
  object CompileOptions {
    
    @scala.inline
    def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setFieldTitle(
        value: (/* fieldDef */ FieldDefBase[String, Bin], /* config */ Config[ExprRef | SignalRef]) => String
      ): Self = StObject.set(x, "fieldTitle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFieldTitleUndefined: Self = StObject.set(x, "fieldTitle", js.undefined)
      
      @scala.inline
      def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
