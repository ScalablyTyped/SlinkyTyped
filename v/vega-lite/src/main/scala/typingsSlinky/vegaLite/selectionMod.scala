package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Escape
import typingsSlinky.vegaLite.dataflowMod.OutputNode
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.projectMod.SelectionProjection
import typingsSlinky.vegaLite.projectMod.SelectionProjectionComponent
import typingsSlinky.vegaLite.srcSelectionMod.BrushConfig
import typingsSlinky.vegaLite.srcSelectionMod.LegendBinding
import typingsSlinky.vegaLite.srcSelectionMod.SelectionInit
import typingsSlinky.vegaLite.srcSelectionMod.SelectionInitInterval
import typingsSlinky.vegaLite.srcSelectionMod.SelectionResolution
import typingsSlinky.vegaLite.srcSelectionMod.SelectionType
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaLiteStrings.all
import typingsSlinky.vegaLite.vegaLiteStrings.none
import typingsSlinky.vegaLite.vegaLiteStrings.scales
import typingsSlinky.vegaTypings.bindMod.Binding
import typingsSlinky.vegaTypings.signalMod.NewSignal
import typingsSlinky.vegaTypings.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @JSImport("vega-lite/build/src/compile/selection", "MODIFY")
  @js.native
  val MODIFY: /* "_modify" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "SELECTION_DOMAIN")
  @js.native
  val SELECTION_DOMAIN: /* "_selection_domain_" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "STORE")
  @js.native
  val STORE: /* "_store" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "TUPLE")
  @js.native
  val TUPLE: /* "_tuple" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "VL_SELECTION_RESOLVE")
  @js.native
  val VL_SELECTION_RESOLVE: /* "vlSelectionResolve" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "forEachSelection")
  @js.native
  def forEachSelection(
    model: Model,
    cb: js.Function2[
      /* selCmpt */ SelectionComponent[SelectionType], 
      /* selCompiler */ SelectionCompiler[SelectionType], 
      Unit | Boolean
    ]
  ): Unit = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "requiresSelectionId")
  @js.native
  def requiresSelectionId(model: Model): Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/selection", "unitName")
  @js.native
  def unitName(model: Model): String = js.native
  @JSImport("vega-lite/build/src/compile/selection", "unitName")
  @js.native
  def unitName(model: Model, hasEscape: Escape): String = js.native
  
  @js.native
  trait SelectionCompiler[T /* <: SelectionType */] extends StObject {
    
    var marks: js.UndefOr[
        js.Function3[
          /* model */ UnitModel, 
          /* selCmpt */ SelectionComponent[T], 
          /* marks */ js.Array[_], 
          js.Array[_]
        ]
      ] = js.native
    
    def modifyExpr(model: UnitModel, selCmpt: SelectionComponent[T]): String = js.native
    
    def signals(model: UnitModel, selCmpt: SelectionComponent[T]): js.Array[NewSignal] = js.native
    
    var topLevelSignals: js.UndefOr[
        js.Function3[
          /* model */ Model, 
          /* selCmpt */ SelectionComponent[T], 
          /* signals */ js.Array[NewSignal], 
          js.Array[NewSignal]
        ]
      ] = js.native
  }
  object SelectionCompiler {
    
    @scala.inline
    def apply[T /* <: SelectionType */](
      modifyExpr: (UnitModel, SelectionComponent[T]) => String,
      signals: (UnitModel, SelectionComponent[T]) => js.Array[NewSignal]
    ): SelectionCompiler[T] = {
      val __obj = js.Dynamic.literal(modifyExpr = js.Any.fromFunction2(modifyExpr), signals = js.Any.fromFunction2(signals))
      __obj.asInstanceOf[SelectionCompiler[T]]
    }
    
    @scala.inline
    implicit class SelectionCompilerMutableBuilder[Self <: SelectionCompiler[_], T /* <: SelectionType */] (val x: Self with SelectionCompiler[T]) extends AnyVal {
      
      @scala.inline
      def setMarks(
        value: (/* model */ UnitModel, /* selCmpt */ SelectionComponent[T], /* marks */ js.Array[_]) => js.Array[_]
      ): Self = StObject.set(x, "marks", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setModifyExpr(value: (UnitModel, SelectionComponent[T]) => String): Self = StObject.set(x, "modifyExpr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSignals(value: (UnitModel, SelectionComponent[T]) => js.Array[NewSignal]): Self = StObject.set(x, "signals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTopLevelSignals(
        value: (/* model */ Model, /* selCmpt */ SelectionComponent[T], /* signals */ js.Array[NewSignal]) => js.Array[NewSignal]
      ): Self = StObject.set(x, "topLevelSignals", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTopLevelSignalsUndefined: Self = StObject.set(x, "topLevelSignals", js.undefined)
    }
  }
  
  @js.native
  trait SelectionComponent[T /* <: SelectionType */] extends StObject {
    
    var bind: js.UndefOr[scales | Binding | Dict[Binding] | LegendBinding] = js.native
    
    var clear: js.UndefOr[js.Any] = js.native
    
    var empty: all | none = js.native
    
    var events: js.Array[Stream] = js.native
    
    var init: js.UndefOr[js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]] = js.native
    
    var mark: js.UndefOr[BrushConfig] = js.native
    
    var materialized: OutputNode = js.native
    
    var name: String = js.native
    
    var nearest: js.UndefOr[js.Any] = js.native
    
    var project: js.UndefOr[SelectionProjectionComponent] = js.native
    
    var resolve: SelectionResolution = js.native
    
    var scales: js.UndefOr[js.Array[SelectionProjection]] = js.native
    
    var toggle: js.UndefOr[js.Any] = js.native
    
    var translate: js.UndefOr[js.Any] = js.native
    
    var `type`: T = js.native
    
    var zoom: js.UndefOr[js.Any] = js.native
  }
  object SelectionComponent {
    
    @scala.inline
    def apply[T /* <: SelectionType */](
      empty: all | none,
      events: js.Array[Stream],
      materialized: OutputNode,
      name: String,
      resolve: SelectionResolution,
      `type`: T
    ): SelectionComponent[T] = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], materialized = materialized.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionComponent[T]]
    }
    
    @scala.inline
    implicit class SelectionComponentMutableBuilder[Self <: SelectionComponent[_], T /* <: SelectionType */] (val x: Self with SelectionComponent[T]) extends AnyVal {
      
      @scala.inline
      def setBind(value: scales | Binding | Dict[Binding] | LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setClear(value: js.Any): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setEmpty(value: all | none): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: js.Array[Stream]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Stream*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setInit(value: js.Array[SelectionInit | js.Array[SelectionInit] | SelectionInitInterval]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setInitVarargs(value: (SelectionInit | js.Array[SelectionInit] | SelectionInitInterval)*): Self = StObject.set(x, "init", js.Array(value :_*))
      
      @scala.inline
      def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setMaterialized(value: OutputNode): Self = StObject.set(x, "materialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearest(value: js.Any): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      @scala.inline
      def setProject(value: SelectionProjectionComponent): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: js.Array[SelectionProjection]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
      
      @scala.inline
      def setScalesVarargs(value: SelectionProjection*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setToggle(value: js.Any): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setTranslate(value: js.Any): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: js.Any): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
