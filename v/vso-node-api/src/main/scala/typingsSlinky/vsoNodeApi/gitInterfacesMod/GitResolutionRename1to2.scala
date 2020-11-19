package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitResolutionRename1to2 extends GitResolutionMergeContent {
  
  var action: GitResolutionRename1to2Action = js.native
}
object GitResolutionRename1to2 {
  
  @scala.inline
  def apply(
    action: GitResolutionRename1to2Action,
    mergeType: GitResolutionMergeType,
    userMergedBlob: GitBlobRef,
    userMergedContent: js.Array[Double]
  ): GitResolutionRename1to2 = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionRename1to2]
  }
  
  @scala.inline
  implicit class GitResolutionRename1to2Ops[Self <: GitResolutionRename1to2] (val x: Self) extends AnyVal {
    
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
    def setAction(value: GitResolutionRename1to2Action): Self = this.set("action", value.asInstanceOf[js.Any])
  }
}
