package typingsSlinky.semanticUiReact.feedSummaryMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictFeedSummaryProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** Shorthand for FeedDate. */
  var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.native
  
  /** Shorthand for FeedUser. */
  var user: js.UndefOr[SemanticShorthandItem[FeedUserProps]] = js.native
}
object StrictFeedSummaryProps {
  
  @scala.inline
  def apply(): StrictFeedSummaryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFeedSummaryProps]
  }
  
  @scala.inline
  implicit class StrictFeedSummaryPropsOps[Self <: StrictFeedSummaryProps] (val x: Self) extends AnyVal {
    
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
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
    def setUserReactElement(value: ReactElement): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFunction3(
      value: (/* component */ ReactElement, FeedUserProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("user", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUser(value: SemanticShorthandItem[FeedUserProps]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
