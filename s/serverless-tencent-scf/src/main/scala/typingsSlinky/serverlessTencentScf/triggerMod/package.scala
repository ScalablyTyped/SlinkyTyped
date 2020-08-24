package typingsSlinky.serverlessTencentScf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object triggerMod {
  type APIGatewayHandler[T] = typingsSlinky.serverlessTencentScf.handlerMod.Handler[typingsSlinky.serverlessTencentScf.triggerMod.APIGatewayEvent, T]
  type CKafkaHandler[T] = typingsSlinky.serverlessTencentScf.handlerMod.Handler[typingsSlinky.serverlessTencentScf.triggerMod.CKafkaEvent, T]
  type CMQTopicHandler[T] = typingsSlinky.serverlessTencentScf.handlerMod.Handler[typingsSlinky.serverlessTencentScf.triggerMod.CMQTopicEvent, T]
  type COSHandler[T] = typingsSlinky.serverlessTencentScf.handlerMod.Handler[typingsSlinky.serverlessTencentScf.triggerMod.COSEvent, T]
  type TimerHandler[T] = typingsSlinky.serverlessTencentScf.handlerMod.Handler[typingsSlinky.serverlessTencentScf.triggerMod.TimerEvent, T]
}
