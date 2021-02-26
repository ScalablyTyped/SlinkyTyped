package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.commentActionMod.CommentActionProps
import typingsSlinky.semanticUiReact.commentActionsMod.CommentActionsProps
import typingsSlinky.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typingsSlinky.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typingsSlinky.semanticUiReact.commentContentMod.CommentContentProps
import typingsSlinky.semanticUiReact.commentGroupMod.CommentGroupProps
import typingsSlinky.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typingsSlinky.semanticUiReact.commentTextMod.CommentTextProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentCommentMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", JSImport.Default)
    @js.native
    val ^ : CommentComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", "default.Action")
    @js.native
    class Action protected ()
      extends Component[CommentActionProps, js.Object, js.Any] {
      def this(props: CommentActionProps) = this()
      def this(props: CommentActionProps, context: js.Any) = this()
    }
    
    type _To = CommentComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CommentComponent = ^
  }
  
  @js.native
  trait CommentComponent extends FunctionComponent[CommentProps] {
    
    var Action: ReactComponentClass[CommentActionProps] = js.native
    
    var Actions: ReactComponentClass[CommentActionsProps] = js.native
    
    var Author: ReactComponentClass[CommentAuthorProps] = js.native
    
    var Avatar: ReactComponentClass[CommentAvatarProps] = js.native
    
    var Content: ReactComponentClass[CommentContentProps] = js.native
    
    var Group: ReactComponentClass[CommentGroupProps] = js.native
    
    var Metadata: ReactComponentClass[CommentMetadataProps] = js.native
    
    var Text: ReactComponentClass[CommentTextProps] = js.native
  }
  
  @js.native
  trait CommentProps
    extends StrictCommentProps
       with /* key */ StringDictionary[js.Any]
  object CommentProps {
    
    @scala.inline
    def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
  }
  
  @js.native
  trait StrictCommentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Comment can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictCommentProps {
    
    @scala.inline
    def apply(): StrictCommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentProps]
    }
    
    @scala.inline
    implicit class StrictCommentPropsMutableBuilder[Self <: StrictCommentProps] (val x: Self) extends AnyVal {
      
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
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
}
