package typingsSlinky.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialAttachmentActionKind extends js.Object
/** Specifies whether the action is to navigate to the attachment or to perform some action dependent on the context in which the attachment is presented to the user. */
@JSGlobal("SP.Social.SocialAttachmentActionKind")
@js.native
object SocialAttachmentActionKind extends js.Object {
  
  /** This value specifies that the action is dependent on the context that the attachment is displayed to the user. */
  @js.native
  sealed trait adHocAction extends SocialAttachmentActionKind
  
  /** This value specifies that the action is to navigate to the attachment. */
  @js.native
  sealed trait navigate extends SocialAttachmentActionKind
}
