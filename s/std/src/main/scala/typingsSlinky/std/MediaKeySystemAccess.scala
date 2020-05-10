package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method. */
@js.native
trait MediaKeySystemAccess extends js.Object {
  val keySystem: java.lang.String = js.native
  def createMediaKeys(): js.Promise[MediaKeys] = js.native
  def getConfiguration(): MediaKeySystemConfiguration = js.native
}

@JSGlobal("MediaKeySystemAccess")
@js.native
object MediaKeySystemAccess extends Instantiable0[MediaKeySystemAccess]

