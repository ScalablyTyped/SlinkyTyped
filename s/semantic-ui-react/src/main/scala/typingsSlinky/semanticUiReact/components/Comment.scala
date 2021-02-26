package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.commentActionMod.CommentActionProps
import typingsSlinky.semanticUiReact.commentActionsMod.CommentActionsProps
import typingsSlinky.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typingsSlinky.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typingsSlinky.semanticUiReact.commentCommentMod.CommentProps
import typingsSlinky.semanticUiReact.commentContentMod.CommentContentProps
import typingsSlinky.semanticUiReact.commentGroupMod.CommentGroupProps
import typingsSlinky.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typingsSlinky.semanticUiReact.commentTextMod.CommentTextProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comment {
  
  object Action {
    
    @JSImport("semantic-ui-react", "Comment.Action")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Action.type): SharedBuilder_CommentActionProps_585242798[typingsSlinky.semanticUiReact.mod.Comment.Action] = new SharedBuilder_CommentActionProps_585242798[typingsSlinky.semanticUiReact.mod.Comment.Action](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentActionProps): SharedBuilder_CommentActionProps_585242798[typingsSlinky.semanticUiReact.mod.Comment.Action] = new SharedBuilder_CommentActionProps_585242798[typingsSlinky.semanticUiReact.mod.Comment.Action](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Actions {
    
    @JSImport("semantic-ui-react", "Comment.Actions")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Actions.type): SharedBuilder_CommentActionsProps_2089688949 = new SharedBuilder_CommentActionsProps_2089688949(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentActionsProps): SharedBuilder_CommentActionsProps_2089688949 = new SharedBuilder_CommentActionsProps_2089688949(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Author {
    
    @JSImport("semantic-ui-react", "Comment.Author")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Author.type): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentAuthorProps): SharedBuilder_CommentAuthorProps86975002 = new SharedBuilder_CommentAuthorProps86975002(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Avatar {
    
    @JSImport("semantic-ui-react", "Comment.Avatar")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Avatar.type): SharedBuilder_CommentAvatarProps1848801338 = new SharedBuilder_CommentAvatarProps1848801338(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentAvatarProps): SharedBuilder_CommentAvatarProps1848801338 = new SharedBuilder_CommentAvatarProps1848801338(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("semantic-ui-react", "Comment.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_CommentContentProps_449648905 = new SharedBuilder_CommentContentProps_449648905(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentContentProps): SharedBuilder_CommentContentProps_449648905 = new SharedBuilder_CommentContentProps_449648905(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Group {
    
    @JSImport("semantic-ui-react", "Comment.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_CommentGroupProps_118858188 = new SharedBuilder_CommentGroupProps_118858188(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentGroupProps): SharedBuilder_CommentGroupProps_118858188 = new SharedBuilder_CommentGroupProps_118858188(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Metadata {
    
    @JSImport("semantic-ui-react", "Comment.Metadata")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Metadata.type): SharedBuilder_CommentMetadataProps9012462 = new SharedBuilder_CommentMetadataProps9012462(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentMetadataProps): SharedBuilder_CommentMetadataProps9012462 = new SharedBuilder_CommentMetadataProps9012462(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("semantic-ui-react", "Comment.Text")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Text.type): SharedBuilder_CommentTextProps_1587354396 = new SharedBuilder_CommentTextProps_1587354396(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: CommentTextProps): SharedBuilder_CommentTextProps_1587354396 = new SharedBuilder_CommentTextProps_1587354396(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Comment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Comment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
