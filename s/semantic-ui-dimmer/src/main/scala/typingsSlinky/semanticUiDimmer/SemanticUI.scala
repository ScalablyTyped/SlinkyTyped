package typingsSlinky.semanticUiDimmer

import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings.Param
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings
import typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import typingsSlinky.semanticUiDimmer.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiDimmer.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiDimmer.anon.PartialPickImplkeyofImplContent
import typingsSlinky.semanticUiDimmer.anon.PartialPickImplkeyofImplHide
import typingsSlinky.semanticUiDimmer.anon.PickImplactive
import typingsSlinky.semanticUiDimmer.anon.PickImplclassName
import typingsSlinky.semanticUiDimmer.anon.PickImplclosable
import typingsSlinky.semanticUiDimmer.anon.PickImplcontent
import typingsSlinky.semanticUiDimmer.anon.PickImpldebug
import typingsSlinky.semanticUiDimmer.anon.PickImpldimmable
import typingsSlinky.semanticUiDimmer.anon.PickImpldimmed
import typingsSlinky.semanticUiDimmer.anon.PickImpldimmer
import typingsSlinky.semanticUiDimmer.anon.PickImpldimmerName
import typingsSlinky.semanticUiDimmer.anon.PickImpldisabled
import typingsSlinky.semanticUiDimmer.anon.PickImplduration
import typingsSlinky.semanticUiDimmer.anon.PickImplerror
import typingsSlinky.semanticUiDimmer.anon.PickImplhide
import typingsSlinky.semanticUiDimmer.anon.PickImplhideHide
import typingsSlinky.semanticUiDimmer.anon.PickImplname
import typingsSlinky.semanticUiDimmer.anon.PickImplnamespace
import typingsSlinky.semanticUiDimmer.anon.PickImplon
import typingsSlinky.semanticUiDimmer.anon.PickImplonChange
import typingsSlinky.semanticUiDimmer.anon.PickImplonHide
import typingsSlinky.semanticUiDimmer.anon.PickImplonShow
import typingsSlinky.semanticUiDimmer.anon.PickImplopacity
import typingsSlinky.semanticUiDimmer.anon.PickImplpageDimmer
import typingsSlinky.semanticUiDimmer.anon.PickImplperformance
import typingsSlinky.semanticUiDimmer.anon.PickImplselector
import typingsSlinky.semanticUiDimmer.anon.PickImplshow
import typingsSlinky.semanticUiDimmer.anon.PickImplshowShow
import typingsSlinky.semanticUiDimmer.anon.PickImplsilent
import typingsSlinky.semanticUiDimmer.anon.PickImpltemplate
import typingsSlinky.semanticUiDimmer.anon.PickImpltransition
import typingsSlinky.semanticUiDimmer.anon.PickImpluseCSS
import typingsSlinky.semanticUiDimmer.anon.PickImplvariation
import typingsSlinky.semanticUiDimmer.anon.PickImplverbose
import typingsSlinky.semanticUiDimmer.semanticUiDimmerBooleans.`false`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`add content`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`get dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`get duration`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`has dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is active`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is animating`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is dimmable`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is disabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is enabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is page dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`is page`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set active`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set dimmable`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set dimmed`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set disabled`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set opacity`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.`set page dimmer`
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.auto
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.className
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.click
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.closable
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.create
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.debug
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.destroy
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.dimmerName
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.duration
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.error
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hide
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.hover
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.name
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.namespace
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.on
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onChange
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onHide
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.onShow
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.opacity
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.performance
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.selector
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.setting
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.show
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.silent
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.template
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.toggle
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.transition
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.useCSS
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.variation
import typingsSlinky.semanticUiDimmer.semanticUiDimmerStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Dimmer extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Detaches a given element from DOM and reattaches element inside dimmer
      */
    def apply(behavior: `add content`, element: String): JQuery = js.native
    def apply(behavior: `add content`, element: JQuery): JQuery = js.native
    /**
      * Returns DOM element for dimmer
      */
    def apply(behavior: `get dimmer`): JQuery = js.native
    /**
      * Returns current duration for show or hide event depending on current visibility
      */
    def apply(behavior: `get duration`): Double = js.native
    /**
      * Returns whether current dimmable has a dimmer
      */
    def apply(behavior: `has dimmer`): Boolean = js.native
    /**
      * Whether section's dimmer is active
      */
    def apply(behavior: `is active`): Boolean = js.native
    /**
      * Whether dimmer is animating
      */
    def apply(behavior: `is animating`): Boolean = js.native
    /**
      * Whether current element is a dimmable section
      */
    def apply(behavior: `is dimmable`): Boolean = js.native
    /**
      * Whether current element is a dimmer
      */
    def apply(behavior: `is dimmer`): Boolean = js.native
    /**
      * Whether dimmer is disabled
      */
    def apply(behavior: `is disabled`): Boolean = js.native
    /**
      * Whether dimmer is not disabled
      */
    def apply(behavior: `is enabled`): Boolean = js.native
    /**
      * Whether dimmer is a page dimmer
      */
    def apply(behavior: `is page dimmer`): Boolean = js.native
    /**
      * Whether dimmable section is body
      */
    def apply(behavior: `is page`): Boolean = js.native
    /**
      * Sets page dimmer to active
      */
    def apply(behavior: `set active`): JQuery = js.native
    /**
      * Sets an element as a dimmable section
      */
    def apply(behavior: `set dimmable`): JQuery = js.native
    /**
      * Sets a dimmable section as dimmed
      */
    def apply(behavior: `set dimmed`): JQuery = js.native
    /**
      * Sets a dimmer as disabled
      */
    def apply(behavior: `set disabled`): JQuery = js.native
    /**
      * Changes dimmer opacity
      */
    def apply(behavior: `set opacity`, opacity: Double): JQuery = js.native
    /**
      * Sets current dimmer as a page dimmer
      */
    def apply(behavior: `set page dimmer`): JQuery = js.native
    /**
      * Creates a new dimmer in dimmable context
      */
    def apply(behavior: create): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides dimmer
      */
    def apply(behavior: hide): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): auto | Boolean = js.native
    def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: closable, value: auto): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: dimmerName, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: dimmerName, value: String): JQuery = js.native
    def apply(behavior: setting, name: dimmerName, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: duration, value: DurationSettings): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onChange, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onShow, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): `false` | hover | click = js.native
    def apply(behavior: setting, name: on, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: on, value: click): JQuery = js.native
    def apply(behavior: setting, name: on, value: hover): JQuery = js.native
    def apply(behavior: setting, name: opacity, value: js.UndefOr[scala.Nothing]): auto | Double = js.native
    def apply(behavior: setting, name: opacity, value: Double): JQuery = js.native
    def apply(behavior: setting, name: opacity, value: auto): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: template, value: js.UndefOr[scala.Nothing]): TemplateSettings = js.native
    def apply(behavior: setting, name: template, value: TemplateSettings): JQuery = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: useCSS, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: useCSS, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: variation, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: variation, value: String): JQuery = js.native
    def apply(behavior: setting, name: variation, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: DimmerSettings): JQuery = js.native
    /**
      * Shows dimmer
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Toggles current dimmer visibility
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: DimmerSettings): JQuery = js.native
    
    var settings: DimmerSettings = js.native
  }
  object Dimmer {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'dimmable'
          */
        var dimmable: String = js.native
        
        /**
          * @default 'dimmed'
          */
        var dimmed: String = js.native
        
        /**
          * @default 'disabled'
          */
        var disabled: String = js.native
        
        /**
          * @default 'hide'
          */
        var hide: String = js.native
        
        /**
          * @default 'page'
          */
        var pageDimmer: String = js.native
        
        /**
          * @default 'show'
          */
        var show: String = js.native
        
        /**
          * @default 'transition'
          */
        var transition: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          active: String,
          dimmable: String,
          dimmed: String,
          disabled: String,
          hide: String,
          pageDimmer: String,
          show: String,
          transition: String
        ): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], pageDimmer = pageDimmer.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPageDimmer(value: String): Self = StObject.set(x, "pageDimmer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImpldimmable | PickImpldimmed | PickImpldisabled | PickImplpageDimmer | PickImplhideHide | PickImplshowShow | PickImpltransition) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object DurationSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 500
          */
        var hide: Double = js.native
        
        /**
          * @default 500
          */
        var show: Double = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(hide: Double, show: Double): Impl = {
          val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplshow | PickImplhide) with PartialPickImplkeyofImplHide
    }
    type DurationSettings = typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings.Param
    
    /* Inlined semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings.Param */
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
      
      /* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ErrorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var method: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(method: String with js.UndefOr[String]): typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.ErrorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMethod(value: String with js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.ui.dimmer > .content, .ui.dimmer > .content > .center'
          */
        var content: String = js.native
        
        /**
          * @default '.dimmable'
          */
        var dimmable: String = js.native
        
        /**
          * @default '.ui.dimmer'
          */
        var dimmer: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(content: String, dimmable: String, dimmer: String): Impl = {
          val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmer = dimmer.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDimmer(value: String): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpldimmable | PickImpldimmer | PickImplcontent) with PartialPickImplkeyofImplContent
    }
    type SelectorSettings = typingsSlinky.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings.Param
    
    /* Inlined semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings.Param */
    @js.native
    trait TemplateSettings extends StObject {
      
      def dimmer(): JQuery = js.native
      @JSName("dimmer")
      var dimmer_Original: js.Function0[JQuery] with js.UndefOr[js.Function0[JQuery]] = js.native
    }
    object TemplateSettings {
      
      @js.native
      trait Impl extends StObject {
        
        def dimmer(): JQuery = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(dimmer: () => JQuery): Impl = {
          val __obj = js.Dynamic.literal(dimmer = js.Any.fromFunction0(dimmer))
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDimmer(value: () => JQuery): Self = StObject.set(x, "dimmer", js.Any.fromFunction0(value))
        }
      }
      
      /* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl, 'dimmer'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.TemplateSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        def dimmer(): JQuery = js.native
        @JSName("dimmer")
        var dimmer_Original: js.Function0[JQuery] with js.UndefOr[js.Function0[JQuery]] = js.native
      }
    }
  }
  
  object DimmerSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Whether clicking on the dimmer should hide the dimmer (Defaults to auto, closable only when settings.on is not hover
        *
        * @default 'auto'
        */
      var closable: auto | Boolean = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * If initializing a dimmer on a dimmable context, you can use dimmerName to distinguish between multiple dimmers in that context.
        *
        * @default false
        */
      var dimmerName: `false` | String = js.native
      
      /**
        * Animation duration of dimming. If an integer is used, that value will apply to both show and hide animations.
        */
      var duration: Double | DurationSettings = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Error messages displayed to console
        */
      var error: ErrorSettings = js.native
      
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
        * Can be set to hover or click to show/hide dimmer on dimmable event
        *
        * @default false
        */
      var on: `false` | hover | click = js.native
      
      /**
        * Callback on element show or hide
        */
      def onChange(): Unit = js.native
      
      /**
        * Callback on element hide
        */
      def onHide(): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback on element show
        */
      def onShow(): Unit = js.native
      
      // region Behavior
      /**
        * Dimmers opacity from 0-1. Defaults to auto which uses the CSS specified opacity.
        *
        * @default 'auto'
        */
      var opacity: auto | Double = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Object containing selectors used by module.
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Templates used to generate dimmer content
        */
      var template: TemplateSettings = js.native
      
      /**
        * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
        *
        * @default 'fade'
        * @see {@link http://semantic-ui.com/modules/transition.html}
        */
      var transition: String = js.native
      
      /**
        * Whether to dim dimmers using CSS transitions.
        *
        * @default true
        */
      var useCSS: Boolean = js.native
      
      /**
        * Specify a variation to add when generating dimmer, like inverted
        *
        * @default false
        */
      var variation: `false` | String = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        className: ClassNameSettings,
        closable: auto | Boolean,
        debug: Boolean,
        dimmerName: `false` | String,
        duration: Double | DurationSettings,
        error: ErrorSettings,
        name: String,
        namespace: String,
        on: `false` | hover | click,
        onChange: () => Unit,
        onHide: () => Unit,
        onShow: () => Unit,
        opacity: auto | Double,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        template: TemplateSettings,
        transition: String,
        useCSS: Boolean,
        variation: `false` | String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], dimmerName = dimmerName.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHide = js.Any.fromFunction0(onHide), onShow = js.Any.fromFunction0(onShow), opacity = opacity.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useCSS = useCSS.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClosable(value: auto | Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDimmerName(value: `false` | String): Self = StObject.set(x, "dimmerName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double | DurationSettings): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOn(value: `false` | hover | click): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOpacity(value: auto | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: TemplateSettings): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariation(value: `false` | String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplopacity | PickImplvariation | PickImpldimmerName | PickImplclosable | PickImplon | PickImpluseCSS | PickImplduration | PickImpltransition | PickImplonShow | PickImplonHide | PickImplonChange | PickImplselector | PickImpltemplate | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/dimmer.html#/settings}
    */
  type DimmerSettings = typingsSlinky.semanticUiDimmer.SemanticUI.DimmerSettings.Param
}
