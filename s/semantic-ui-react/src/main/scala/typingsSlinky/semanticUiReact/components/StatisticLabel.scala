package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.statisticLabelMod.StatisticLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatisticLabel {
  
  @JSImport("semantic-ui-react", "StatisticLabel")
  @js.native
  object component extends js.Object
  
  def withProps(p: StatisticLabelProps): SharedBuilder_StatisticLabelProps_60047603 = new SharedBuilder_StatisticLabelProps_60047603(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StatisticLabel.type): SharedBuilder_StatisticLabelProps_60047603 = new SharedBuilder_StatisticLabelProps_60047603(js.Array(this.component, js.Dictionary.empty))()
}
