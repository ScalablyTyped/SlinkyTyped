package typingsSlinky.webpackErrorNotification

import typingsSlinky.webpackErrorNotification.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webpackErrorNotificationStrings {
  @js.native
  sealed trait darwin extends Strategy
  
  @js.native
  sealed trait linux extends Strategy
  
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
}

