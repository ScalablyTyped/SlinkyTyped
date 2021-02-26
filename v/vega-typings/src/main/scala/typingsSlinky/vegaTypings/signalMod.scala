package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.axisMod._TickCount
import typingsSlinky.vegaTypings.bindMod.Binding
import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import typingsSlinky.vegaTypings.encodeMod._Field
import typingsSlinky.vegaTypings.exprMod.Expr
import typingsSlinky.vegaTypings.layoutMod.Layout
import typingsSlinky.vegaTypings.layoutMod.LayoutBounds
import typingsSlinky.vegaTypings.layoutMod._LayoutOffset
import typingsSlinky.vegaTypings.onEventsMod.OnEvent
import typingsSlinky.vegaTypings.onEventsMod._EventListener
import typingsSlinky.vegaTypings.onEventsMod._Update
import typingsSlinky.vegaTypings.scaleMod.ScaleInterpolate
import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod._RangeScheme
import typingsSlinky.vegaTypings.scaleMod._ScaleBins
import typingsSlinky.vegaTypings.transformMod.TransformField
import typingsSlinky.vegaTypings.vegaTypingsStrings.outer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signalMod {
  
  @js.native
  trait BaseSignal extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var on: js.UndefOr[js.Array[OnEvent]] = js.native
  }
  object BaseSignal {
    
    @scala.inline
    def apply(name: String): BaseSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSignal]
    }
    
    @scala.inline
    implicit class BaseSignalMutableBuilder[Self <: BaseSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnEvent*): Self = StObject.set(x, "on", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InitSignal
    extends BaseSignal
       with Signal {
    
    var bind: js.UndefOr[Binding] = js.native
    
    var init: Expr = js.native
    
    var value: js.UndefOr[SignalValue] = js.native
  }
  object InitSignal {
    
    @scala.inline
    def apply(init: Expr, name: String): InitSignal = {
      val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitSignal]
    }
    
    @scala.inline
    implicit class InitSignalMutableBuilder[Self <: InitSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setInit(value: Expr): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait NewSignal
    extends BaseSignal
       with Signal {
    
    var bind: js.UndefOr[Binding] = js.native
    
    var react: js.UndefOr[Boolean] = js.native
    
    var update: js.UndefOr[Expr] = js.native
    
    var value: js.UndefOr[SignalValue] = js.native
  }
  object NewSignal {
    
    @scala.inline
    def apply(name: String): NewSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewSignal]
    }
    
    @scala.inline
    implicit class NewSignalMutableBuilder[Self <: NewSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: Binding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setReact(value: Boolean): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
      
      @scala.inline
      def setUpdate(value: Expr): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setValue(value: SignalValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait PushSignal
    extends BaseSignal
       with Signal {
    
    var push: outer = js.native
  }
  object PushSignal {
    
    @scala.inline
    def apply(name: String, push: outer): PushSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushSignal]
    }
    
    @scala.inline
    implicit class PushSignalMutableBuilder[Self <: PushSignal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPush(value: outer): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.signalMod.NewSignal
    - typingsSlinky.vegaTypings.signalMod.InitSignal
    - typingsSlinky.vegaTypings.signalMod.PushSignal
  */
  trait Signal extends StObject
  object Signal {
    
    @scala.inline
    def InitSignal(init: Expr, name: String): typingsSlinky.vegaTypings.signalMod.InitSignal = {
      val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.InitSignal]
    }
    
    @scala.inline
    def NewSignal(name: String): typingsSlinky.vegaTypings.signalMod.NewSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.NewSignal]
    }
    
    @scala.inline
    def PushSignal(name: String, push: outer): typingsSlinky.vegaTypings.signalMod.PushSignal = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.signalMod.PushSignal]
    }
  }
  
  @js.native
  trait SignalRef
    extends BaseValueRef[js.Any]
       with Layout
       with LayoutBounds
       with ScaleInterpolate
       with SortOrder
       with TransformField
       with _EventListener
       with _Field
       with _LayoutOffset
       with _RangeScheme
       with _ScaleBins
       with _TickCount
       with _Update {
    
    var signal: String = js.native
  }
  object SignalRef {
    
    @scala.inline
    def apply(signal: String): SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalRef]
    }
    
    @scala.inline
    implicit class SignalRefMutableBuilder[Self <: SignalRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type SignalValue = js.Any
}
