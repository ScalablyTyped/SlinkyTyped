package typingsSlinky.semanticUiVisibility

import typingsSlinky.jquery.JQueryCoordinates
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ScreenCalculations
import typingsSlinky.semanticUiVisibility.SemanticUI.Visibility.ScreenSize
import typingsSlinky.semanticUiVisibility.SemanticUI.VisibilitySettings.Param
import typingsSlinky.semanticUiVisibility.anon.Bottom
import typingsSlinky.semanticUiVisibility.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiVisibility.anon.PickImplcheckOnRefresh
import typingsSlinky.semanticUiVisibility.anon.PickImplclassName
import typingsSlinky.semanticUiVisibility.anon.PickImplcontext
import typingsSlinky.semanticUiVisibility.anon.PickImplcontinuous
import typingsSlinky.semanticUiVisibility.anon.PickImpldebug
import typingsSlinky.semanticUiVisibility.anon.PickImplduration
import typingsSlinky.semanticUiVisibility.anon.PickImplerror
import typingsSlinky.semanticUiVisibility.anon.PickImplincludeMargin
import typingsSlinky.semanticUiVisibility.anon.PickImplinitialCheck
import typingsSlinky.semanticUiVisibility.anon.PickImplname
import typingsSlinky.semanticUiVisibility.anon.PickImplnamespace
import typingsSlinky.semanticUiVisibility.anon.PickImplobserveChanges
import typingsSlinky.semanticUiVisibility.anon.PickImploffset
import typingsSlinky.semanticUiVisibility.anon.PickImplonAllLoaded
import typingsSlinky.semanticUiVisibility.anon.PickImplonBottomPassed
import typingsSlinky.semanticUiVisibility.anon.PickImplonBottomPassedRev
import typingsSlinky.semanticUiVisibility.anon.PickImplonBottomVisible
import typingsSlinky.semanticUiVisibility.anon.PickImplonBottomVisibleRe
import typingsSlinky.semanticUiVisibility.anon.PickImplonFixed
import typingsSlinky.semanticUiVisibility.anon.PickImplonLoad
import typingsSlinky.semanticUiVisibility.anon.PickImplonOffScreen
import typingsSlinky.semanticUiVisibility.anon.PickImplonOnScreen
import typingsSlinky.semanticUiVisibility.anon.PickImplonPassing
import typingsSlinky.semanticUiVisibility.anon.PickImplonPassingReverse
import typingsSlinky.semanticUiVisibility.anon.PickImplonRefresh
import typingsSlinky.semanticUiVisibility.anon.PickImplonTopPassed
import typingsSlinky.semanticUiVisibility.anon.PickImplonTopPassedRevers
import typingsSlinky.semanticUiVisibility.anon.PickImplonTopVisible
import typingsSlinky.semanticUiVisibility.anon.PickImplonTopVisibleRever
import typingsSlinky.semanticUiVisibility.anon.PickImplonUnfixed
import typingsSlinky.semanticUiVisibility.anon.PickImplonUpdate
import typingsSlinky.semanticUiVisibility.anon.PickImplonce
import typingsSlinky.semanticUiVisibility.anon.PickImplperformance
import typingsSlinky.semanticUiVisibility.anon.PickImplrefreshOnLoad
import typingsSlinky.semanticUiVisibility.anon.PickImplrefreshOnResize
import typingsSlinky.semanticUiVisibility.anon.PickImplsilent
import typingsSlinky.semanticUiVisibility.anon.PickImplthrottle
import typingsSlinky.semanticUiVisibility.anon.PickImpltransition
import typingsSlinky.semanticUiVisibility.anon.PickImpltype
import typingsSlinky.semanticUiVisibility.anon.PickImplverbose
import typingsSlinky.semanticUiVisibility.anon.PickImplzIndex
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`disable callbacks`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`enable callbacks`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get element calculations`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get pixels passed`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get screen calculations`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`get screen size`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`is off screen`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`is on screen`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.`type`
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.checkOnRefresh
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.className
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.context
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.continuous
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.debug
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.destroy
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.duration
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.error
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.image
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.includeMargin
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.initialCheck
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.name
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.namespace
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.observeChanges
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.offset
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onAllLoaded
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomPassedReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisible
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onBottomVisibleReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onFixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onLoad
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onOffScreen
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onOnScreen
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onPassing
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onPassingReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onRefresh
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopPassedReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisible
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onTopVisibleReverse
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onUnfixed
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.onUpdate
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.once
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.performance
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnLoad
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.refreshOnResize
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.setting
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.silent
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.throttle
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.transition
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.verbose
import typingsSlinky.semanticUiVisibility.semanticUiVisibilityStrings.zIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Visibility extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Disable callbacks temporarily. This is useful if you need to adjust scroll position and do not want to trigger callbacks during the position change.
      */
    def apply(behavior: `disable callbacks`): JQuery = js.native
    /**
      * Re-enable callbacks
      */
    def apply(behavior: `enable callbacks`): JQuery = js.native
    /**
      * Returns element calculations as object
      */
    def apply(behavior: `get element calculations`): ElementCalculations = js.native
    /**
      * Returns number of pixels passed in current element from top of element
      */
    def apply(behavior: `get pixels passed`): Double = js.native
    /**
      * Returns screen calculations as object
      */
    def apply(behavior: `get screen calculations`): ScreenCalculations = js.native
    /**
      * Returns screen size as object
      */
    def apply(behavior: `get screen size`): ScreenSize = js.native
    /**
      * Returns whether element is off screen
      */
    def apply(behavior: `is off screen`): Boolean = js.native
    /**
      * Returns whether element is on screen
      */
    def apply(behavior: `is on screen`): Boolean = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): `false` | image | fixed = js.native
    def apply(behavior: setting, name: `type`, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: `type`, value: fixed): JQuery = js.native
    def apply(behavior: setting, name: `type`, value: image): JQuery = js.native
    def apply(behavior: setting, name: checkOnRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: checkOnRefresh, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: continuous, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: continuous, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: includeMargin, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: includeMargin, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: initialCheck, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: initialCheck, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
    def apply(behavior: setting, name: onAllLoaded, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onAllLoaded, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onBottomPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onBottomPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onBottomPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onBottomPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onBottomVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onBottomVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onBottomVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onBottomVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onFixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onFixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onLoad, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onOffScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onOffScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onOnScreen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onOnScreen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onPassingReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onPassingReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onPassing, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onPassing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onRefresh, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onRefresh, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onTopPassedReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onTopPassedReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onTopPassed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onTopPassed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onTopVisibleReverse, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onTopVisibleReverse, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onTopVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onTopVisible, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onUnfixed, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onUnfixed, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onUpdate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = js.native
    def apply(
      behavior: setting,
      name: onUpdate,
      value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: once, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: once, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: refreshOnLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: refreshOnLoad, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: refreshOnResize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: refreshOnResize, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: throttle, value: js.UndefOr[scala.Nothing]): `false` | Double = js.native
    def apply(behavior: setting, name: throttle, value: Double): JQuery = js.native
    def apply(behavior: setting, name: throttle, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: transition, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: zIndex, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: zIndex, value: Double): JQuery = js.native
    def apply(behavior: setting, value: VisibilitySettings): JQuery = js.native
    def apply(settings: VisibilitySettings): JQuery = js.native
    
    var settings: VisibilitySettings = js.native
  }
  object Visibility {
    
    /* Inlined semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings.Param */
    @js.native
    trait ClassNameSettings extends StObject {
      
      var fixed: String with js.UndefOr[String] = js.native
    }
    object ClassNameSettings {
      
      @scala.inline
      def apply(fixed: String with js.UndefOr[String]): ClassNameSettings = {
        val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClassNameSettings]
      }
      
      @scala.inline
      implicit class ClassNameSettingsMutableBuilder[Self <: ClassNameSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFixed(value: String with js.UndefOr[String]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'fixed'
          */
        var fixed: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(fixed: String): Impl = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl, keyof semantic-ui-visibility.SemanticUI.Visibility.ClassNameSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var fixed: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(fixed: String with js.UndefOr[String]): Param = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFixed(value: String with js.UndefOr[String]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
    }
    
    @js.native
    trait ElementCalculations extends ElementPosition {
      
      var bottom: Double = js.native
      
      var bottomPassed: Boolean = js.native
      
      var bottomVisible: Boolean = js.native
      
      var margin: js.UndefOr[Bottom] = js.native
      
      var offScreen: Boolean = js.native
      
      var onScreen: Boolean = js.native
      
      var passing: Boolean = js.native
      
      var percentagePassed: Double = js.native
      
      var pixelsPassed: Double = js.native
      
      var top: Double = js.native
      
      var topPassed: Boolean = js.native
      
      var topVisible: Boolean = js.native
    }
    object ElementCalculations {
      
      @scala.inline
      def apply(
        bottom: Double,
        bottomPassed: Boolean,
        bottomVisible: Boolean,
        fits: Boolean,
        height: Double,
        offScreen: Boolean,
        offset: JQueryCoordinates,
        onScreen: Boolean,
        passing: Boolean,
        percentagePassed: Double,
        pixelsPassed: Double,
        top: Double,
        topPassed: Boolean,
        topVisible: Boolean,
        width: Double
      ): ElementCalculations = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomPassed = bottomPassed.asInstanceOf[js.Any], bottomVisible = bottomVisible.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offScreen = offScreen.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onScreen = onScreen.asInstanceOf[js.Any], passing = passing.asInstanceOf[js.Any], percentagePassed = percentagePassed.asInstanceOf[js.Any], pixelsPassed = pixelsPassed.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topPassed = topPassed.asInstanceOf[js.Any], topVisible = topVisible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementCalculations]
      }
      
      @scala.inline
      implicit class ElementCalculationsMutableBuilder[Self <: ElementCalculations] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomPassed(value: Boolean): Self = StObject.set(x, "bottomPassed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomVisible(value: Boolean): Self = StObject.set(x, "bottomVisible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
        
        @scala.inline
        def setOffScreen(value: Boolean): Self = StObject.set(x, "offScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnScreen(value: Boolean): Self = StObject.set(x, "onScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassing(value: Boolean): Self = StObject.set(x, "passing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPercentagePassed(value: Double): Self = StObject.set(x, "percentagePassed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelsPassed(value: Double): Self = StObject.set(x, "pixelsPassed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopPassed(value: Boolean): Self = StObject.set(x, "topPassed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopVisible(value: Boolean): Self = StObject.set(x, "topVisible", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ElementPosition extends StObject {
      
      var fits: Boolean = js.native
      
      var height: Double = js.native
      
      var offset: JQueryCoordinates = js.native
      
      var width: Double = js.native
    }
    object ElementPosition {
      
      @scala.inline
      def apply(fits: Boolean, height: Double, offset: JQueryCoordinates, width: Double): ElementPosition = {
        val __obj = js.Dynamic.literal(fits = fits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementPosition]
      }
      
      @scala.inline
      implicit class ElementPositionMutableBuilder[Self <: ElementPosition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFits(value: Boolean): Self = StObject.set(x, "fits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: JQueryCoordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings.Param */
    @js.native
    trait ErrorSettings extends StObject {
      
      var method: String with js.UndefOr[String] = js.native
    }
    object ErrorSettings {
      
      @scala.inline
      def apply(method: String with js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      @scala.inline
      implicit class ErrorSettingsMutableBuilder[Self <: ErrorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl, keyof semantic-ui-visibility.SemanticUI.Visibility.ErrorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var method: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(method: String with js.UndefOr[String]): Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    @js.native
    trait ScreenCalculations extends StObject {
      
      var bottom: Double = js.native
      
      var top: Double = js.native
    }
    object ScreenCalculations {
      
      @scala.inline
      def apply(bottom: Double, top: Double): ScreenCalculations = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[ScreenCalculations]
      }
      
      @scala.inline
      implicit class ScreenCalculationsMutableBuilder[Self <: ScreenCalculations] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ScreenSize extends StObject {
      
      var height: Double = js.native
    }
    object ScreenSize {
      
      @scala.inline
      def apply(height: Double): ScreenSize = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
        __obj.asInstanceOf[ScreenSize]
      }
      
      @scala.inline
      implicit class ScreenSizeMutableBuilder[Self <: ScreenSize] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object VisibilitySettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Whether visibility conditions should be checked on calls to refresh.
        * These calls can be triggered from either resize, load or manually calling $('.foo').visibility('refresh')
        *
        * @default true
        */
      var checkOnRefresh: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * The scroll context visibility should use.
        *
        * @default 'window'
        */
      var context: String | JQuery = js.native
      
      /**
        * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
        *
        * @default false
        */
      var continuous: Boolean = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * When using type: image allows you to specify transition duration
        *
        * @default 1000
        */
      var duration: Double = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether element calculations should include its margin
        *
        * @default false
        */
      var includeMargin: Boolean = js.native
      
      /**
        * Whether visibility conditions should be checked immediately on init
        *
        * @default true
        */
      var initialCheck: Boolean = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      /**
        * Whether to automatically refresh content when changes are made to the element's DOM subtree
        *
        * @default true
        */
      var observeChanges: Boolean = js.native
      
      /**
        * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
        *
        * @default 0
        */
      var offset: Double = js.native
      
      /**
        * Occurs after all img initialized at the same time have loaded.
        *
        * @since 2.2
        */
      def onAllLoaded(): Unit = js.native
      
      /**
        * Element's bottom edge has passed top of screen
        */
      def onBottomPassed(): Unit = js.native
      
      /**
        * Element's bottom edge has not passed top of screen
        */
      def onBottomPassedReverse(): Unit = js.native
      
      /**
        * Element's bottom edge has passed bottom of screen
        */
      def onBottomVisible(): Unit = js.native
      
      /**
        * Element's bottom edge has not passed bottom of screen
        */
      def onBottomVisibleReverse(): Unit = js.native
      
      // endregion
      // region Fixed Callbacks
      /**
        * Occurs after element has been assigned position fixed
        *
        * @since 2.2
        */
      def onFixed(): Unit = js.native
      
      // endregion
      // region Image Callbacks
      /**
        * Occurs after an image has completed loading
        *
        * @since 2.2
        */
      def onLoad(): Unit = js.native
      
      def onOffScreen(): Unit = js.native
      
      def onOnScreen(): Unit = js.native
      
      /**
        * Any part of an element is visible on screen
        */
      def onPassing(): Unit = js.native
      
      /**
        * Element's top has not passed top of screen but bottom has
        */
      def onPassingReverse(): Unit = js.native
      
      /**
        * Occurs whenever element's visibility is refreshed
        */
      def onRefresh(): Unit = js.native
      
      /**
        * Element's top edge has passed top of the screen
        */
      def onTopPassed(): Unit = js.native
      
      /**
        * Element's top edge has not passed top of the screen
        */
      def onTopPassedReverse(): Unit = js.native
      
      // endregion
      // region Visibility Callbacks
      /**
        * Element's top edge has passed bottom of screen
        */
      def onTopVisible(): Unit = js.native
      
      /**
        * Element's top edge has not passed bottom of screen
        */
      def onTopVisibleReverse(): Unit = js.native
      
      /**
        * Occurs after element has been removed from fixed position
        *
        * @since 2.2
        */
      def onUnfixed(): Unit = js.native
      
      // endregion
      // region Utility Callbacks
      /**
        * Occurs each time an elements calculations are updated
        */
      def onUpdate(calculations: ElementCalculations): Unit = js.native
      
      // region Functionality
      /**
        * When set to false a callback will occur each time an element passes the threshold for a condition.
        *
        * @default true
        */
      var once: Boolean = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
        *
        * @default true
        */
      var refreshOnLoad: Boolean = js.native
      
      /**
        * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
        *
        * @default true
        */
      var refreshOnResize: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
        *
        * @default false
        */
      var throttle: `false` | Double = js.native
      
      /**
        * When using type: image allows you to specify transition when showing a loaded image
        *
        * @default false
        */
      var transition: `false` | String = js.native
      
      /**
        * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
        *
        * @default false
        */
      var `type`: `false` | image | fixed = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
      
      /**
        * Specify a z-index when using type: 'fixed'.
        *
        * @default 1
        * @since 2.2
        */
      var zIndex: Double = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        checkOnRefresh: Boolean,
        className: ClassNameSettings,
        context: String | JQuery,
        continuous: Boolean,
        debug: Boolean,
        duration: Double,
        error: ErrorSettings,
        includeMargin: Boolean,
        initialCheck: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onAllLoaded: () => Unit,
        onBottomPassed: () => Unit,
        onBottomPassedReverse: () => Unit,
        onBottomVisible: () => Unit,
        onBottomVisibleReverse: () => Unit,
        onFixed: () => Unit,
        onLoad: () => Unit,
        onOffScreen: () => Unit,
        onOnScreen: () => Unit,
        onPassing: () => Unit,
        onPassingReverse: () => Unit,
        onRefresh: () => Unit,
        onTopPassed: () => Unit,
        onTopPassedReverse: () => Unit,
        onTopVisible: () => Unit,
        onTopVisibleReverse: () => Unit,
        onUnfixed: () => Unit,
        onUpdate: ElementCalculations => Unit,
        once: Boolean,
        performance: Boolean,
        refreshOnLoad: Boolean,
        refreshOnResize: Boolean,
        silent: Boolean,
        throttle: `false` | Double,
        transition: `false` | String,
        `type`: `false` | image | fixed,
        verbose: Boolean,
        zIndex: Double
      ): Impl = {
        val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], includeMargin = includeMargin.asInstanceOf[js.Any], initialCheck = initialCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAllLoaded = js.Any.fromFunction0(onAllLoaded), onBottomPassed = js.Any.fromFunction0(onBottomPassed), onBottomPassedReverse = js.Any.fromFunction0(onBottomPassedReverse), onBottomVisible = js.Any.fromFunction0(onBottomVisible), onBottomVisibleReverse = js.Any.fromFunction0(onBottomVisibleReverse), onFixed = js.Any.fromFunction0(onFixed), onLoad = js.Any.fromFunction0(onLoad), onOffScreen = js.Any.fromFunction0(onOffScreen), onOnScreen = js.Any.fromFunction0(onOnScreen), onPassing = js.Any.fromFunction0(onPassing), onPassingReverse = js.Any.fromFunction0(onPassingReverse), onRefresh = js.Any.fromFunction0(onRefresh), onTopPassed = js.Any.fromFunction0(onTopPassed), onTopPassedReverse = js.Any.fromFunction0(onTopPassedReverse), onTopVisible = js.Any.fromFunction0(onTopVisible), onTopVisibleReverse = js.Any.fromFunction0(onTopVisibleReverse), onUnfixed = js.Any.fromFunction0(onUnfixed), onUpdate = js.Any.fromFunction1(onUpdate), once = once.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any], refreshOnResize = refreshOnResize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnAllLoaded(value: () => Unit): Self = StObject.set(x, "onAllLoaded", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnBottomPassed(value: () => Unit): Self = StObject.set(x, "onBottomPassed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnBottomPassedReverse(value: () => Unit): Self = StObject.set(x, "onBottomPassedReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnBottomVisible(value: () => Unit): Self = StObject.set(x, "onBottomVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnBottomVisibleReverse(value: () => Unit): Self = StObject.set(x, "onBottomVisibleReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnFixed(value: () => Unit): Self = StObject.set(x, "onFixed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnOffScreen(value: () => Unit): Self = StObject.set(x, "onOffScreen", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnOnScreen(value: () => Unit): Self = StObject.set(x, "onOnScreen", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnPassing(value: () => Unit): Self = StObject.set(x, "onPassing", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnPassingReverse(value: () => Unit): Self = StObject.set(x, "onPassingReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTopPassed(value: () => Unit): Self = StObject.set(x, "onTopPassed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTopPassedReverse(value: () => Unit): Self = StObject.set(x, "onTopPassedReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTopVisible(value: () => Unit): Self = StObject.set(x, "onTopVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnTopVisibleReverse(value: () => Unit): Self = StObject.set(x, "onTopVisibleReverse", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUnfixed(value: () => Unit): Self = StObject.set(x, "onUnfixed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnUpdate(value: ElementCalculations => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrottle(value: `false` | Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: `false` | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `false` | image | fixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplonce | PickImplcontinuous | PickImpltype | PickImplinitialCheck | PickImplcontext | PickImplrefreshOnLoad | PickImplrefreshOnResize | PickImplcheckOnRefresh | PickImplzIndex | PickImploffset | PickImplincludeMargin | PickImplthrottle | PickImplobserveChanges | PickImpltransition | PickImplduration | PickImplonTopVisible | PickImplonTopPassed | PickImplonBottomVisible | PickImplonPassing | PickImplonBottomPassed | PickImplonTopVisibleRever | PickImplonTopPassedRevers | PickImplonBottomVisibleRe | PickImplonPassingReverse | PickImplonBottomPassedRev | PickImplonOnScreen | PickImplonOffScreen | PickImplonLoad | PickImplonAllLoaded | PickImplonFixed | PickImplonUnfixed | PickImplonUpdate | PickImplonRefresh | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/behaviors/visibility.html#/settings}
    */
  type VisibilitySettings = Param
}
