package typingsSlinky.winrtUwp.global.Windows.UI

import typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Core")
@js.native
object Core extends js.Object {
  
  /** The classes and their properties that are exposed through this namespace retrieve the raw scaling, translation, and opacity parameters used in Windows animations. These parameters include such metrics as the animation type, stagger delay, z-order, duration, initial and final opacity, initial and final scale factors, and cubic Bezier control points, among others. This information enables developers of apps and application frameworks to create custom animations that are consistent with both Windows itself and with other apps that use Windows animations. */
  @js.native
  object AnimationMetrics extends js.Object {
    
    /** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
    @js.native
    class AnimationDescription protected ()
      extends typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      /**
        * Creates an AnimationDescription object with a specific animation and target.
        * @param effect The animation effect to apply to the target.
        * @param target The target of the animation effect.
        */
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
    }
    
    /** Specifies an animation. */
    @js.native
    object AnimationEffect extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect with Double
          ] = js.native
      
      /* 7 */ val addToGrid: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid with Double = js.native
      
      /* 5 */ val addToList: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList with Double = js.native
      
      /* 9 */ val addToSearchGrid: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid with Double = js.native
      
      /* 11 */ val addToSearchList: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList with Double = js.native
      
      /* 1 */ val collapse: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse with Double = js.native
      
      /* 33 */ val crossFade: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade with Double = js.native
      
      /* 8 */ val deleteFromGrid: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid with Double = js.native
      
      /* 6 */ val deleteFromList: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList with Double = js.native
      
      /* 10 */ val deleteFromSearchGrid: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid with Double = js.native
      
      /* 12 */ val deleteFromSearchList: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList with Double = js.native
      
      /* 26 */ val dragBetweenEnter: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter with Double = js.native
      
      /* 27 */ val dragBetweenLeave: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave with Double = js.native
      
      /* 22 */ val dragSourceEnd: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd with Double = js.native
      
      /* 21 */ val dragSourceStart: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart with Double = js.native
      
      /* 31 */ val enterPage: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage with Double = js.native
      
      /* 0 */ val expand: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand with Double = js.native
      
      /* 3 */ val fadeIn: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn with Double = js.native
      
      /* 4 */ val fadeOut: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut with Double = js.native
      
      /* 25 */ val hide: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide with Double = js.native
      
      /* 15 */ val hideEdgeUI: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI with Double = js.native
      
      /* 16 */ val hidePanel: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel with Double = js.native
      
      /* 18 */ val hidePopup: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup with Double = js.native
      
      /* 34 */ val peek: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek with Double = js.native
      
      /* 19 */ val pointerDown: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown with Double = js.native
      
      /* 20 */ val pointerUp: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp with Double = js.native
      
      /* 2 */ val reposition: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition with Double = js.native
      
      /* 24 */ val reveal: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal with Double = js.native
      
      /* 13 */ val showEdgeUI: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI with Double = js.native
      
      /* 14 */ val showPanel: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel with Double = js.native
      
      /* 17 */ val showPopup: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup with Double = js.native
      
      /* 29 */ val swipeDeselect: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect with Double = js.native
      
      /* 30 */ val swipeReveal: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal with Double = js.native
      
      /* 28 */ val swipeSelect: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect with Double = js.native
      
      /* 23 */ val transitionContent: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent with Double = js.native
      
      /* 32 */ val transitionPage: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage with Double = js.native
      
      /* 35 */ val updateBadge: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge with Double = js.native
    }
    
    /** Specifies a participant in an animation. */
    @js.native
    object AnimationEffectTarget extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget with Double
          ] = js.native
      
      /* 1 */ val added: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added with Double = js.native
      
      /* 2 */ val affected: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected with Double = js.native
      
      /* 3 */ val background: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background with Double = js.native
      
      /* 4 */ val content: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content with Double = js.native
      
      /* 5 */ val deleted: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted with Double = js.native
      
      /* 6 */ val deselected: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected with Double = js.native
      
      /* 7 */ val dragSource: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource with Double = js.native
      
      /* 8 */ val hidden: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden with Double = js.native
      
      /* 9 */ val incoming: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming with Double = js.native
      
      /* 10 */ val outgoing: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing with Double = js.native
      
      /* 11 */ val outline: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline with Double = js.native
      
      /* 0 */ val primary: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary with Double = js.native
      
      /* 12 */ val remaining: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining with Double = js.native
      
      /* 13 */ val revealed: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed with Double = js.native
      
      /* 14 */ val rowIn: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn with Double = js.native
      
      /* 15 */ val rowOut: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut with Double = js.native
      
      /* 16 */ val selected: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected with Double = js.native
      
      /* 17 */ val selection: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection with Double = js.native
      
      /* 18 */ val shown: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown with Double = js.native
      
      /* 19 */ val tapped: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped with Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
    @js.native
    abstract class OpacityAnimation ()
      extends typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.OpacityAnimation
    
    /** Provides methods that enable you to retrieve animation property values that are common to all property animation types . */
    @js.native
    abstract class PropertyAnimation ()
      extends typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimation
    
    /** Specifies the animation type represented by a PropertyAnimation object. */
    @js.native
    object PropertyAnimationType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType with Double
          ] = js.native
      
      /* 2 */ val opacity: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
      
      /* 0 */ val scale: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
      
      /* 1 */ val translation: typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
    @js.native
    abstract class ScaleAnimation ()
      extends typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.ScaleAnimation
    
    /** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
    @js.native
    abstract class TranslationAnimation ()
      extends typingsSlinky.winrtUwp.Windows.UI.Core.AnimationMetrics.TranslationAnimation
  }
  
  /** Defines constants that specify whether the back button is shown in the system UI. */
  @js.native
  object AppViewBackButtonVisibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility with Double] = js.native
    
    /* 1 */ val collapsed: typingsSlinky.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.collapsed with Double = js.native
    
    /* 0 */ val visible: typingsSlinky.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.visible with Double = js.native
  }
  
  /** Provides event data for the SystemNavigationManager.BackRequested event. */
  @js.native
  abstract class BackRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.UI.Core.BackRequestedEventArgs
  
  /** Provides a way for an app to respond to system provided back-navigation events. */
  @js.native
  abstract class SystemNavigationManager ()
    extends typingsSlinky.winrtUwp.Windows.UI.Core.SystemNavigationManager
  /* static members */
  @js.native
  object SystemNavigationManager extends js.Object {
    
    /**
      * Returns the SystemNavigationManager object associated with the current window.
      * @return The SystemNavigationManager object associated with the current window.
      */
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.UI.Core.SystemNavigationManager = js.native
  }
}
