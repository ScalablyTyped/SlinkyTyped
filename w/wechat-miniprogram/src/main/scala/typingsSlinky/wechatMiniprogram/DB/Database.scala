package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class of all exposed cloud database instances
  */
@js.native
trait Database extends js.Object {
  val Geo: IGeo = js.native
  @JSName("RegExp")
  val RegExp_Original: IRegExpConstructor = js.native
  val command: DatabaseCommand = js.native
  val config: ICloudConfig = js.native
  def RegExp(options: IRegExpOptions): typingsSlinky.wechatMiniprogram.DB.RegExp = js.native
  def collection(collectionName: String): CollectionReference = js.native
  def serverDate(): ServerDate = js.native
}

