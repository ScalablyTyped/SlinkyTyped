package typingsSlinky.std

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

object MediaKeySystemAccess {
  @scala.inline
  def apply(
    createMediaKeys: () => js.Promise[MediaKeys],
    getConfiguration: () => MediaKeySystemConfiguration,
    keySystem: java.lang.String
  ): MediaKeySystemAccess = {
    val __obj = js.Dynamic.literal(createMediaKeys = js.Any.fromFunction0(createMediaKeys), getConfiguration = js.Any.fromFunction0(getConfiguration), keySystem = keySystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemAccess]
  }
  @scala.inline
  implicit class MediaKeySystemAccessOps[Self <: MediaKeySystemAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateMediaKeys(value: () => js.Promise[MediaKeys]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMediaKeys")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConfiguration(value: () => MediaKeySystemConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfiguration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKeySystem(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySystem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

