package typingsSlinky.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialAttachmentKind extends js.Object
@JSGlobal("SP.Social.SocialAttachmentKind")
@js.native
object SocialAttachmentKind extends js.Object {
  
  @js.native
  sealed trait document extends SocialAttachmentKind
  
  @js.native
  sealed trait image extends SocialAttachmentKind
  
  @js.native
  sealed trait video extends SocialAttachmentKind
}
