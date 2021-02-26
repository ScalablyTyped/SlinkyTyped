package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.ratingIconMod.RatingIconProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.auto
import typingsSlinky.semanticUiReact.semanticUiReactStrings.heart
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.star
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingRatingMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[RatingProps, js.Object, js.Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", JSImport.Default)
    @js.native
    val ^ : RatingComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/Rating", "default.Icon")
    @js.native
    class Icon protected ()
      extends Component[RatingIconProps, js.Object, js.Any] {
      def this(props: RatingIconProps) = this()
      def this(props: RatingIconProps, context: js.Any) = this()
    }
    
    type _To = RatingComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: RatingComponent = ^
  }
  
  @js.native
  trait RatingComponent
    extends ComponentClass[RatingProps, js.Object] {
    
    var Icon: ReactComponentClass[RatingIconProps] = js.native
  }
  
  @js.native
  trait RatingProps
    extends StrictRatingProps
       with /* key */ StringDictionary[js.Any]
  object RatingProps {
    
    @scala.inline
    def apply(): RatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingProps]
    }
  }
  
  @js.native
  trait StrictRatingProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /**
      * You can clear the rating by clicking on the current start rating.
      * By default a rating will be only clearable if there is 1 icon.
      * Setting to `true`/`false` will allow or disallow a user to clear their rating.
      */
    var clearable: js.UndefOr[Boolean | auto] = js.native
    
    /** The initial rating value. */
    var defaultRating: js.UndefOr[Double | String] = js.native
    
    /** You can disable or enable interactive rating.  Makes a read-only rating. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** A rating can use a set of star or heart icons. */
    var icon: js.UndefOr[star | heart] = js.native
    
    /** The total number of icons. */
    var maxRating: js.UndefOr[Double | String] = js.native
    
    /**
      * Called after user selects a new rating.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onRate: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ RatingProps, Unit]
      ] = js.native
    
    /** The current number of active icons. */
    var rating: js.UndefOr[Double | String] = js.native
    
    /** A progress bar can vary in size. */
    var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.native
  }
  object StrictRatingProps {
    
    @scala.inline
    def apply(): StrictRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingProps]
    }
    
    @scala.inline
    implicit class StrictRatingPropsMutableBuilder[Self <: StrictRatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean | auto): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def setDefaultRating(value: Double | String): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: star | heart): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaxRating(value: Double | String): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRatingUndefined: Self = StObject.set(x, "maxRating", js.undefined)
      
      @scala.inline
      def setOnRate(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ RatingProps) => Unit): Self = StObject.set(x, "onRate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRateUndefined: Self = StObject.set(x, "onRate", js.undefined)
      
      @scala.inline
      def setRating(value: Double | String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
