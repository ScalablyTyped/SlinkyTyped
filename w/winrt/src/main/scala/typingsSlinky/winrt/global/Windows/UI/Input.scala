package typingsSlinky.winrt.global.Windows.UI

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.UI.Input.IPointerPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
  @js.native
  class CrossSlidingEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.CrossSlidingEventArgs
  
  @JSGlobal("Windows.UI.Input.CrossSlidingState")
  @js.native
  object CrossSlidingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState with Double] = js.native
    
    /* 6 */ val completed: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.completed with Double = js.native
    
    /* 1 */ val dragging: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.dragging with Double = js.native
    
    /* 5 */ val rearranging: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.rearranging with Double = js.native
    
    /* 3 */ val selectSpeedBumping: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping with Double = js.native
    
    /* 2 */ val selecting: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.selecting with Double = js.native
    
    /* 4 */ val speedBumping: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.speedBumping with Double = js.native
    
    /* 0 */ val started: typingsSlinky.winrt.Windows.UI.Input.CrossSlidingState.started with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingEventArgs")
  @js.native
  class DraggingEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.DraggingEventArgs
  
  @JSGlobal("Windows.UI.Input.DraggingState")
  @js.native
  object DraggingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.DraggingState with Double] = js.native
    
    /* 2 */ val completed: typingsSlinky.winrt.Windows.UI.Input.DraggingState.completed with Double = js.native
    
    /* 1 */ val continuing: typingsSlinky.winrt.Windows.UI.Input.DraggingState.continuing with Double = js.native
    
    /* 0 */ val started: typingsSlinky.winrt.Windows.UI.Input.DraggingState.started with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGesture")
  @js.native
  class EdgeGesture ()
    extends typingsSlinky.winrt.Windows.UI.Input.EdgeGesture
  /* static members */
  object EdgeGesture {
    
    @JSGlobal("Windows.UI.Input.EdgeGesture.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrt.Windows.UI.Input.EdgeGesture = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
  @js.native
  class EdgeGestureEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.EdgeGestureEventArgs
  
  @JSGlobal("Windows.UI.Input.EdgeGestureKind")
  @js.native
  object EdgeGestureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.EdgeGestureKind with Double] = js.native
    
    /* 1 */ val keyboard: typingsSlinky.winrt.Windows.UI.Input.EdgeGestureKind.keyboard with Double = js.native
    
    /* 2 */ val mouse: typingsSlinky.winrt.Windows.UI.Input.EdgeGestureKind.mouse with Double = js.native
    
    /* 0 */ val touch: typingsSlinky.winrt.Windows.UI.Input.EdgeGestureKind.touch with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureRecognizer")
  @js.native
  class GestureRecognizer ()
    extends typingsSlinky.winrt.Windows.UI.Input.GestureRecognizer
  
  @JSGlobal("Windows.UI.Input.GestureSettings")
  @js.native
  object GestureSettings extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.GestureSettings with Double] = js.native
    
    /* 16 */ val crossSlide: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.crossSlide with Double = js.native
    
    /* 2 */ val doubleTap: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.doubleTap with Double = js.native
    
    /* 6 */ val drag: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.drag with Double = js.native
    
    /* 3 */ val hold: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.hold with Double = js.native
    
    /* 4 */ val holdWithMouse: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.holdWithMouse with Double = js.native
    
    /* 11 */ val manipulationRotate: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationRotate with Double = js.native
    
    /* 14 */ val manipulationRotateInertia: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia with Double = js.native
    
    /* 12 */ val manipulationScale: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationScale with Double = js.native
    
    /* 15 */ val manipulationScaleInertia: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia with Double = js.native
    
    /* 13 */ val manipulationTranslateInertia: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia with Double = js.native
    
    /* 9 */ val manipulationTranslateRailsX: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX with Double = js.native
    
    /* 10 */ val manipulationTranslateRailsY: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY with Double = js.native
    
    /* 7 */ val manipulationTranslateX: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX with Double = js.native
    
    /* 8 */ val manipulationTranslateY: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.none with Double = js.native
    
    /* 5 */ val rightTap: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.rightTap with Double = js.native
    
    /* 1 */ val tap: typingsSlinky.winrt.Windows.UI.Input.GestureSettings.tap with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingEventArgs")
  @js.native
  class HoldingEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.HoldingEventArgs
  
  @JSGlobal("Windows.UI.Input.HoldingState")
  @js.native
  object HoldingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.HoldingState with Double] = js.native
    
    /* 2 */ val canceled: typingsSlinky.winrt.Windows.UI.Input.HoldingState.canceled with Double = js.native
    
    /* 1 */ val completed: typingsSlinky.winrt.Windows.UI.Input.HoldingState.completed with Double = js.native
    
    /* 0 */ val started: typingsSlinky.winrt.Windows.UI.Input.HoldingState.started with Double = js.native
  }
  
  object Inking {
    
    @JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
    @js.native
    class InkDrawingAttributes ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkDrawingAttributes
    
    @JSGlobal("Windows.UI.Input.Inking.InkManager")
    @js.native
    class InkManager ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkManager
    
    @JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
    @js.native
    object InkManipulationMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
      
      /* 1 */ val erasing: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
      
      /* 0 */ val inking: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
      
      /* 2 */ val selecting: typingsSlinky.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
    @js.native
    class InkRecognitionResult ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionResult
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
    @js.native
    object InkRecognitionTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
      
      /* 0 */ val all: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
      
      /* 2 */ val recent: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
      
      /* 1 */ val selected: typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizer")
    @js.native
    class InkRecognizer ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizer
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
    @js.native
    class InkRecognizerContainer ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkRecognizerContainer
    
    @JSGlobal("Windows.UI.Input.Inking.InkStroke")
    @js.native
    class InkStroke ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStroke
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
    @js.native
    class InkStrokeBuilder ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeBuilder
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
    @js.native
    class InkStrokeContainer ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeContainer
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
    @js.native
    class InkStrokeRenderingSegment ()
      extends typingsSlinky.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment
    
    @JSGlobal("Windows.UI.Input.Inking.PenTipShape")
    @js.native
    object PenTipShape extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
      
      /* 0 */ val circle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
      
      /* 1 */ val rectangle: typingsSlinky.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
  @js.native
  class ManipulationCompletedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.ManipulationCompletedEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationInertiaStartingEventArgs")
  @js.native
  class ManipulationInertiaStartingEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.ManipulationInertiaStartingEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
  @js.native
  class ManipulationStartedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.ManipulationStartedEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
  @js.native
  class ManipulationUpdatedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.ManipulationUpdatedEventArgs
  
  @JSGlobal("Windows.UI.Input.MouseWheelParameters")
  @js.native
  class MouseWheelParameters ()
    extends typingsSlinky.winrt.Windows.UI.Input.MouseWheelParameters
  
  @JSGlobal("Windows.UI.Input.PointerPoint")
  @js.native
  class PointerPoint ()
    extends typingsSlinky.winrt.Windows.UI.Input.PointerPoint
  /* static members */
  object PointerPoint {
    
    @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
    @js.native
    def getCurrentPoint(pointerId: Double): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
    @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
    @js.native
    def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typingsSlinky.winrt.Windows.UI.Input.PointerPoint = js.native
    
    @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
    @js.native
    def getIntermediatePoints(pointerId: Double): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
    @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
    @js.native
    def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typingsSlinky.winrt.Windows.UI.Input.PointerPoint] = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerPointProperties")
  @js.native
  class PointerPointProperties ()
    extends typingsSlinky.winrt.Windows.UI.Input.PointerPointProperties
  
  @JSGlobal("Windows.UI.Input.PointerUpdateKind")
  @js.native
  object PointerUpdateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind with Double] = js.native
    
    /* 1 */ val leftButtonPressed: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonPressed with Double = js.native
    
    /* 2 */ val leftButtonReleased: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonReleased with Double = js.native
    
    /* 5 */ val middleButtonPressed: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonPressed with Double = js.native
    
    /* 6 */ val middleButtonReleased: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonReleased with Double = js.native
    
    /* 0 */ val other: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.other with Double = js.native
    
    /* 3 */ val rightButtonPressed: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonPressed with Double = js.native
    
    /* 4 */ val rightButtonReleased: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonReleased with Double = js.native
    
    /* 7 */ val xButton1Pressed: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Pressed with Double = js.native
    
    /* 8 */ val xButton1Released: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Released with Double = js.native
    
    /* 9 */ val xButton2Pressed: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Pressed with Double = js.native
    
    /* 10 */ val xButton2Released: typingsSlinky.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Released with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
  @js.native
  class PointerVisualizationSettings ()
    extends typingsSlinky.winrt.Windows.UI.Input.PointerVisualizationSettings
  /* static members */
  object PointerVisualizationSettings {
    
    @JSGlobal("Windows.UI.Input.PointerVisualizationSettings.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrt.Windows.UI.Input.PointerVisualizationSettings = js.native
  }
  
  @JSGlobal("Windows.UI.Input.RightTappedEventArgs")
  @js.native
  class RightTappedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.RightTappedEventArgs
  
  @JSGlobal("Windows.UI.Input.TappedEventArgs")
  @js.native
  class TappedEventArgs ()
    extends typingsSlinky.winrt.Windows.UI.Input.TappedEventArgs
}
