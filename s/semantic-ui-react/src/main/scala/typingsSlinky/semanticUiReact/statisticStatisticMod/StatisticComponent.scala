package typingsSlinky.semanticUiReact.statisticStatisticMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typingsSlinky.semanticUiReact.statisticLabelMod.StatisticLabelProps
import typingsSlinky.semanticUiReact.statisticValueMod.StatisticValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticComponent extends FunctionComponent[StatisticProps] {
  var Group: ReactComponentClass[StatisticGroupProps] = js.native
  var Label: ReactComponentClass[StatisticLabelProps] = js.native
  var Value: ReactComponentClass[StatisticValueProps] = js.native
}

