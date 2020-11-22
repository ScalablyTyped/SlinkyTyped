package typingsSlinky.semanticUiReact.feedEventMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.feedContentMod.FeedContentProps
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsSlinky.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictFeedEventProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for FeedContent. */
  var content: js.UndefOr[SemanticShorthandItem[FeedContentProps]] = js.native
  
  /** Shorthand for FeedDate. */
  var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.native
  
  /** Shorthand for FeedExtra with images. */
  var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
  
  /** Shorthand for FeedExtra with content. */
  var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
  
  /** An event can contain icon label. */
  var icon: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.native
  
  /** An event can contain image label. */
  var image: js.UndefOr[SemanticShorthandItem[FeedLabelProps]] = js.native
  
  /** Shorthand for FeedMeta. */
  var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.native
  
  /** Shorthand for FeedSummary. */
  var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.native
}
object StrictFeedEventProps {
  
  @scala.inline
  def apply(): StrictFeedEventProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFeedEventProps]
  }
  
  @scala.inline
  implicit class StrictFeedEventPropsOps[Self <: StrictFeedEventProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction3(
      value: (/* component */ ReactElement, FeedContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("content", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContent(value: SemanticShorthandItem[FeedContentProps]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDateReactElement(value: ReactElement): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFunction3(
      value: (/* component */ ReactElement, FeedDateProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("date", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDate(value: SemanticShorthandItem[FeedDateProps]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setExtraImagesReactElement(value: ReactElement): Self = this.set("extraImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraImagesFunction3(
      value: (/* component */ ReactElement, FeedExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("extraImages", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExtraImages(value: SemanticShorthandItem[FeedExtraProps]): Self = this.set("extraImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraImages: Self = this.set("extraImages", js.undefined)
    
    @scala.inline
    def setExtraTextReactElement(value: ReactElement): Self = this.set("extraText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraTextFunction3(
      value: (/* component */ ReactElement, FeedExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("extraText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExtraText(value: SemanticShorthandItem[FeedExtraProps]): Self = this.set("extraText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraText: Self = this.set("extraText", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconFunction3(
      value: (/* component */ ReactElement, FeedLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("icon", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIcon(value: SemanticShorthandItem[FeedLabelProps]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setImageReactElement(value: ReactElement): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFunction3(
      value: (/* component */ ReactElement, FeedLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("image", js.Any.fromFunction3(value))
    
    @scala.inline
    def setImage(value: SemanticShorthandItem[FeedLabelProps]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setMetaReactElement(value: ReactElement): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaFunction3(
      value: (/* component */ ReactElement, FeedMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("meta", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMeta(value: SemanticShorthandItem[FeedMetaProps]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setSummaryReactElement(value: ReactElement): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryFunction3(
      value: (/* component */ ReactElement, FeedSummaryProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("summary", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSummary(value: SemanticShorthandItem[FeedSummaryProps]): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
