package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.genericMod.SemanticTRANSITIONS
import typingsSlinky.semanticUiReact.transitionGroupMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionTransitionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TransitionProps, js.Object, js.Any] {
    def this(props: TransitionProps) = this()
    def this(props: TransitionProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", JSImport.Default)
    @js.native
    val ^ : TransitionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", "default.Group")
    @js.native
    class Group protected ()
      extends Component[TransitionGroupProps, js.Object, js.Any] {
      def this(props: TransitionGroupProps) = this()
      def this(props: TransitionGroupProps, context: js.Any) = this()
    }
    
    type _To = TransitionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: TransitionComponent = ^
  }
  
  @js.native
  trait StrictTransitionProps extends StObject {
    
    /** Named animation event to used. Must be defined in CSS. */
    var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Whether it is directional animation event or not. Use it only for custom transitions. */
    var directional: js.UndefOr[Boolean] = js.native
    
    /** Duration of the CSS transition animation in milliseconds. */
    var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.native
    
    /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
    var mountOnShow: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback on each transition that changes visibility to shown.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onComplete: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
    
    /**
      * Callback on each transition that changes visibility to hidden.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onHide: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
    
    /**
      * Callback on each transition that changes visibility to shown.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onShow: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
    
    /**
      * Callback on animation start.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onStart: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.native
    
    /** React's key of the element. */
    var reactKey: js.UndefOr[String] = js.native
    
    /** Run the enter animation when the component mounts, if it is initially shown. */
    var transitionOnMount: js.UndefOr[Boolean] = js.native
    
    /** Unmount the component (remove it from the DOM) when it is not shown. */
    var unmountOnHide: js.UndefOr[Boolean] = js.native
    
    /** Show the component; triggers the enter or exit animation. */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object StrictTransitionProps {
    
    @scala.inline
    def apply(): StrictTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionProps]
    }
    
    @scala.inline
    implicit class StrictTransitionPropsMutableBuilder[Self <: StrictTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: SemanticTRANSITIONS | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirectional(value: Boolean): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalUndefined: Self = StObject.set(x, "directional", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | String | TransitionPropDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMountOnShow(value: Boolean): Self = StObject.set(x, "mountOnShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnShowUndefined: Self = StObject.set(x, "mountOnShow", js.undefined)
      
      @scala.inline
      def setOnComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setReactKey(value: String): Self = StObject.set(x, "reactKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactKeyUndefined: Self = StObject.set(x, "reactKey", js.undefined)
      
      @scala.inline
      def setTransitionOnMount(value: Boolean): Self = StObject.set(x, "transitionOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionOnMountUndefined: Self = StObject.set(x, "transitionOnMount", js.undefined)
      
      @scala.inline
      def setUnmountOnHide(value: Boolean): Self = StObject.set(x, "unmountOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnHideUndefined: Self = StObject.set(x, "unmountOnHide", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERED
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERING
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITED
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITING
    - typingsSlinky.semanticUiReact.semanticUiReactStrings.UNMOUNTED
  */
  trait TRANSITION_STATUSES extends StObject
  object TRANSITION_STATUSES {
    
    @scala.inline
    def ENTERED: typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERED = "ENTERED".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERED]
    
    @scala.inline
    def ENTERING: typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERING = "ENTERING".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERING]
    
    @scala.inline
    def EXITED: typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITED = "EXITED".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITED]
    
    @scala.inline
    def EXITING: typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITING = "EXITING".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITING]
    
    @scala.inline
    def UNMOUNTED: typingsSlinky.semanticUiReact.semanticUiReactStrings.UNMOUNTED = "UNMOUNTED".asInstanceOf[typingsSlinky.semanticUiReact.semanticUiReactStrings.UNMOUNTED]
  }
  
  @js.native
  trait TransitionComponent
    extends ComponentClass[TransitionProps, js.Object] {
    
    var ENTERED: typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERED = js.native
    
    var ENTERING: typingsSlinky.semanticUiReact.semanticUiReactStrings.ENTERING = js.native
    
    var EXITED: typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITED = js.native
    
    var EXITING: typingsSlinky.semanticUiReact.semanticUiReactStrings.EXITING = js.native
    
    var Group: ReactComponentClass[TransitionGroupProps] = js.native
    
    var UNMOUNTED: typingsSlinky.semanticUiReact.semanticUiReactStrings.UNMOUNTED = js.native
  }
  
  @js.native
  trait TransitionEventData extends TransitionProps {
    
    var status: TRANSITION_STATUSES = js.native
  }
  object TransitionEventData {
    
    @scala.inline
    def apply(status: TRANSITION_STATUSES): TransitionEventData = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionEventData]
    }
    
    @scala.inline
    implicit class TransitionEventDataMutableBuilder[Self <: TransitionEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: TRANSITION_STATUSES): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitionPropDuration extends StObject {
    
    var hide: Double = js.native
    
    var show: Double = js.native
  }
  object TransitionPropDuration {
    
    @scala.inline
    def apply(hide: Double, show: Double): TransitionPropDuration = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPropDuration]
    }
    
    @scala.inline
    implicit class TransitionPropDurationMutableBuilder[Self <: TransitionPropDuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransitionProps
    extends StrictTransitionProps
       with /* key */ StringDictionary[js.Any]
  object TransitionProps {
    
    @scala.inline
    def apply(): TransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionProps]
    }
  }
}
