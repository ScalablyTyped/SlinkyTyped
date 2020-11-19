package typingsSlinky.semanticUiReact.commentCommentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.commentActionMod.CommentActionProps
import typingsSlinky.semanticUiReact.commentActionsMod.CommentActionsProps
import typingsSlinky.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typingsSlinky.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typingsSlinky.semanticUiReact.commentContentMod.CommentContentProps
import typingsSlinky.semanticUiReact.commentGroupMod.CommentGroupProps
import typingsSlinky.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typingsSlinky.semanticUiReact.commentTextMod.CommentTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
