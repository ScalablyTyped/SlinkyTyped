package typingsSlinky.vkOpenapi.vk.OpenAPI

import typingsSlinky.vkOpenapi.vk.OpenAPI.Api.API
import typingsSlinky.vkOpenapi.vk.OpenAPI.Goal.GoalEvent
import typingsSlinky.vkOpenapi.vk.OpenAPI.Goal.GoalParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API_ extends js.Object {
  var Api: API = js.native
  var Auth: typingsSlinky.vkOpenapi.vk.OpenAPI.Auth.API = js.native
  @JSName("Goal")
  var Goal_Original: typingsSlinky.vkOpenapi.vk.OpenAPI.Goal.API = js.native
  var Observer: typingsSlinky.vkOpenapi.vk.OpenAPI.Observer.API = js.native
  var Retargeting: typingsSlinky.vkOpenapi.vk.OpenAPI.Retargeting.API = js.native
  var Widgets: typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets.API = js.native
  def Goal(goalEvent: GoalEvent): Unit = js.native
  def Goal(goalEvent: GoalEvent, goalParams: GoalParams): Unit = js.native
  def init(params: InitParams): Unit = js.native
}

