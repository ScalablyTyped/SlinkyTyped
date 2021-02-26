package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 用户过去三十天的微信运动步数 */
@js.native
trait StepInfoList extends StObject {
  
  var stepInfoList: js.Array[StepInfo] = js.native
}
object StepInfoList {
  
  @scala.inline
  def apply(stepInfoList: js.Array[StepInfo]): StepInfoList = {
    val __obj = js.Dynamic.literal(stepInfoList = stepInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInfoList]
  }
  
  @scala.inline
  implicit class StepInfoListMutableBuilder[Self <: StepInfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStepInfoList(value: js.Array[StepInfo]): Self = StObject.set(x, "stepInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepInfoListVarargs(value: StepInfo*): Self = StObject.set(x, "stepInfoList", js.Array(value :_*))
  }
}
