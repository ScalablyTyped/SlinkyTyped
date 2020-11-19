package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.statisticGroupMod.StatisticGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatisticGroup {
  
  @JSImport("semantic-ui-react", "StatisticGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: StatisticGroupProps): SharedBuilder_StatisticGroupProps_674403293 = new SharedBuilder_StatisticGroupProps_674403293(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StatisticGroup.type): SharedBuilder_StatisticGroupProps_674403293 = new SharedBuilder_StatisticGroupProps_674403293(js.Array(this.component, js.Dictionary.empty))()
}
