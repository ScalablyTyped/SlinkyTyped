package typingsSlinky.winrt.Windows.Networking

import typingsSlinky.winrt.Windows.Networking.Connectivity.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHostName extends js.Object {
  var canonicalName: String = js.native
  var displayName: String = js.native
  var iPInformation: IPInformation = js.native
  var rawName: String = js.native
  var `type`: HostNameType = js.native
  def isEqual(hostName: HostName): Boolean = js.native
}

object IHostName {
  @scala.inline
  def apply(
    canonicalName: String,
    displayName: String,
    iPInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): IHostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], iPInformation = iPInformation.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), rawName = rawName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHostName]
  }
  @scala.inline
  implicit class IHostNameOps[Self <: IHostName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPInformation(value: IPInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iPInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEqual(value: HostName => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRawName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: HostNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

