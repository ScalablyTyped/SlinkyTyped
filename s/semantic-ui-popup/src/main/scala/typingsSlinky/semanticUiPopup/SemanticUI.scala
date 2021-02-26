package typingsSlinky.semanticUiPopup

import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ClassNameSettings.Param
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typingsSlinky.semanticUiPopup.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiPopup.anon.PartialPickImplkeyofImplCannotPlace
import typingsSlinky.semanticUiPopup.anon.PartialPickImplkeyofImplContent
import typingsSlinky.semanticUiPopup.anon.PartialPickImplkeyofImplHide
import typingsSlinky.semanticUiPopup.anon.PartialPickImplkeyofImplLoading
import typingsSlinky.semanticUiPopup.anon.PickImpladdTouchEvents
import typingsSlinky.semanticUiPopup.anon.PickImplboundary
import typingsSlinky.semanticUiPopup.anon.PickImplcannotPlace
import typingsSlinky.semanticUiPopup.anon.PickImplclassName
import typingsSlinky.semanticUiPopup.anon.PickImplclosable
import typingsSlinky.semanticUiPopup.anon.PickImplcontent
import typingsSlinky.semanticUiPopup.anon.PickImplcontext
import typingsSlinky.semanticUiPopup.anon.PickImpldebug
import typingsSlinky.semanticUiPopup.anon.PickImpldelay
import typingsSlinky.semanticUiPopup.anon.PickImpldistanceAway
import typingsSlinky.semanticUiPopup.anon.PickImplduration
import typingsSlinky.semanticUiPopup.anon.PickImplerror
import typingsSlinky.semanticUiPopup.anon.PickImplexclusive
import typingsSlinky.semanticUiPopup.anon.PickImplhide
import typingsSlinky.semanticUiPopup.anon.PickImplhideOnScroll
import typingsSlinky.semanticUiPopup.anon.PickImplhoverable
import typingsSlinky.semanticUiPopup.anon.PickImplhtml
import typingsSlinky.semanticUiPopup.anon.PickImplhtmlHtml
import typingsSlinky.semanticUiPopup.anon.PickImplinline
import typingsSlinky.semanticUiPopup.anon.PickImplinvalidPosition
import typingsSlinky.semanticUiPopup.anon.PickImpljitter
import typingsSlinky.semanticUiPopup.anon.PickImpllastResort
import typingsSlinky.semanticUiPopup.anon.PickImplloading
import typingsSlinky.semanticUiPopup.anon.PickImplmaxSearchDepth
import typingsSlinky.semanticUiPopup.anon.PickImplmetadata
import typingsSlinky.semanticUiPopup.anon.PickImplmethod
import typingsSlinky.semanticUiPopup.anon.PickImplmovePopup
import typingsSlinky.semanticUiPopup.anon.PickImplname
import typingsSlinky.semanticUiPopup.anon.PickImplnamespace
import typingsSlinky.semanticUiPopup.anon.PickImplnoTransition
import typingsSlinky.semanticUiPopup.anon.PickImplnotFound
import typingsSlinky.semanticUiPopup.anon.PickImplobserveChanges
import typingsSlinky.semanticUiPopup.anon.PickImploffset
import typingsSlinky.semanticUiPopup.anon.PickImploffsetOffset
import typingsSlinky.semanticUiPopup.anon.PickImplon
import typingsSlinky.semanticUiPopup.anon.PickImplonCreate
import typingsSlinky.semanticUiPopup.anon.PickImplonHidden
import typingsSlinky.semanticUiPopup.anon.PickImplonHide
import typingsSlinky.semanticUiPopup.anon.PickImplonRemove
import typingsSlinky.semanticUiPopup.anon.PickImplonShow
import typingsSlinky.semanticUiPopup.anon.PickImplonUnplaceable
import typingsSlinky.semanticUiPopup.anon.PickImplonVisible
import typingsSlinky.semanticUiPopup.anon.PickImplperformance
import typingsSlinky.semanticUiPopup.anon.PickImplpopup
import typingsSlinky.semanticUiPopup.anon.PickImplpopupPopup
import typingsSlinky.semanticUiPopup.anon.PickImplpopupVisible
import typingsSlinky.semanticUiPopup.anon.PickImplposition
import typingsSlinky.semanticUiPopup.anon.PickImplprefer
import typingsSlinky.semanticUiPopup.anon.PickImplpreserve
import typingsSlinky.semanticUiPopup.anon.PickImplscrollContext
import typingsSlinky.semanticUiPopup.anon.PickImplselector
import typingsSlinky.semanticUiPopup.anon.PickImplsetFluidWidth
import typingsSlinky.semanticUiPopup.anon.PickImplshow
import typingsSlinky.semanticUiPopup.anon.PickImplsilent
import typingsSlinky.semanticUiPopup.anon.PickImpltarget
import typingsSlinky.semanticUiPopup.anon.PickImpltitle
import typingsSlinky.semanticUiPopup.anon.PickImpltransition
import typingsSlinky.semanticUiPopup.anon.PickImplvariation
import typingsSlinky.semanticUiPopup.anon.PickImplverbose
import typingsSlinky.semanticUiPopup.anon.PickImplvisible
import typingsSlinky.semanticUiPopup.semanticUiPopupBooleans.`false`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`change content`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`inline`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.`set position`
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.addTouchEvents
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.adjacent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.auto
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.boundary
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.className
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.click
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.closable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.content
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.context
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.debug
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.delay
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.destroy
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.distanceAway
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.duration
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.error
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.exclusive
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.exists
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.focus
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hide
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hideOnScroll
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hover
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.hoverable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.html
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.jitter
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.lastResort
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.manual
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.maxSearchDepth
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.metadata
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.movePopup
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.name
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.namespace
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.observeChanges
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.offset
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.on
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onCreate
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onHidden
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onHide
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onRemove
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onShow
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onUnplaceable
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.onVisible
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.opposite
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.performance
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.popup
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.position
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.prefer
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.preserve
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.reposition
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.scrollContext
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.selector
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.setFluidWidth
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.setting
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.show
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.silent
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.target
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.title
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.toggle
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.transition
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.variation
import typingsSlinky.semanticUiPopup.semanticUiPopupStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Popup extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * @since 2.2.11
      */
    def apply(behavior: `bind clickaway`): JQuery = js.native
    /**
      * @since 2.2.11
      */
    def apply(behavior: `bind close on scroll`): JQuery = js.native
    /**
      * @since 2.2.11
      */
    def apply(behavior: `bind touch close`): JQuery = js.native
    /**
      * Changes current popup content
      */
    def apply(behavior: `change content`, html: String): JQuery = js.native
    /**
      * Returns current popup dom element
      */
    def apply(behavior: `get popup`): JQuery = js.native
    /**
      * Hides all visible pop ups on the page
      */
    def apply(behavior: `hide all`): JQuery = js.native
    /**
      * Returns whether popup is hidden
      */
    def apply(behavior: `is hidden`): Boolean = js.native
    /**
      * Returns whether popup is visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Removes popup from the page
      */
    def apply(behavior: `remove popup`): JQuery = js.native
    /**
      * Repositions a popup
      */
    def apply(behavior: `set position`, position: String): JQuery = js.native
    /**
      * Removes popup from the page and removes all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Returns whether popup is created and inserted into the page
      */
    def apply(behavior: exists): Boolean = js.native
    /**
      * Hides popup
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Adjusts popup when content size changes (only necessary for centered popups)
      */
    def apply(behavior: reposition): JQuery = js.native
    def apply(behavior: setting, name: `inline`, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: addTouchEvents, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: addTouchEvents, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: boundary, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: boundary, value: String): JQuery = js.native
    def apply(behavior: setting, name: boundary, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
    def apply(behavior: setting, name: closable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: closable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: content, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: content, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: delay, value: js.UndefOr[scala.Nothing]): DelaySettings = js.native
    def apply(behavior: setting, name: distanceAway, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: distanceAway, value: Double): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: exclusive, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: hideOnScroll, value: js.UndefOr[scala.Nothing]): auto | `false` = js.native
    def apply(behavior: setting, name: hideOnScroll, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: hideOnScroll, value: auto): JQuery = js.native
    def apply(behavior: setting, name: hoverable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: hoverable, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: html, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: html, value: String): JQuery = js.native
    def apply(behavior: setting, name: html, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
    def apply(behavior: setting, name: lastResort, value: js.UndefOr[scala.Nothing]): Boolean | String = js.native
    def apply(behavior: setting, name: lastResort, value: String): JQuery = js.native
    def apply(behavior: setting, name: lastResort, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: maxSearchDepth, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: maxSearchDepth, value: Double): JQuery = js.native
    def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
    def apply(behavior: setting, name: movePopup, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: movePopup, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
    def apply(behavior: setting, name: onCreate, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onCreate,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onHidden, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onHidden,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onHide,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onRemove, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onRemove,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onShow, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onShow,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onUnplaceable, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onUnplaceable,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
    def apply(
      behavior: setting,
      name: onVisible,
      value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: on, value: js.UndefOr[scala.Nothing]): focus | click | hover | manual = js.native
    def apply(behavior: setting, name: on, value: click): JQuery = js.native
    def apply(behavior: setting, name: on, value: focus): JQuery = js.native
    def apply(behavior: setting, name: on, value: hover): JQuery = js.native
    def apply(behavior: setting, name: on, value: manual): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: popup, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: popup, value: String): JQuery = js.native
    def apply(behavior: setting, name: popup, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: popup, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: position, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: position, value: String): JQuery = js.native
    def apply(behavior: setting, name: prefer, value: js.UndefOr[scala.Nothing]): adjacent | opposite = js.native
    def apply(behavior: setting, name: prefer, value: adjacent): JQuery = js.native
    def apply(behavior: setting, name: prefer, value: opposite): JQuery = js.native
    def apply(behavior: setting, name: preserve, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: preserve, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
    def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: setFluidWidth, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: setFluidWidth, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: target, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: target, value: String): JQuery = js.native
    def apply(behavior: setting, name: target, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: target, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: title, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: title, value: String): JQuery = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: variation, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: variation, value: String): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: PopupSettings): JQuery = js.native
    /**
      * Shows popup
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Toggles visibility of popup
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: PopupSettings): JQuery = js.native
    
    var settings: PopupSettings = js.native
  }
  object Popup {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
        
        /**
          * @default 'ui popup'
          */
        var popup: String = js.native
        
        /**
          * @since 2.2.11
          */
        var popupVisible: String = js.native
        
        /**
          * @default 'top left center bottom right'
          */
        var position: String = js.native
        
        /**
          * @default 'visible'
          */
        var visible: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(loading: String, popup: String, popupVisible: String, position: String, visible: String): Impl = {
          val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], popupVisible = popupVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplloading | PickImplpopupPopup | PickImplposition | PickImplvisible | PickImplpopupVisible) with PartialPickImplkeyofImplLoading
    }
    type ClassNameSettings = Param
    
    object DelaySettings {
      
      @js.native
      trait Impl extends StObject {
        
        var hide: Double = js.native
        
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
    type DelaySettings = typingsSlinky.semanticUiPopup.SemanticUI.Popup.DelaySettings.Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'Popup does not fit within the boundaries of the viewport'
          */
        var cannotPlace: String = js.native
        
        /**
          * @default 'The position you specified is not a valid position'
          */
        var invalidPosition: String = js.native
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default 'This module requires ui transitions <https: github.com="" semantic-org="" ui-transition="">'
          */
        var noTransition: String = js.native
        
        /**
          * @default 'The target or popup you specified does not exist on the page'
          */
        var notFound: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          cannotPlace: String,
          invalidPosition: String,
          method: String,
          noTransition: String,
          notFound: String
        ): Impl = {
          val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any], invalidPosition = invalidPosition.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noTransition = noTransition.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCannotPlace(value: String): Self = StObject.set(x, "cannotPlace", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoTransition(value: String): Self = StObject.set(x, "noTransition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplinvalidPosition | PickImplcannotPlace | PickImplmethod | PickImplnoTransition | PickImplnotFound) with PartialPickImplkeyofImplCannotPlace
    }
    type ErrorSettings = typingsSlinky.semanticUiPopup.SemanticUI.Popup.ErrorSettings.Param
    
    object MetadataSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'content'
          */
        var content: String = js.native
        
        /**
          * @default 'html'
          */
        var html: String = js.native
        
        /**
          * @default 'offset'
          */
        var offset: String = js.native
        
        /**
          * @default 'position'
          */
        var position: String = js.native
        
        /**
          * @default 'title'
          */
        var title: String = js.native
        
        /**
          * @default 'variation'
          */
        var variation: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(content: String, html: String, offset: String, position: String, title: String, variation: String): Impl = {
          val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplcontent | PickImplhtmlHtml | PickImploffsetOffset | PickImplposition | PickImpltitle | PickImplvariation) with PartialPickImplkeyofImplContent
    }
    type MetadataSettings = typingsSlinky.semanticUiPopup.SemanticUI.Popup.MetadataSettings.Param
    
    /* Inlined semantic-ui-popup.SemanticUI.Popup.SelectorSettings.Param */
    @js.native
    trait SelectorSettings extends StObject {
      
      var popup: String with js.UndefOr[String] = js.native
    }
    object SelectorSettings {
      
      @scala.inline
      def apply(popup: String with js.UndefOr[String]): SelectorSettings = {
        val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectorSettings]
      }
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.ui.popup'
          */
        var popup: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(popup: String): Impl = {
          val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, 'popup'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        var popup: String with js.UndefOr[String] = js.native
      }
      object Param {
        
        @scala.inline
        def apply(popup: String with js.UndefOr[String]): typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param = {
          val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param]
        }
        
        @scala.inline
        implicit class ParamMutableBuilder[Self <: typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings.Param] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setPopup(value: String with js.UndefOr[String]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        }
      }
      
      @scala.inline
      implicit class SelectorSettingsMutableBuilder[Self <: SelectorSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPopup(value: String with js.UndefOr[String]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object PopupSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * When using on: 'hover' whether touchstart events should be added to allow the popup to be triggered
        */
      var addTouchEvents: Boolean = js.native
      
      /**
        * When the popup surpasses the boundary of this element, it will attempt to find another display position.
        */
      var boundary: String | JQuery = js.native
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * When using on: 'click' specifies whether clicking the page should close the popup
        *
        * @default true
        */
      var closable: Boolean = js.native
      
      /**
        * Content to display
        */
      var content: String = js.native
      
      /**
        * Selector or jquery object specifying where the popup should be created.
        *
        * @default 'body'
        */
      var context: String | JQuery = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Delay in milliseconds before showing or hiding a popup on hover or focus
        */
      var delay: DelaySettings = js.native
      
      /**
        * Offset for distance of popup from element
        *
        * @default 0
        */
      var distanceAway: Double = js.native
      
      /**
        * Duration of animation events
        *
        * @default 200
        */
      var duration: Double = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether all other popups should be hidden when this popup is opened
        *
        * @default false
        */
      var exclusive: Boolean = js.native
      
      /**
        * Whether popup should hide on scroll or touchmove, auto only hides for popups without on: 'click'.
        * Set this to false to prevent mobile browsers from closing popups when you tap inside input fields.
        *
        * @default 'auto'
        */
      var hideOnScroll: auto | `false` = js.native
      
      /**
        * Whether popup should not close on hover (useful for popup navigation menus)
        *
        * @default false
        */
      var hoverable: Boolean = js.native
      
      /**
        * HTML content to display instead of preformatted title and content
        */
      var html: String | JQuery = js.native
      
      /**
        * If a popup is inline it will be created next to current element, allowing for local css rules to apply.
        * It will not be removed from the DOM after being hidden.
        * Otherwise popups will appended to body and removed after being hidden.
        *
        * @default false
        */
      var `inline`: Boolean = js.native
      
      /**
        * Number of pixels that a popup is allowed to appear outside the boundaries of its context.
        * This allows for permissible rounding errors when an element is against the edge of its context.
        *
        * @default 2
        */
      var jitter: Double = js.native
      
      /**
        * When set to false, a popup will not appear and produce an error message if it cannot entirely fit on page.
        * Setting this to a position like, right center forces the popup to use this position as a last resort even if it is partially offstage.
        * Setting this to true will use the last attempted position.
        *
        * @default false
        */
      var lastResort: Boolean | String = js.native
      
      /**
        * Number of iterations before giving up search for popup position when a popup cannot fit on screen
        *
        * @default 10
        */
      var maxSearchDepth: Double = js.native
      
      /**
        * HTML Data attributes used to store data
        */
      var metadata: MetadataSettings = js.native
      
      /**
        * Whether to move popup to same offset container as target element when popup already exists on the page.
        * Using a popup inside of an element without overflow:visible, like a sidebar, may require you to set this to false
        *
        * @default true
        */
      var movePopup: Boolean = js.native
      
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
        * Whether popup should attach mutationObservers to automatically run destroy when the element is removed from the page's DOM.
        *
        * @default true
        */
      var observeChanges: Boolean = js.native
      
      /**
        * Offset in pixels from calculated position
        *
        * @default 0
        */
      var offset: Double = js.native
      
      /**
        * Event used to trigger popup. Can be either focus, click, hover, or manual. Manual popups must be triggered with $('.element').popup('show');
        *
        * @default 'hover'
        */
      var on: focus | click | hover | manual = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback on popup element creation, with created popup
        */
      def onCreate($module: JQuery): Unit = js.native
      
      /**
        * Callback after popup is hidden
        */
      def onHidden($module: JQuery): Unit = js.native
      
      /**
        * Callback before popup is hidden. Returning false from this callback will cancel the popup from hiding.
        */
      def onHide($module: JQuery): `false` | Unit = js.native
      
      /**
        * Callback immediately before Popup is removed from DOM
        */
      def onRemove($module: JQuery): Unit = js.native
      
      /**
        * Callback before popup is shown. Returning false from this callback will cancel the popup from showing.
        */
      def onShow($module: JQuery): `false` | Unit = js.native
      
      /**
        * Callback after popup cannot be placed on screen
        */
      def onUnplaceable($module: JQuery): Unit = js.native
      
      /**
        * Callback after popup is shown
        */
      def onVisible($module: JQuery): Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // region Popup Settings
      /**
        * Can specify a DOM element that should be used as the popup. This is useful for including a pre-formatted popup.
        *
        * @default false
        */
      var popup: `false` | String | JQuery = js.native
      
      /**
        * Position that the popup should appear
        *
        * @default 'top left'
        */
      var position: String = js.native
      
      /**
        * Can be set to adjacent or opposite to prefer adjacent or opposite position if popup cannot fit on screen
        *
        * @default 'adjacent'
        */
      var prefer: adjacent | opposite = js.native
      
      /**
        * Whether popup contents should be preserved in the page after being hidden, allowing it to re-appear slightly faster on subsequent loads.
        *
        * @default false
        */
      var preserve: Boolean = js.native
      
      /**
        * Will automatically hide a popup on scroll event in this context
        */
      var scrollContext: String | JQuery = js.native
      
      // endregion
      // region DOM Settings
      /**
        * DOM Selectors used internally
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Whether popup should set fluid popup variation width on load to avoid width: 100% including padding
        *
        * @default true
        */
      var setFluidWidth: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * If a selector or jQuery object is specified this allows the popup to be positioned relative to that element.
        *
        * @default false
        */
      var target: `false` | String | JQuery = js.native
      
      /**
        * Title to display alongside content
        */
      var title: String = js.native
      
      /**
        * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
        *
        * @default 'slide down'
        * @see {@link http://semantic-ui.com/modules/transition.html}
        */
      var transition: String = js.native
      
      // endregion
      // region Content Settings
      /**
        * Popup variation to use, can use multiple variations with a space delimiter
        */
      var variation: String = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        addTouchEvents: Boolean,
        boundary: String | JQuery,
        className: ClassNameSettings,
        closable: Boolean,
        content: String,
        context: String | JQuery,
        debug: Boolean,
        delay: DelaySettings,
        distanceAway: Double,
        duration: Double,
        error: ErrorSettings,
        exclusive: Boolean,
        hideOnScroll: auto | `false`,
        hoverable: Boolean,
        html: String | JQuery,
        `inline`: Boolean,
        jitter: Double,
        lastResort: Boolean | String,
        maxSearchDepth: Double,
        metadata: MetadataSettings,
        movePopup: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        on: focus | click | hover | manual,
        onCreate: JQuery => Unit,
        onHidden: JQuery => Unit,
        onHide: JQuery => `false` | Unit,
        onRemove: JQuery => Unit,
        onShow: JQuery => `false` | Unit,
        onUnplaceable: JQuery => Unit,
        onVisible: JQuery => Unit,
        performance: Boolean,
        popup: `false` | String | JQuery,
        position: String,
        prefer: adjacent | opposite,
        preserve: Boolean,
        scrollContext: String | JQuery,
        selector: SelectorSettings,
        setFluidWidth: Boolean,
        silent: Boolean,
        target: `false` | String | JQuery,
        title: String,
        transition: String,
        variation: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], distanceAway = distanceAway.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], hideOnScroll = hideOnScroll.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], lastResort = lastResort.asInstanceOf[js.Any], maxSearchDepth = maxSearchDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], movePopup = movePopup.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1(onCreate), onHidden = js.Any.fromFunction1(onHidden), onHide = js.Any.fromFunction1(onHide), onRemove = js.Any.fromFunction1(onRemove), onShow = js.Any.fromFunction1(onShow), onUnplaceable = js.Any.fromFunction1(onUnplaceable), onVisible = js.Any.fromFunction1(onVisible), performance = performance.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], prefer = prefer.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], setFluidWidth = setFluidWidth.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddTouchEvents(value: Boolean): Self = StObject.set(x, "addTouchEvents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundary(value: String | JQuery): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistanceAway(value: Double): Self = StObject.set(x, "distanceAway", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideOnScroll(value: auto | `false`): Self = StObject.set(x, "hideOnScroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml(value: String | JQuery): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastResort(value: Boolean | String): Self = StObject.set(x, "lastResort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxSearchDepth(value: Double): Self = StObject.set(x, "maxSearchDepth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMovePopup(value: Boolean): Self = StObject.set(x, "movePopup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOn(value: focus | click | hover | manual): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCreate(value: JQuery => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnHidden(value: JQuery => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnHide(value: JQuery => `false` | Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnRemove(value: JQuery => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnShow(value: JQuery => `false` | Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUnplaceable(value: JQuery => Unit): Self = StObject.set(x, "onUnplaceable", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnVisible(value: JQuery => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopup(value: `false` | String | JQuery): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefer(value: adjacent | opposite): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetFluidWidth(value: Boolean): Self = StObject.set(x, "setFluidWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: `false` | String | JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplpopup | PickImplexclusive | PickImplmovePopup | PickImplobserveChanges | PickImplboundary | PickImplcontext | PickImplscrollContext | PickImpljitter | PickImplposition | PickImplinline | PickImplpreserve | PickImplprefer | PickImpllastResort | PickImplon | PickImpldelay | PickImpltransition | PickImplduration | PickImplsetFluidWidth | PickImplhoverable | PickImplclosable | PickImpladdTouchEvents | PickImplhideOnScroll | PickImpltarget | PickImpldistanceAway | PickImploffset | PickImplmaxSearchDepth | PickImplonCreate | PickImplonRemove | PickImplonShow | PickImplonVisible | PickImplonHide | PickImplonHidden | PickImplonUnplaceable | PickImplvariation | PickImplcontent | PickImpltitle | PickImplhtml | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/popup.html#/settings}
    */
  type PopupSettings = typingsSlinky.semanticUiPopup.SemanticUI.PopupSettings.Param
}
