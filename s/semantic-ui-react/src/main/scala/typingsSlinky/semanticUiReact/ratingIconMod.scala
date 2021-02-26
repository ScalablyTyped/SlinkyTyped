package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingIconMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[RatingIconProps, js.Object, js.Any] {
    def this(props: RatingIconProps) = this()
    def this(props: RatingIconProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Rating/RatingIcon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RatingIconProps] = js.native
  
  @js.native
  trait RatingIconProps
    extends StrictRatingIconProps
       with /* key */ StringDictionary[js.Any]
  object RatingIconProps {
    
    @scala.inline
    def apply(): RatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingIconProps]
    }
  }
  
  @js.native
  trait StrictRatingIconProps extends StObject {
    
    /** Indicates activity of an icon. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** An index of icon inside Rating. */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onClick: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.native
    
    /**
      * Called on keyup.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onKeyUp: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.native
    
    /**
      * Called on mouseenter.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed rating.
      */
    var onMouseEnter: js.UndefOr[
        js.Function2[/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps, Unit]
      ] = js.native
    
    /** Indicates selection of an icon. */
    var selected: js.UndefOr[Boolean] = js.native
  }
  object StrictRatingIconProps {
    
    @scala.inline
    def apply(): StrictRatingIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRatingIconProps]
    }
    
    @scala.inline
    implicit class StrictRatingIconPropsMutableBuilder[Self <: StrictRatingIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RatingIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `ratingIconMod.foo` */
  override def _to: ReactComponentClass[RatingIconProps] = default
}
