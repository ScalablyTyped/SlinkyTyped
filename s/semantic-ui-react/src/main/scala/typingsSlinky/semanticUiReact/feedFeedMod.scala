package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.feedContentMod.FeedContentProps
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedEventMod.FeedEventProps
import typingsSlinky.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsSlinky.semanticUiReact.feedLikeMod.FeedLikeProps
import typingsSlinky.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedFeedMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/Feed", JSImport.Default)
  @js.native
  val default: FeedComponent = js.native
  
  @js.native
  trait FeedComponent extends FunctionComponent[FeedProps] {
    
    var Content: ReactComponentClass[FeedContentProps] = js.native
    
    var Date: ReactComponentClass[FeedDateProps] = js.native
    
    var Event: ReactComponentClass[FeedEventProps] = js.native
    
    var Extra: ReactComponentClass[FeedExtraProps] = js.native
    
    var Label: ReactComponentClass[FeedLabelProps] = js.native
    
    var Like: ReactComponentClass[FeedLikeProps] = js.native
    
    var Meta: ReactComponentClass[FeedMetaProps] = js.native
    
    var Summary: ReactComponentClass[FeedSummaryProps] = js.native
    
    var User: ReactComponentClass[FeedUserProps] = js.native
  }
  
  @js.native
  trait FeedProps
    extends StrictFeedProps
       with /* key */ StringDictionary[js.Any]
  object FeedProps {
    
    @scala.inline
    def apply(): FeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedProps]
    }
  }
  
  @js.native
  trait StrictFeedProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand array of props for FeedEvent. */
    var events: js.UndefOr[SemanticShorthandCollection[FeedEventProps]] = js.native
    
    /** A feed can have different sizes. */
    var size: js.UndefOr[small | large] = js.native
  }
  object StrictFeedProps {
    
    @scala.inline
    def apply(): StrictFeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedProps]
    }
    
    @scala.inline
    implicit class StrictFeedPropsMutableBuilder[Self <: StrictFeedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
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
      def setEvents(value: SemanticShorthandCollection[FeedEventProps]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: SemanticShorthandItem[FeedEventProps]*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FeedComponent
  
  /* This means you don't have to write `default`, but can instead just say `feedFeedMod.foo` */
  override def _to: FeedComponent = default
}
