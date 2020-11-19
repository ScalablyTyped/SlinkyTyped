package typingsSlinky.steamTotp

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steam-totp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def generateAuthCode(secret: String): String = js.native
  def generateAuthCode(secret: String, timeOffset: Double): String = js.native
  def generateAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  
  def generateConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  def generateConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  
  def getAuthCode(secret: String): String = js.native
  def getAuthCode(secret: String, timeOffset: Double): String = js.native
  def getAuthCode(secret: String, timeOffset: TimeOffsetFunction): String = js.native
  
  def getConfirmationKey(identitySecret: String, time: Double, tag: String): String = js.native
  def getConfirmationKey(identitySecret: Buffer, time: Double, tag: String): String = js.native
  
  def getDeviceID(steamID: String): String = js.native
  def getDeviceID(steamID: js.Object): String = js.native
  
  def getTimeOffset(
    callback: js.Function3[
      /* error */ js.Error, 
      /* offset */ js.UndefOr[Double], 
      /* elapsedTime */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  def time(): Double = js.native
  def time(timeOffset: Double): Double = js.native
  
  type TimeOffsetFunction = js.Function0[Double]
}
