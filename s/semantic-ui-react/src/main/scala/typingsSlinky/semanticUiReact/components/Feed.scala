package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.feedContentMod.FeedContentProps
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedEventMod.FeedEventProps
import typingsSlinky.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsSlinky.semanticUiReact.feedFeedMod.FeedProps
import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsSlinky.semanticUiReact.feedLikeMod.FeedLikeProps
import typingsSlinky.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Feed {
  
  @JSImport("semantic-ui-react", "Feed")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsVarargs(value: SemanticShorthandItem[FeedEventProps]*): this.type = set("events", js.Array(value :_*))
    
    @scala.inline
    def events(value: SemanticShorthandCollection[FeedEventProps]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: small | large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FeedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Feed.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  object Content {
    
    @JSImport("semantic-ui-react", "Feed.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedContentProps): SharedBuilder_FeedContentProps380343706 = new SharedBuilder_FeedContentProps380343706(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Content.type): SharedBuilder_FeedContentProps380343706 = new SharedBuilder_FeedContentProps380343706(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Date {
    
    @JSImport("semantic-ui-react", "Feed.Date")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedDateProps): SharedBuilder_FeedDateProps_1121330675 = new SharedBuilder_FeedDateProps_1121330675(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Date.type): SharedBuilder_FeedDateProps_1121330675 = new SharedBuilder_FeedDateProps_1121330675(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object User {
    
    @JSImport("semantic-ui-react", "Feed.User")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedUserProps): SharedBuilder_FeedUserProps_1451204653 = new SharedBuilder_FeedUserProps_1451204653(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: User.type): SharedBuilder_FeedUserProps_1451204653 = new SharedBuilder_FeedUserProps_1451204653(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Extra {
    
    @JSImport("semantic-ui-react", "Feed.Extra")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedExtraProps): SharedBuilder_FeedExtraProps_1691549295 = new SharedBuilder_FeedExtraProps_1691549295(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Extra.type): SharedBuilder_FeedExtraProps_1691549295 = new SharedBuilder_FeedExtraProps_1691549295(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Event {
    
    @JSImport("semantic-ui-react", "Feed.Event")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedEventProps): SharedBuilder_FeedEventProps1387652423 = new SharedBuilder_FeedEventProps1387652423(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Event.type): SharedBuilder_FeedEventProps1387652423 = new SharedBuilder_FeedEventProps1387652423(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Like {
    
    @JSImport("semantic-ui-react", "Feed.Like")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedLikeProps): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Like.type): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Label {
    
    @JSImport("semantic-ui-react", "Feed.Label")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedLabelProps): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Label.type): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Summary {
    
    @JSImport("semantic-ui-react", "Feed.Summary")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedSummaryProps): SharedBuilder_FeedSummaryProps_1963097148 = new SharedBuilder_FeedSummaryProps_1963097148(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Summary.type): SharedBuilder_FeedSummaryProps_1963097148 = new SharedBuilder_FeedSummaryProps_1963097148(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Meta {
    
    @JSImport("semantic-ui-react", "Feed.Meta")
    @js.native
    object component extends js.Object
    
    def withProps(p: FeedMetaProps): SharedBuilder_FeedMetaProps1680283281 = new SharedBuilder_FeedMetaProps1680283281(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    implicit def make(companion: Meta.type): SharedBuilder_FeedMetaProps1680283281 = new SharedBuilder_FeedMetaProps1680283281(js.Array(this.component, js.Dictionary.empty))()
  }
}
