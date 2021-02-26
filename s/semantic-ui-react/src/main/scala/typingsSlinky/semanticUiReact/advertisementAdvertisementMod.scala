package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`half banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`half page`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`large leaderboard`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`large rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`medium rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`mobile banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`mobile leaderboard`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small button`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`small square`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`square button`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`top banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`vertical banner`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`vertical rectangle`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.`wide skyscraper`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.banner
import typingsSlinky.semanticUiReact.semanticUiReactStrings.billboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.button
import typingsSlinky.semanticUiReact.semanticUiReactStrings.leaderboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.netboard
import typingsSlinky.semanticUiReact.semanticUiReactStrings.panorama
import typingsSlinky.semanticUiReact.semanticUiReactStrings.skyscraper
import typingsSlinky.semanticUiReact.semanticUiReactStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advertisementAdvertisementMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Advertisement/Advertisement", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AdvertisementProps] = js.native
  
  @js.native
  trait AdvertisementProps
    extends StrictAdvertisementProps
       with /* key */ StringDictionary[js.Any]
  object AdvertisementProps {
    
    @scala.inline
    def apply(
      unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
    ): AdvertisementProps = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertisementProps]
    }
  }
  
  @js.native
  trait StrictAdvertisementProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Center the advertisement. */
    var centered: js.UndefOr[Boolean] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Text to be displayed on the advertisement. */
    var test: js.UndefOr[Boolean | String | Double] = js.native
    
    /** Varies the size of the advertisement. */
    var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`) = js.native
  }
  object StrictAdvertisementProps {
    
    @scala.inline
    def apply(
      unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
    ): StrictAdvertisementProps = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictAdvertisementProps]
    }
    
    @scala.inline
    implicit class StrictAdvertisementPropsMutableBuilder[Self <: StrictAdvertisementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean | String | Double): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setUnit(
        value: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
      ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[AdvertisementProps]
  
  /* This means you don't have to write `default`, but can instead just say `advertisementAdvertisementMod.foo` */
  override def _to: ReactComponentClass[AdvertisementProps] = default
}
