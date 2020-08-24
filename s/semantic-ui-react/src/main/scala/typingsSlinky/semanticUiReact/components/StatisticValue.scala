package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.statisticValueMod.StatisticValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatisticValue {
  @JSImport("semantic-ui-react", "StatisticValue")
  @js.native
  object component extends js.Object
  
  def withProps(p: StatisticValueProps): SharedBuilder_StatisticValueProps1818019187 = new SharedBuilder_StatisticValueProps1818019187(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatisticValue.type): SharedBuilder_StatisticValueProps1818019187 = new SharedBuilder_StatisticValueProps1818019187(js.Array(this.component, js.Dictionary.empty))()
}

